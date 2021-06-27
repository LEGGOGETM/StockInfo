package com.example.demo.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import lombok.ToString;

@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class AskPrice {
	@XmlAttribute(name = "member_memdoMem")
	public String member_memdoMem;
	@XmlAttribute(name = "member_memdoVol")
	public String member_memdoVol;
	@XmlAttribute(name = "member_memsoMem")
	public String member_memsoMem;
	@XmlAttribute(name = "member_mesuoVol")
	public String member_mesuoVol;

}
