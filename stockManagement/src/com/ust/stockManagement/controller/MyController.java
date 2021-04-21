package com.ust.stockManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ust.stockManagement.model.ProductDTO;
import com.ust.stockManagement.service.MyService;

@RequestMapping("/")
@Component
public class MyController {
	@Autowired
	MyService ms;

	@RequestMapping("/link1")
	public String addProduct() {
		return "product";
	}
	
	@RequestMapping(value = "/productStore", method = RequestMethod.POST)
	public String productStore(@ModelAttribute ProductDTO dto) {
		ms.add(dto);
		
		return "product";
	}
	
}
