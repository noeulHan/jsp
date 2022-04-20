<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- test1FormOk.jsp -->
<%
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html; charset=utf-8");	

	String name = request.getParameter("name");
	int price = request.getParameter("price")==null ? 0 : Integer.parseInt(request.getParameter("price"));
%>

<p> 성명: <%=name %></p>
<p> 가격: <%=price %></p>
<p><a href="test1Form.jsp">돌아가기</a></p>
<%
	//response.sendRedirect("test1FormResult.jsp?name=김말숙&price=1500");
	//샌드리드렉팅은 값을 유지안하고 지정한 값을 다시 보냄
%>
	<%if(name.equals("admin")) {%>
		<jsp:forward page="test1FormAdmin.jsp"></jsp:forward>
	<%} else { %>
	<jsp:forward page="test1FormResult.jsp"></jsp:forward>
	<%}%>
	
	<!-- 앞에 있는 값을 그대로 가져옴 -->

