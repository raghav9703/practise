package com.ust.stockManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ust.stockManagement.dao.MyDAO;
import com.ust.stockManagement.model.ProductDTO;

@Component
public class MyServiceImp1 implements MyService {
	@Autowired
	MyDAO mdao;

	@Override
	public void add(ProductDTO dto) {
		System.out.println("inside Service");
		mdao.add(dto);
		
	}
	
	
	

}
