package com.example.demo.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.ToString;

@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class TBL_StockInfo {
	@XmlAttribute(name = "JongName")
	public String JongName;
	@XmlAttribute(name = "CurJuka")
	public String CurJuka;
	@XmlAttribute(name = "DungRak")
	public String DungRak;
	@XmlAttribute(name = "Debi")
	public String Debi;
	@XmlAttribute(name = "PrevJuka")
	public String PrevJuka;
	@XmlAttribute(name = "Volume")
	public String Volume;
	@XmlAttribute(name = "Money")
	public String Money;
	@XmlAttribute(name = "StartJuka")
	public String StartJuka;
	@XmlAttribute(name = "HighJuka")
	public String HighJuka;
	@XmlAttribute(name = "LowJuka")
	public String LowJuka;
	@XmlAttribute(name = "High52")
	public String High52;
	@XmlAttribute(name = "Low52")
	public String Low52;
	@XmlAttribute(name = "UpJuka")
	public String UpJuka;
	@XmlAttribute(name = "DownJuka")
	public String DownJuka;
	@XmlAttribute(name = "Per")
	public String Per;
	@XmlAttribute(name = "Amount")
	public String Amount;
	@XmlAttribute(name = "FaceJuka")
	public String FaceJuka;

}
