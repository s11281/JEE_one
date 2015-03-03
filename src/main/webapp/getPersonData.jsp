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

<jsp:useBean id="storage" class="com.example.servletjspdemo.service.StorageService" scope="application" />
<jsp:useBean id="person" class="com.example.servletjspdemo.domain.Person" scope="session" />


<form action="addPerson.jsp">
<c:if test="${storage.getAllPersons().size()<=2}">
  Imie:<input type="text" name="firstName" value="${person.firstName}" /><br />
  Nazwisko :<input type="text" name="Name" value="${person.name}" /><br />
  email:<input type="text"  name="email" value="${person.email}" /><br />
  <input type="submit" value=" OK ">
</c:if>  
</form>


</body>
</html>