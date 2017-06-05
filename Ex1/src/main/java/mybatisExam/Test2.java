package mybatisExam;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Test2 {
	private SqlSession sqlSession;
	
	public Test2(SqlSession sqlSession)
	{
		this.sqlSession=sqlSession;
	}
	
	public void selectOne(String name)
	{
		Singer singer=sqlSession.selectOne("exam.test.SingerMapper1.getSinger",name);
		System.out.println(singer);
				
	}
	
	public void insert(Singer singer)
	{
		int count=sqlSession.insert("exam.test.SingerMapper1.insertSinger",singer);
		System.out.println(count+"개의 레코드 삽임됨");
		
	}
	public void selectList(int member){
		List<Singer> singers=sqlSession.selectList("exam.test.SingerMapper1.getSingers",member);
		for(Singer singer:singers)
			System.out.println("그룹이름 : "+singer.getName());
	}
	
	public void update(Singer singer)
	{
		int count=sqlSession.update("exam.test.SingerMapper1.updateSinger",singer);
		System.out.println(count+"개의 레코드 수정");
	}
	public void delete(String name){
		int count=sqlSession.delete("exam.test.SingerMapper1.deleteSinger",name);
		System.out.println(count+"개의 레코드 삭제");
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ctx=new GenericXmlApplicationContext("mappers/Beans.xml");
		Test2 test2=ctx.getBean("test2",Test2.class);
		test2.selectOne("소녀시대");
		//test2.insert(new Singer("빅뱅",5));
		test2.selectList(5);
		test2.update(new Singer("빅뱅",6));
		test2.delete("빅뱅");
		
	}
	
	
}
