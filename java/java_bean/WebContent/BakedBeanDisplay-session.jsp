<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://twitter.github.com/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body style="background-color:red">
<div style = "margin-left: 0.5in;">
	<h1 style = "color: black;">BakedBeanDisplay-session </h1>
	<jsp:useBean id="sessionBean" class="hmwrk.BakedBean" scope="session" />
	<jsp:setProperty name="sessionBean" property="*" />
	<h3 style = "color: yellow;">İsim: <jsp:getProperty name="sessionBean" property="name" /></h3>
	<h3 style = "color:	yellow;">Soyisim: <jsp:getProperty name="sessionBean" property="surname" /></h3><hr>
	<jsp:include page="BakedBeanDisplay-request.jsp" />
</div>
</body>
</html>