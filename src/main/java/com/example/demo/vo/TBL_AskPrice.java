package com.example.demo.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.ToString;

@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class TBL_AskPrice {
	@XmlElement(name = "AskPrice")
	public List<AskPrice> AskPrice;
}
