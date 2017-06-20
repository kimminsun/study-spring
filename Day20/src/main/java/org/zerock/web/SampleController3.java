package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.productVO;

@Controller
public class SampleController3 {
	@RequestMapping("doD")
	public String doD(Model model){
		productVO product=new productVO("sample Product", 1000);
		model.addAttribute(product);
		//addAttribute("이름",객체)
		//addAttribute(객체) -> 이름을 지정하지 않는 경우네느
		//자동으로 저장되는 객체의 클래스명 앞 글자를 소문자로
		//처리한 클래스명을 이름으로 간주
		return "productDetail";
	}
}
