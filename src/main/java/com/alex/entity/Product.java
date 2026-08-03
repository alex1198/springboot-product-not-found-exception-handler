package com.alex.entity;

public class Product {
	


	private Long productId;
	private String productName;
	
	public Product()
	{
		
	}
	
	/**
	 * @param productId
	 * @param productName
	 */
	public Product(Long productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
