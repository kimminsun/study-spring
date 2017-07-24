package com.example.project.service;

import java.util.List;

import com.example.project.model.dto.MemberVO;

public interface MemberService {
	//ȸ�� ���
	public List<MemberVO> memberList();
	
	//ȸ�� �Է�
	public void insertMember(MemberVO vo);
	
	//ȸ�� ���� �� ����
	public MemberVO viewMember();
	
	//ȸ�� ����
	public void deleteMember(String userId);
	
	//���� ����
	public void updateMember(MemberVO vo);
	

}