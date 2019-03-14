package com.mrwang.beans;

/**
 * 产品详情
 * @author Administrator
 *
 */
public class Details {
	//主键
	private String detailsId;
	//详情名
	private String detailsName;
	//创建时间
	private String detailsCreateDate;
	//更新时间
	private String detailsUpdateDate; 
	//价格
	private String detailsPrice;
	//描述
	private String detailsDescribe;
	//库存
	private int inventory;
	//视屏
	private String picturesShowFive;
	//图片4
	private String picturesShowfour;
	//图片3
	private String picturesShowThree;
	//图片2
	private String picturesShowTwo;
	//图片1
	private String picturesShowOne;
	//细节图片id
	private int imgsId;
	//细节图片类
	private ProductDetails pd;
	
	public Details() {
		super();
	}
	public Details(String detailsName, String detailsCreateDate, String detailsUpdateDate,
			String detailsPrice, String detailsDescribe) {
		super();
		this.detailsName = detailsName;
		this.detailsCreateDate = detailsCreateDate;
		this.detailsUpdateDate = detailsUpdateDate; 
		this.detailsPrice = detailsPrice;
		this.detailsDescribe = detailsDescribe;
	}
	public String getDetailsId() {
		return detailsId;
	}
	public void setDetailsId(String detailsId) {
		this.detailsId = detailsId;
	}
	public String getDetailsName() {
		return detailsName;
	}
	public void setDetailsName(String detailsName) {
		this.detailsName = detailsName;
	}
	public String getDetailsCreateDate() {
		return detailsCreateDate;
	}
	public void setDetailsCreateDate(String detailsCreateDate) {
		this.detailsCreateDate = detailsCreateDate;
	}
	public String getDetailsUpdateDate() {
		return detailsUpdateDate;
	}
	public void setDetailsUpdateDate(String detailsUpdateDate) {
		this.detailsUpdateDate = detailsUpdateDate;
	}
	public String getDetailsPrice() {
		return detailsPrice;
	}
	public void setDetailsPrice(String detailsPrice) {
		this.detailsPrice = detailsPrice;
	}
	public String getDetailsDescribe() {
		return detailsDescribe;
	}
	public void setDetailsDescribe(String detailsDescribe) {
		this.detailsDescribe = detailsDescribe;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public String getPicturesShowFive() {
		return picturesShowFive;
	}
	public void setPicturesShowFive(String picturesShowFive) {
		this.picturesShowFive = picturesShowFive;
	}
	public String getPicturesShowfour() {
		return picturesShowfour;
	}
	public void setPicturesShowfour(String picturesShowfour) {
		this.picturesShowfour = picturesShowfour;
	}
	public String getPicturesShowThree() {
		return picturesShowThree;
	}
	public void setPicturesShowThree(String picturesShowThree) {
		this.picturesShowThree = picturesShowThree;
	}
	public String getPicturesShowTwo() {
		return picturesShowTwo;
	}
	public void setPicturesShowTwo(String picturesShowTwo) {
		this.picturesShowTwo = picturesShowTwo;
	}
	public String getPicturesShowOne() {
		return picturesShowOne;
	}
	public void setPicturesShowOne(String picturesShowOne) {
		this.picturesShowOne = picturesShowOne;
	}
	public int getImgsId() {
		return imgsId;
	}
	public void setImgsId(int imgsId) {
		this.imgsId = imgsId;
	}
	public ProductDetails getPd() {
		return pd;
	}
	public void setPd(ProductDetails pd) {
		this.pd = pd;
	}
	
	
}
