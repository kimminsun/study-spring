import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectTest {
	private JdbcTemplate jdbcTemplate;
	public SelectTest(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public void queryForInt()
	{
		int count=jdbcTemplate.queryForObject("select count(*) from singer_group", Integer.class);
		System.out.println("그룹수 ="+count);
	}


	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("app_dbtest.xml");
		SelectTest st=(SelectTest)ctx.getBean("selectTest");
		st.queryForInt();
	}
}
