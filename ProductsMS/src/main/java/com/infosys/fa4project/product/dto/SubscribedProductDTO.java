package com.infosys.fa4project.product.dto;

import com.infosys.fa4project.product.entity.SubscribedProduct;

public class SubscribedProductDTO {
	
	Integer prodid;
	
	Integer buyerid;
	
	Integer quantity;


	public Integer getProdid() {
		return prodid;
	}

	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}

	public Integer getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(Integer buyerid) {
		this.buyerid = buyerid;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public SubscribedProductDTO() {
		super();
	}
	
	public static SubscribedProductDTO valueOf(SubscribedProduct subscribedProduct) {
		SubscribedProductDTO subscribedProductDTO = new SubscribedProductDTO();
		subscribedProductDTO.setProdid(subscribedProduct.getMyKey().getProdid());
		subscribedProductDTO.setBuyerid(subscribedProduct.getMyKey().getBuyerid());
		subscribedProductDTO.setQuantity(subscribedProduct.getQuantity());
		return subscribedProductDTO;
	}
}
