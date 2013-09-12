<%@page import= "nic.NicCalculator"%>
<%@page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<h1>Result of Nic interpretation </h1>
<br>
<%
	String nic_num = request.getParameter("no");
	NicCalculator nic_calculator = new NicCalculator(nic_num);
               
                               nic_calculator.calculate();
                                out.print("Nic[birthday = Birthday[");
                                out.println("year = " + nic_calculator.getYear());
                                out.println(",month = " + nic_calculator.getMonth());
                                out.println(",date = " + nic_calculator.getDay() + "],");
                                out.println("gender = " + nic_calculator.getStatus());
                                out.println(",isVoter = " + nic_calculator.isVoter());
                               
               
%>
</head>
<body>
</body>
</html>