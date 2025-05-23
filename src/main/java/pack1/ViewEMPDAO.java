package pack1;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class ViewEMPDAO 
{
public ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();

ArrayList<EmployeeBean> reteriveData() 
{
	try 
	{
		Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("select*from employee");
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) 
		{
			EmployeeBean bean=new EmployeeBean();
			bean.setEmp_Id(rs.getString(1));
			bean.setEmp_Fname(rs.getString(2));
			bean.setEmp_Lname(rs.getString(3));
			bean.setEmp_Sal(rs.getInt(4));
			bean.setEmp_Addr(rs.getString(5));
			
			al.add(bean);
		}
	}
catch(Exception e) 
	{
	e.printStackTrace();
	}
	return al;
}
}
