package com.oracle.ms.elastic.service;

import com.oracle.ms.elastic.model.ICSAssetRequestDTO;

public interface AssetService {

	ICSAssetRequestDTO save(ICSAssetRequestDTO asset);
	
	ICSAssetRequestDTO findById(String id);
}
