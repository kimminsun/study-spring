package com.example.project.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.project.model.dto.MemberVO;

//현재 크래스를 DAO Bean으로 등록시켜주는 역할
@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	SqlSession sqlSession;

	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("member.memberList");
	}

	//02. 회원등록
	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert("member.insertMember",vo);
		
	}

	//03. 회원정보 상세 조회
	@Override
	public MemberVO viewMember(String userId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("member.viewMember",userId);
	}

	@Override
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub
		sqlSession.delete("member.deleteMember",userId);
		
	}
	//04. 회원정보 수정 처리
	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.update("member.updateMember",vo);
	}

	@Override
	public boolean checkPw(String userId, String userPw) {
		// TODO Auto-generated method stub
		boolean result=false;
		Map<String,String> map=new HashMap<String,String>();
		map.put("userId", userId);
		map.put("userPw", userPw);
		int count=sqlSession.selectOne("member.checkPw",map);
		if(count==1)result=true;
		return result;
		
	}
	
	
	
	//회원 목록

}
