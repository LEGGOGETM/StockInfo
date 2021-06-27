package com.example.demo.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.ToString;


@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class StockInfo {
	@XmlAttribute(name = "kosdaqJisu")
	public  String kosdaqJisu;
	@XmlAttribute(name = "kosdaqJisuBuho")
	public  String kosdaqJisuBuho;
	@XmlAttribute(name = "kosdaqJisuDebi")
	public  String kosdaqJisuDebi;
	@XmlAttribute(name = "starJisu")
	public  String starJisu;
	@XmlAttribute(name = "starJisuBuho")
	public  String starJisuBuho;
	@XmlAttribute(name = "starJisuDebi")
	public  String starJisuDebi;
	@XmlAttribute(name = "jisu50")
	public  String jisu50;
	@XmlAttribute(name = "jisu50Buho")
	public  String jisu50Buho;
	@XmlAttribute(name = "jisu50Debi")
	public  String jisu50Debi;
	@XmlAttribute(name = "myNowTime")
	public  String myNowTime;
	@XmlAttribute(name = "myJangGubun")
	public  String myJangGubun;
	@XmlAttribute(name = "myPublicPrice")
	public  String myPublicPrice;
	@XmlAttribute(name = "krx100Jisu")
	public  String krx100Jisu;
	@XmlAttribute(name = "krx100buho")
	public  String krx100buho;
	@XmlAttribute(name = "krx100Debi")
	public  String krx100Debi;
	@XmlAttribute(name = "kospiJisu")
	public  String kospiJisu;
	@XmlAttribute(name = "kospiBuho")
	public  String kospiBuho;
	@XmlAttribute(name = "kospiDebi")
	public  String kospiDebi;
	@XmlAttribute(name = "kospi200Jisu")
	public  String kospi200Jisu;
	@XmlAttribute(name = "kospi200Buho")
	public  String kospi200Buho;
	@XmlAttribute(name = "kospi200Debi")
	public  String kospi200Debi;

}
