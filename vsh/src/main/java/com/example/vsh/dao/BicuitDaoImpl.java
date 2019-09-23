package com.example.vsh.dao;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.vsh.Model.BiscuitModel;
import com.example.vsh.Repository.Biscuit;

@Component
public class BicuitDaoImpl implements BiscuitDao{
	
	@Autowired
	Biscuit bis;
	
	public BiscuitModel stockInsert(BiscuitModel bm) {
		BiscuitModel bminserted = bis.save(bm);
		return bminserted;
	}

	@Override
	public ArrayList<BiscuitModel> findByCompanyName(String companyName) {
		
		 ArrayList<BiscuitModel> list = bis.findByCompanyName(companyName);
		 
	     return list;
	}
}
