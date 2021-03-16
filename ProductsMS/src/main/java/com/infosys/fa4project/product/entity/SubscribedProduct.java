package com.infosys.fa4project.product.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "subscribedproduct")
public class SubscribedProduct {
	
	@Column(nullable=false)
	Integer quantity;
	
	@EmbeddedId
	private MyKey myKey;
	
	public MyKey getMyKey() {
		return myKey;
	}
	public void setMyKey(MyKey myKey) {
		this.myKey=myKey;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public SubscribedProduct() {
		super();
	}
	
}
