package com.example.vsh.dao;

import org.springframework.stereotype.Component;

import com.example.vsh.Model.BiscuitModel;

@Component
public interface BiscuitDao {
     public BiscuitModel stockInsert(BiscuitModel bm);
}
