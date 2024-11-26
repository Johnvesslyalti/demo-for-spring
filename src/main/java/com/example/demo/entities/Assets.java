package com.example.demo.entities;

public class Assets {
    private int assetId;
    private String assetName;
    private double assetPrice;  // Changed to double for better handling of prices

    public Assets(int assetId, String assetName, double assetPrice) {
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

    public double getAssetPrice() {
        return assetPrice;
    }

    public void setAssetPrice(double assetPrice) {
        this.assetPrice = assetPrice;
    }

    @Override
    public String toString() {
        return "Assets [assetId=" + assetId + ", assetName=" + assetName + ", assetPrice=" + assetPrice + "]";
    }
}
