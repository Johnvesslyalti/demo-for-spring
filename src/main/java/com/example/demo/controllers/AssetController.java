package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Assets;
import com.example.demo.services.*;


@RequestMapping("/assets/")
@RestController
@CrossOrigin("*")
public class AssetController {

	@Autowired
	public AssetService assetServiceData;
	
	@GetMapping("getAll")
	public ArrayList<Assets> assetServices(){
		return assetServiceData.getAssetServiceData();
	}
}
