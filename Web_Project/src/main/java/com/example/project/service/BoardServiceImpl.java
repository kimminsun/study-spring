package com.example.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.project.model.dao.BoardDAO;
import com.example.project.model.dto.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	BoardDAO boardDao;
	
	//1. �۽���
	@Override
	public void create(BoardVO vo) {
		// TODO Auto-generated method stub
		String title=vo.getTitle();
		String content=vo.getContent();
		String writer=vo.getWriter();
		
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);
		boardDao.create(vo);
		
	}
	
	//2. �󼼺���

	@Override
	public BoardVO read(int bno) {
		// TODO Auto-generated method stub
		return boardDao.read(bno);
	}

	//3. ����
	@Override
	public void update(BoardVO vo) {
		// TODO Auto-generated method stub
		boardDao.update(vo);
	}

	@Override
	public void delete(int bno) {
		// TODO Auto-generated method stub
		boardDao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() {
		// TODO Auto-generated method stub
		return boardDao.listAll();
	}

	@Override
	public void increaseViewcnt(int bno) {
		// TODO Auto-generated method stub
		
	}

}
