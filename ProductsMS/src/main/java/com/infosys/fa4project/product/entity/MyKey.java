package com.infosys.fa4project.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class MyKey implements Serializable{
	
	@Column(name="buyerid", nullable=false)
	Integer buyerid;
	@Column(name="prodid", nullable=false)
	Integer prodid;
	public Integer getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(Integer buyerid) {
		this.buyerid = buyerid;
	}
	public Integer getProdid() {
		return prodid;
	}
	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}
	
	
}