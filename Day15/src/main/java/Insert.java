import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String args[]){
		Connection con=null;
		Statement stmt=null;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		
		String user="test";
		String psw="test";
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, psw);
			stmt=con.createStatement();
			System.out.println("제대로 연결되었다.");
			stmt.executeUpdate("insert into singer_group values('소녀시대',8)");
			stmt.executeUpdate("insert into singer_group values('exo',9)");
			System.out.println("레코드를 삽입했다.");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}