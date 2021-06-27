package com.example.demo.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.ToString;

@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class TimeConclude {
	@XmlAttribute(name = "time")
	public String time;
	@XmlAttribute(name = "negoprice")
	public String negoprice;
	@XmlAttribute(name = "Dungrak")
	public String Dungrak;
	@XmlAttribute(name = "Debi")
	public String Debi;
	@XmlAttribute(name = "sellprice")
	public String sellprice;
	@XmlAttribute(name = "buyprice")
	public String buyprice;
	@XmlAttribute(name = "amount")
	public String amount;
}
