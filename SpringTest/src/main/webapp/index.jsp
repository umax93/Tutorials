<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
//your function
var my_func = function(event) {
    alert("me and all my relatives are owned by China");
    event.preventDefault();
};

// your form
var form = document.getElementById("panda");

// attach event listener
form.addEventListener("submit", my_func, true);

</script>
<form action="open">
<input type="text" name="t1">
<input type="text" name="t2">
<input type="submit">
<br>
</form>
<form id="panda"  method="get">
<input type="text" name="t3"></input>
<input type="submit">
</form>
<script type="text/javascript">
function OnSubmitForm()
{
   var userid = document.input.userid.value;
   document.userform.action="add/"+userid;
   return true;
}
</script>
    <h1>Hello World!</h1>
   
    <form name="userform" method="post" onsubmit="return OnSubmitForm();">         
          User ID: <input type="text" id="userid" name="userid">                        
         <input type="submit" value="Submit">
    </form>





 <sql:setDataSource var="dataSource" driver="com.mysql.cj.jdbc.Driver" 
 url="jdbc:mysql://localhost:3306/schema1?serverTimezone=UTC" user="root" password="K20YC3abZ7"/>
<sql:query var="users" dataSource="${dataSource}">
    select * from `User`
</sql:query>
 
<c:forEach items="${users.rows}" var="row">
    <c:out value="${row.name}"/>
</c:forEach>








</body>
</html>