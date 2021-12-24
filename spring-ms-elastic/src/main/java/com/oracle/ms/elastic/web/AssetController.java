package com.oracle.ms.elastic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.ms.elastic.model.ICSAssetRequestDTO;
import com.oracle.ms.elastic.service.AssetService;

@RestController
@RequestMapping("asset-rest")
public class AssetController {

	private AssetService service;

	@Autowired
	public AssetController(AssetService service) {
		this.service = service;
	}

	@GetMapping("/{id}")
	public ICSAssetRequestDTO find(@PathVariable String id) {
		return service.findById(id);

	}

	@PostMapping("/asset")
	public void insert(@RequestBody ICSAssetRequestDTO dto) {
		service.save(dto);
	}
}
