package com.company.mvc;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")
	public ModelAndView hello(){
		ModelAndView mav=new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("greeting",getGreeting());
		return mav;
	}
	
	private String getGreeting(){
		int hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour>=6 && hour<=10){
			return "좋은 아침이다.";
		}
		else if(hour>=12 && hour<=15){
			return "점심시간이다.";
		}
		else if(hour>=18 && hour<=22){
			return "좋은 밤 되세요";
		}
		else{
			return "안녕하세요";
		}
	}
	

}
