package mybatisDept;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import mybatisExam.Singer;

public class Test1 {
	private SqlSession sqlSession;
	public Test1(SqlSession sqlSession){
		this.sqlSession=sqlSession;
	}
	
	public void insert(Dept1 dept)
	{
		int count=sqlSession.insert("exam.test.deptMapper.insertDept",dept);
		System.out.println(count+"개의 레코드 삽임됨");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new GenericXmlApplicationContext("deptMappers/Beans.xml");
		Test1 test1=ctx.getBean("test1",Test1.class);
		test1.insert(new Dept1(1,"aaa"));
	}

}
