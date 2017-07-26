package com.example.project.service;

import java.util.List;

import com.example.project.model.dto.BoardVO;

public interface BoardService {
	
	//1. 게시글 작성
	public void create(BoardVO vo);
	
	//2. 상세 보기
	public BoardVO read(int bno);
	
	//3. 수정
	public void update(BoardVO vo);
	
	//4. 삭제
	public void delete(int bno);
	
	//. 전체목록
	public List<BoardVO> listAll();
	
	
	//6. 조회수
	public void increaseViewcnt(int bno);

}
