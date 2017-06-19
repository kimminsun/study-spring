package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.domain.ProductVO;

@Controller
public class SampleController {
	@RequestMapping("/sample.do")
	public String doD(Model model){
		ProductVO product=new ProductVO("sample",1000);
		model.addAttribute(product);
		return "productDetail";
	}

}
