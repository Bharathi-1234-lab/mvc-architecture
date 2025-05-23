package pack1;

import java.io.IOException;

import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewEmployeeServlet extends HttpServlet
{
	
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
{
	ViewEMPDAO obj= new ViewEMPDAO();
	ArrayList<EmployeeBean> al=obj.reteriveData();
	req.setAttribute("list",al);
	req.getRequestDispatcher("ViewEmp.jsp").forward(req, res);
}
}
