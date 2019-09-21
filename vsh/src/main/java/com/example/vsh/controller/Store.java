package com.example.vsh.controller;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vsh.Model.BiscuitModel;
import com.example.vsh.dao.BiscuitDao;

@RestController
public class Store {
	
	@Autowired
	BiscuitDao bd;
	
	@PostMapping("/vsh/stockInsert")
	public BiscuitModel insertStock(@RequestBody BiscuitModel bm) {
		
		BiscuitModel bminsert = bd.stockInsert(bm);
		
		return bminsert;
		//bis.save(bm);
		
		//System.out.println("Inserted "+bm.getName()+" and quantity is "+bm.getQuantity()
		//+" id is: "+bm.getId());
		
		//return "Inserted "+bm.getName()+" and quantity is "+bm.getQuantity()
		//+" id is: "+bm.getId();
	}
	
	@GetMapping("/vsh/getStock/{id}")
	public void getStock(@PathVariable("id") int id) {
		System.out.println("In get stock method");
		//return bis.findById((long)id);
	}
}
