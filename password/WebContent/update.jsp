<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="my"  action="passwordupdate">
UserId:<form:input path="email" value="${list.email }"  readonly="true"/></br>

Enter new password<form:input type="password" path="password"/>
confirm password<form:input  type="password" path="password"/>
 
 	<input type="submit" value="update" />
</form:form> 

</body>
</html>