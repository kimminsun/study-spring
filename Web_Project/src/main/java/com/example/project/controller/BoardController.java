package com.example.project.controller;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.dto.BoardVO;
import com.example.project.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	@Inject
	BoardService boardService;
	
	@RequestMapping("list.do")
	public ModelAndView list() {
		List<BoardVO>list=boardService.listAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("board/list");//�並 list.jsp ����
		mav.addObject("list",list);
		return mav;
	}
}
