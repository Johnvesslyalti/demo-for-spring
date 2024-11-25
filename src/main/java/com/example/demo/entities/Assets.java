package com.example.demo.entities;

public class Assets {
	private int assetId;
	private String assetName;
	private String assetPrice;
	public Assets(int assetId, String assetName, String assetPrice) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetPrice = assetPrice;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetPrice() {
		return assetPrice;
	}
	public void setAssetPrice(String assetPrice) {
		this.assetPrice = assetPrice;
	}
	
	
}
