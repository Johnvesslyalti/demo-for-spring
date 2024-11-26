package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Assets;
import com.example.demo.services.AssetService;

@RequestMapping("/assets/")
@RestController
@CrossOrigin("*")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @GetMapping("getAll")
    public List<Assets> assetServices() {
        return assetService.getAssets();
    }

    @PostMapping("addAssets")
    public int addAsset(@RequestBody Assets assets) {
        // You might want to implement the logic to add the asset to a database or in-memory store
        System.out.println("Adding Asset: " + assets.getAssetName());
        return 10; // Simulated response
    }

    @GetMapping(value = "assets/{assetId}")
    public Assets getAsset(@PathVariable int assetId) {
        List<Assets> allAssets = assetService.getAssets();
        for (Assets asset : allAssets) {
            if (asset.getAssetId() == assetId) {
                return asset;
            }
        }
        return null;  // Or throw a custom exception if not found
    }
}
