package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.vo.StockPrice;

import reactor.core.publisher.Flux;

@Controller
public class MainController {

	@GetMapping(path = "/test/{stock_num}")
	public Flux<StockPrice> stockPrice2(@PathVariable(name = "stock_num") int stock_num) {
		return Flux.interval(Duration.ofSeconds(1)).map(x -> getStockInfo(stock_num));
	}

	@GetMapping(path = "/main/{stock_num}")
	public String main(final Model model, @PathVariable(name = "stock_num") int stock_num) {
		model.addAttribute("stock_num", stock_num);
		return "Main";
	}

	public StockPrice getStockInfo(int stock_num) {

		String urlStr = "http://asp1.krx.co.kr/servlet/krx.asp.XMLSise?code=" + stock_num;

		URL url = null;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e3) {
			e3.printStackTrace();
		}

		URLConnection connection = null;
		try {
			connection = url.openConnection();
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		connection.setDoOutput(true);

		connection.setRequestProperty("CONTENT-TYPE", "text/xml");

		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
		} catch (UnsupportedEncodingException e3) {
			e3.printStackTrace();
		} catch (IOException e3) {
			e3.printStackTrace();
		}

		String inputLine;
		String buffer = "";

		try {
			inputLine = in.readLine();
			while ((inputLine = in.readLine()) != null) {
				buffer += inputLine.trim();
				buffer += "\n";
			}
		} catch (IOException e3) {
			e3.printStackTrace();
		}

		try {
			in.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		InputStream inputStream = null;

		inputStream = new ByteArrayInputStream(buffer.getBytes());

		StockPrice stockPrice = null;

		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(StockPrice.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		try {
			stockPrice = (StockPrice) jaxbContext.createUnmarshaller().unmarshal(inputStream);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return stockPrice;
	}
}
