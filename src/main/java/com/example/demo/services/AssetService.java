package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.example.demo.entities.Assets;

@Service
public class AssetService {
	public ArrayList<Assets> getAssetServiceData(){
		ArrayList<Assets> assets = new ArrayList<Assets>();
		assets.add(new Assets(1, "Laptop", "100,000"));
		return assets;
	}
}
