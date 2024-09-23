package com.demo.InventoryMicroService.service;

import com.demo.InventoryMicroService.dao.Inventory;
import com.demo.InventoryMicroService.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    // Retrieve all inventory records
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    // Retrieve an inventory record by its ID
    public Inventory getInventoryById(Integer id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    // Add a new inventory record
    public Inventory addInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    // Retrieve inventory records by location (custom method)
    public List<Inventory> getInventoryByLocation(String location) {
        return inventoryRepository.findByInventoryLocation(location);
    }
}
