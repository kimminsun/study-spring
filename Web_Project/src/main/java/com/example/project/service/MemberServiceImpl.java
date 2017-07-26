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
	//MemberDAOImpl ��ü�� ���������� �����Ͽ� ���� 
	@Inject
	MemberDAOImpl memberDao;
	
	@Override
	public List<MemberVO> memberList(){
		return memberDao.memberList();
	}
	
	//ȸ������
	@Override
	public void insertMember(MemberVO vo){
		memberDao.insertMember(vo);
	}

	//ȸ�� ���� �� ��ȸ
	@Override
	public MemberVO viewMember(String userId) {
		// TODO Auto-generated method stub
		return memberDao.viewMember(userId);
	}

	//05. ȸ�� ���� ���� ó��
	@Override
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub
		memberDao.deleteMember(userId);
		
	}

	//4. ȸ�� ���� ����ó��
	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		memberDao.updateMember(vo);
	}
	//06. ȸ�� ���� ���� �� ������ ���� ��й�ȣ üũ
	public boolean checkPw(String userId,String userPw){
		return memberDao.checkPw(userId,userPw);
	}
	

}
