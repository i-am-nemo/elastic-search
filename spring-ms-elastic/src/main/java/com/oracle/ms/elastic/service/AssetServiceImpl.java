package com.oracle.ms.elastic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.ms.elastic.model.ICSAssetRequestDTO;
import com.oracle.ms.elastic.repository.AssetRepository;

@Service
public class AssetServiceImpl implements AssetService {
	
	private AssetRepository repository;

	@Autowired
	public AssetServiceImpl(AssetRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public ICSAssetRequestDTO save(ICSAssetRequestDTO asset) {
		return repository.save(asset);
	}

	@Override
	public ICSAssetRequestDTO findById(String id) {
		return repository.findById(id).get();
	}

}
