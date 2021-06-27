package com.example.demo.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.ToString;

@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class DailyStock {

	@XmlAttribute(name = "day_Date")
	public String day_Date;
	@XmlAttribute(name = "day_EndPrice")
	public String day_EndPrice;
	@XmlAttribute(name = "day_Dungrak")
	public String day_Dungrak;
	@XmlAttribute(name = "day_getDebi")
	public String day_getDebi;
	@XmlAttribute(name = "day_Start")
	public String day_Start;
	@XmlAttribute(name = "day_High")
	public String day_High;
	@XmlAttribute(name = "day_Low")
	public String day_Low;
	@XmlAttribute(name = "day_Volume")
	public String day_Volume;
	@XmlAttribute(name = "day_getAmount")
	public String day_getAmount;

}
