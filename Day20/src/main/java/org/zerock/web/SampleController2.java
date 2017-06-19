package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg")String msg){
		return "result";
	}
}
