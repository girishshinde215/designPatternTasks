package com.ct.dao;

import com.ct.Model.Asset;

public interface AssetDao {

	public void addAsset(Asset asset);
	
	public Asset getAssetDetailsWithMaxPrice();
	
}
