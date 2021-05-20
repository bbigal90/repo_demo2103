<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List, java.util.Map" %>
    <%@ page import="com.design.zipcode.ZipCodeVO" %>
    <%
    	List<ZipCodeVO> zipList = 
    			(List<ZipCodeVO>) request.getAttribute("zipList");
    	int size = 0;
    	if(zipList != null){
    		size = zipList.size();
    	}
    	out.print("백엔드에서 넘어온 값의 크기 ==>"+size);
    	out.print("</br>");
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getZipCodeList.jsp[WEB-INF] </title>
</head>
<body>
	<%
	for (ZipCodeVO index : zipList) {
		%>	
		<%= index.getZipcode()%> 
		<%= index.getAddress()%> <br>
		<%
	}
	%>
	</br> 우편 변호 검색기 페이지 입니다. [WEB-INF 밑에 있음]
</body>
</html>