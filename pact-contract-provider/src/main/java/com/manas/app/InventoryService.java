package com.manas.app;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {
	
	
	public Inventory saveInventory(Inventory inventory){
		
		/* for testing the provider end. This service will be mocked */
		return new Inventory("TV", "CHENNAI", 100);
	}

	public Inventory getInventory(Integer id){
		
		/* for testing the provider end. This service will be mocked */
		return new Inventory("TV", "ODISHA", 1000);
	}

}
