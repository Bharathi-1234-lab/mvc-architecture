<%@page import="java.util.Iterator" %>
<%@page import="pack1.EmployeeBean" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)request.getAttribute("list");
if(al.size()==0)
	out.println("<center> <h1> data is not available </h1> </center>");
else
{
	Iterator<EmployeeBean> i=al.iterator();
	out.println("<center> <h1>");
	while(i.hasNext())
	{
		EmployeeBean bean=i.next();
		
out.println(bean.getEmp_Id()+" "+bean.getEmp_Fname()+" "+bean.getEmp_Lname()+" "+bean.getEmp_Sal()+" "+
bean.getEmp_Addr()+" <br>");
	}
	out.println("<center <h1>");
	
}
%>
<jsp:include page="index.html"/>
</body>
</html>