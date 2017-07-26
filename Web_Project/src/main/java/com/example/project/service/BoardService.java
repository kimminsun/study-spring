package com.example.project.service;

import java.util.List;

import com.example.project.model.dto.BoardVO;

public interface BoardService {
	
	//1. �Խñ� �ۼ�
	public void create(BoardVO vo);
	
	//2. �� ����
	public BoardVO read(int bno);
	
	//3. ����
	public void update(BoardVO vo);
	
	//4. ����
	public void delete(int bno);
	
	//. ��ü���
	public List<BoardVO> listAll();
	
	
	//6. ��ȸ��
	public void increaseViewcnt(int bno);

}
