package com.example.demo.services;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.example.demo.entities.Assets;

@Service
public class AssetService {

    public List<Assets> getAssets() {
        List<Assets> assets = new ArrayList<>();
        assets.add(new Assets(1, "Laptop", 100000.0));
        assets.add(new Assets(2, "Projector", 150000.0));
        assets.add(new Assets(3, "Chairs", 15000.0));
        assets.add(new Assets(4, "Tables", 10000.0));
        return assets;
    }
}
