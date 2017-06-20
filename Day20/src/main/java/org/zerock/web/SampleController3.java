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
		//addAttribute("�̸�",��ü)
		//addAttribute(��ü) -> �̸��� �������� �ʴ� ���״�
		//�ڵ����� ����Ǵ� ��ü�� Ŭ������ �� ���ڸ� �ҹ��ڷ�
		//ó���� Ŭ�������� �̸����� ����
		return "productDetail";
	}
}
