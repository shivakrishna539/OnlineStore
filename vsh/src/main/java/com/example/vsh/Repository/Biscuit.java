package com.example.vsh.Repository;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.vsh.Model.BiscuitModel;

@Repository
public interface Biscuit extends JpaRepository<BiscuitModel, Long>{
	
	@Query("FROM BiscuitModel WHERE companyName = ?1")
    public ArrayList<BiscuitModel> findByCompanyName(String companyName);

}
