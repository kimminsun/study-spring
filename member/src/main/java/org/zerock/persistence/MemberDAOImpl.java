package org.zerock.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	private SqlSession sqlSession;
	private static final String namespace="org.zerock.membermapper";
	
	@Override
	public String getTime(){
		return sqlSession.selectOne(namespace+".getTime");
		
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".inserMember",vo);
	}

	
}
