<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  span {
	color:red;
}
</style>
</head>
<body>
    <h2>会员数据信息</h2>
     <form action="memberServlet"  method="post">
      <input type="hidden"  name="opt" value="save">
      <div>
                   姓名: <input  name="uname" value="测试">
      </div>
      <div>
                   密码: <input  name="password" type="password" value="123456">
      </div>
      <div>
                   性别: <input  type="radio" name="sex" value="0" checked>男
           <input  type="radio" name="sex" value="1" >女
      </div>
      <div>
                    手机号码: <input   name="mobile" value="13338875863">
      </div>
      <div>
                    邮箱: <input   name="email" value="657012724@qq.com">
      </div>
     
      <input type="submit" value="提交">
      <input type="reset" value="重置">
      
      <div style="margin: 15px"><span>form表单验证未作处理</span></div>
      
     </form>
</body>
</html>