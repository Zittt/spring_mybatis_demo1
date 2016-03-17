<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>welcome...</h2>
	<a href="getUser?uid=13">id查询</a>
	<br/>
	<a href="getAllUsers">查询所有</a>
	<br/>
	<a href="addUserPage">添加User</a>
	<br/>
	<a href="deleteUserN?uid=2">删除User</a>
	<br/>
	<a href="updateUserPage">修改User</a>
	<br/>
	<br/>
	
	
	<button id="jsonBtn">发送JSON格式数据</button>
	
<script type="text/javascript" src="resources/js/jquery-1.10.2.js"></script>	
	<script type="text/javascript">
		$("#jsonBtn").click(function(){
			$.ajax({
				type: "POST",
				url: "getAllUsers",
				contentType: "application/json; charset=utf-8",
				data: JSON

			});

		});

	</script>
	
	
	
</body>
</html>