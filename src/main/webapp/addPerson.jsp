<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="person" class="com.example.servletjspdemo.domain.Person" scope="session" />

<jsp:setProperty name="person" property="*" /> 

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />

<% 
  storage.add(person,person.getTest());
%>
<c:if test="${person.test}">
Zostaleś już zarejestrowany w tej sesji
</c:if>

${storage.status}
<% person.setTest(true);%>
<p>
  <a href="showAllPersons.jsp">Wszystkie osoby zarejestrowane</a>
</p>
</body>
</html>