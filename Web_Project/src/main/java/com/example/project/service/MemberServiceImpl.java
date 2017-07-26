package com.example.project.service;

import java.lang.reflect.Member;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.project.model.dao.MemberDAO;
import com.example.project.model.dao.MemberDAOImpl;
import com.example.project.model.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	//MemberDAOImpl 객체를 스프링에서 생성하여 주입 
	@Inject
	MemberDAOImpl memberDao;
	
	@Override
	public List<MemberVO> memberList(){
		return memberDao.memberList();
	}
	
	//회원가입
	@Override
	public void insertMember(MemberVO vo){
		memberDao.insertMember(vo);
	}

	//회원 정보 상세 조회
	@Override
	public MemberVO viewMember(String userId) {
		// TODO Auto-generated method stub
		return memberDao.viewMember(userId);
	}

	//05. 회원 정보 삭제 처리
	@Override
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub
		memberDao.deleteMember(userId);
		
	}

	//4. 회원 정보 수정처리
	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		memberDao.updateMember(vo);
	}
	//06. 회원 정보 수정 및 삭제를 위한 비밀번호 체크
	public boolean checkPw(String userId,String userPw){
		return memberDao.checkPw(userId,userPw);
	}
	

}
