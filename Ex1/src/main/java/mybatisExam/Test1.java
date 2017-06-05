package mybatisExam;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test1 {
	private SqlSession sqlSession;
	public Test1(SqlSession sqlSession){
		this.sqlSession=sqlSession;
	}
	
	public void selectOne()
	{
		int count=sqlSession.selectOne("exam.test.SingerMapper.getSingerCount");
		System.out.println("그룹수 : "+count);
	}
	
	public void selectOne1(String name){
		int count=sqlSession.selectOne("exam.test.SingerMapper.getSingerMember",name);
		System.out.println("그룹 멤버수"+count);
	}
	
	public void selectOne2(int member){
		//mapper의 id getSingerName
		String name=sqlSession.selectOne("exam.test.SingerMapper.getSingerName",member);
		System.out.println(member+"명 그룹 이름 : "+name);
		
	}
	public void selectOne3(String name,int member)
	{
		Map<String,Object> paramMap=new HashMap<String,Object>();
		paramMap.put("name", name);
		paramMap.put("member", member);
		String rname=sqlSession.selectOne("exam.test.SingerMapper.getSingerNameMember",paramMap);
		System.out.println(member+"명 그룹 이름 :"+rname);
	}
	
	public void selectOne4(Singer singer)
	{
		Singer rsinger=sqlSession.selectOne("exam.test.SingerMapper.getSinger1",singer);
		System.out.println(rsinger);
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ctx=new GenericXmlApplicationContext("mappers/Beans.xml");
		Test1 test1=ctx.getBean("test1",Test1.class);
		test1.selectOne();
		test1.selectOne1("exo");
		test1.selectOne2(9);
		test1.selectOne3("exo",9);
		test1.selectOne4(new Singer("exo",9));
	}
}
