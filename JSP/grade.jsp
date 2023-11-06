<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>JavaBeans를 이용한 학생의 점수에 따른 성적 처리 예제</h2>
	<% request.setCharacterEncoding("euc-kr"); %>
	<jsp:useBean id="score" class="javabean.GradeBean" scope="page"  />
	
	
	<HR>
	<h3> 폼에서 전달받은 이름과 성적을 JavaBeans GradeBean에 저장</h3><p>
	이름 : <%= request.getParameter("name") %><br>
	성적 : <%= request.getParameter("point") %><p>
	<jsp:setProperty name="score" property="name" param="name"  />
	<jsp:setProperty name="score" property="point" param="point"  />
	
	<HR>
	<h3> JavaBeans GradeBean에 저장된 정보를 조회 출력</h3><p>
	이름 : <jsp:getProperty name="score" property="name" /> <BR>
	성적 : <jsp:getProperty name="score" property="point" /> <BR>
	등급 : <jsp:getProperty name="score" property="grade" /> <BR>
	
</body>
</html>
