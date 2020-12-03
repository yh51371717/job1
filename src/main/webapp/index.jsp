<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>
</body>

<img src="${pageContext.servletContext.contextPath}/">

<form action="login.do">
    用户名:<input type="text" name="username"><br><br>
    密码:<input type="text" name="pwd"><br><br>
    <input type="submit" value="登陆"><br><br>
</form>

</html>
