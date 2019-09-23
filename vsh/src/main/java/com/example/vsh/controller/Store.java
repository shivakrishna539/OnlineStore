package com.example.vsh.controller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vsh.Model.BiscuitModel;
import com.example.vsh.Model.SalesModel;
import com.example.vsh.dao.BiscuitDao;
import com.example.vsh.service.BiscuitService;

@RestController
public class Store {
	
	@Autowired
	BiscuitDao bd;
	
	@Autowired
	BiscuitService bs;
	
	@PostMapping("/vsh/stockInsert")
	public BiscuitModel insertStock(@RequestBody BiscuitModel bm) {
		
	
		return bs.insertStock(bm);
		//bis.save(bm);
		
		//System.out.println("Inserted "+bm.getName()+" and quantity is "+bm.getQuantity()
		//+" id is: "+bm.getId());
		
		//return "Inserted "+bm.getName()+" and quantity is "+bm.getQuantity()
		//+" id is: "+bm.getId();
	}
	
	@GetMapping("/vsh/getStock")
	public ArrayList<BiscuitModel> getStock(@RequestParam("companyName") String companyName) {
		
		return bd.findByCompanyName(companyName);
	}
}
