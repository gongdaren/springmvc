<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<body>
<h2>Hello World! Maven!</h2>
<form action="<c:url value="user/login.html"/>">
<input type="text" name="userID"/>
<input type="submit" value="submit"/>
</form>
</body>
</html>
