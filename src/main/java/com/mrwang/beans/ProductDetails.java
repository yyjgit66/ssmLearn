package com.mrwang.beans;

public class ProductDetails {
	private int pdId;
	private String pdImgOne;
	private String pdImgTwo;
	private String pdImgThree;
	private String pdImgFour;
	public ProductDetails(int pdId, String pdImgOne, String pdImgTwo, String pdImgThree, String pdImgFour) {
		super();
		this.pdId = pdId;
		this.pdImgOne = pdImgOne;
		this.pdImgTwo = pdImgTwo;
		this.pdImgThree = pdImgThree;
		this.pdImgFour = pdImgFour;
	}
	public ProductDetails() {
		super();
	}
	public int getPdId() {
		return pdId;
	}
	public void setPdId(int pdId) {
		this.pdId = pdId;
	}
	public String getPdImgOne() {
		return pdImgOne;
	}
	public void setPdImgOne(String pdImgOne) {
		this.pdImgOne = pdImgOne;
	}
	public String getPdImgTwo() {
		return pdImgTwo;
	}
	public void setPdImgTwo(String pdImgTwo) {
		this.pdImgTwo = pdImgTwo;
	}
	public String getPdImgThree() {
		return pdImgThree;
	}
	public void setPdImgThree(String pdImgThree) {
		this.pdImgThree = pdImgThree;
	}
	public String getPdImgFour() {
		return pdImgFour;
	}
	public void setPdImgFour(String pdImgFour) {
		this.pdImgFour = pdImgFour;
	}
	

}
