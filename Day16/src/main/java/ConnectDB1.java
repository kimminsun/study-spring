import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectDB1 {
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
	}
	
	public void connectTest(){
		Connection con=null;
		try{
			con=dataSource.getConnection();
			System.out.println("제대로 연결되었다.");
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("app_dbtest.xml");
		ConnectDB1 db=(ConnectDB1)ctx.getBean("connectDB1");
		db.connectTest();
	}

}
