package com.oracle.ms.elastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.oracle.ms.elastic.model.ICSAssetRequestDTO;

public interface AssetRepository extends ElasticsearchRepository<ICSAssetRequestDTO, String> {

}
