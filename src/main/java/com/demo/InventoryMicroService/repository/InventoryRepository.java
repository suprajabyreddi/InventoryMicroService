package com.demo.InventoryMicroService.repository;

import com.demo.InventoryMicroService.dao.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

    // Custom method to find Inventory by location (optional)
    List<Inventory> findByInventoryLocation(String inventoryLocation);
}
