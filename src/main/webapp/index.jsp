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
<c:if test="${storage.getAllPersons().size()<=4}">
  Imie:<input type="text" name="firstName" value="${person.firstName}" /><br />
  Nazwisko :<input type="text" name="name" value="${person.name}" /><br />
  email:<input type="text"  name="email" value="${person.email}" /><br />
  Powtórz email:<input type="text"  name="email_pow" value="${person.email_pow}" /><br />
  Nazwa pracodawcy:<input type="text"  name="pracodawca" value="${person.pracodawca}" /><br />
  Czym się zajmujesz:<input type="text"  name="info2" value="${person.info2}" /><br />
  <p>Żródło wiedzy o kursie:</p>
	<input type="radio" name="info" value="Ogłoszenie w pracy" />Ogłoszenie w pracy<br />
	<input type="radio" name="info" value="Ogłoszenie na uczelni" />Ogłoszenie na uczelni<br />
	<input type="radio" name="info" value="Facebook" />Facebook<br />
	<input type="radio" name="info" value="Znajomi" />Znajomi<br />
	<input type="radio" name="info" value="Inne" />Inne<br />
	<textarea name="info_box" cols="25" rows="5">Wprowadź</textarea><br />
  
  
  <input type="submit" value=" OK ">
</c:if>  
</form>


</body>
</html>