package com.ust.stockManagement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ust.stockManagement.model.ProductDTO;

@Component
public class MyDAOimp1 implements MyDAO{
	@Autowired
	SessionFactory sf;

	@Override
	public void add(ProductDTO dto) {
		System.out.println("inside DAO");
		Session ss = sf.openSession();
		ss.save(dto);
		ss.beginTransaction().commit();
		ss.close();		
		
	}
	

}
