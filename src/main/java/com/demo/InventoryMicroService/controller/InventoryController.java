package com.demo.InventoryMicroService.controller;

import com.demo.InventoryMicroService.dao.Inventory;
import com.demo.InventoryMicroService.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    // Get all inventory items
    @GetMapping
    public List<Inventory> getAllInventory() {
        return inventoryService.getAllInventory();
    }

    // Get an inventory item by ID
    @GetMapping("/{id}")
    public Inventory getInventoryById(@PathVariable Integer id) {
        return inventoryService.getInventoryById(id);
    }

    // Add a new inventory item
    @PostMapping
    public Inventory addInventory(@RequestBody Inventory inventory) {
        return inventoryService.addInventory(inventory);
    }

    // Get inventory items by location
    @GetMapping("/location/{location}")
    public List<Inventory> getInventoryByLocation(@PathVariable String location) {
        return inventoryService.getInventoryByLocation(location);
    }
}
