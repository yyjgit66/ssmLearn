package com.mrwang.beans;

/**
 * 产品表
 * @author Administrator
 *
 */
public class Product {
	//主键
	private int productId;
	//产品名字
	private String productName;
	//创建日期
	private String productCreateDate;
	//修改日期
	private String productUpdateDate;
	//图片路径
	private String productImagePath;
	//详情id
	private int productDetailsId; 
 
	public Product() {
		super();
	}
	public Product(String productName, String productCreateDate, String productUpdateDate, String productImagePath,
			int productDetailsId) {
		super();
		this.productName = productName;
		this.productCreateDate = productCreateDate;
		this.productUpdateDate = productUpdateDate;
		this.productImagePath = productImagePath;
		this.productDetailsId = productDetailsId; 
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCreateDate() {
		return productCreateDate;
	}
	public void setProductCreateDate(String productCreateDate) {
		this.productCreateDate = productCreateDate;
	}
	public String getProductUpdateDate() {
		return productUpdateDate;
	}
	public void setProductUpdateDate(String productUpdateDate) {
		this.productUpdateDate = productUpdateDate;
	}
	public String getProductImagePath() {
		return productImagePath;
	}
	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}
	public int getProductDetailsId() {
		return productDetailsId;
	}
	public void setProductDetailsId(int productDetailsId) {
		this.productDetailsId = productDetailsId;
	}
	 
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	  
}
