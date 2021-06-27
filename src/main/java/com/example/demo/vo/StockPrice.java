package com.example.demo.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.ToString;

@ToString
@XmlRootElement(name = "stockprice")
@XmlAccessorType(XmlAccessType.FIELD)
public class StockPrice {

	@XmlAttribute(name = "querytime")
	public String querytime;
	@XmlElement(name = "TBL_AskPrice")
	public TBL_AskPrice TBL_AskPrice;
	@XmlElement(name = "TBL_DailyStock")
	public TBL_DailyStock TBL_DailyStock;
	@XmlElement(name = "TBL_Hoga")
	public TBL_Hoga TBL_Hoga;
	@XmlElement(name = "TBL_StockInfo")
	public TBL_StockInfo TBL_StockInfo;
	@XmlElement(name = "TBL_TimeConclude")
	public TBL_TimeConclude TBL_TimeConclude;
	@XmlElement(name = "stockInfo")
	public StockInfo StockInfo;
}
