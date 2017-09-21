<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>

<head>
	<base href="<%=basePath%>">
	<meta charset="utf-8" />
	<title>用户管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="../../css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》用户管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">用户编号：</td>
                    <td>
						201501010
					</td>
                </tr>
				<tr>
                    <td width="120px;">登录账号：</td>
                    <td>
						zhangsan
					</td>
                </tr>
                <tr>
                    <td>用户姓名：</td>
                    <td>
						张三
					</td>
                </tr>
                <tr>
                    <td>密码：</td>
                     <td>
						......
					</td>
                </tr>
                <tr>
                    <td>用户角色：</td>
                     <td>
						人事部负责人
					</td>
                </tr>
                <tr>
                    <td>所属部门：</td>
                     <td>
						人事部
					</td>
                </tr>
				<tr>
                    <td>身份证：</td>
                    <td>
                        372902198708084567
                    </td>                
                </tr>
                <tr>
                    <td>联系电话：</td>
                     <td>
						17718181920
					</td>
                </tr>


				<tr>
                    <td>邮箱：</td>
                     <td>
						AAA@163.com
					</td>               
                </tr>

				<tr>
                    <td>联系地址：</td>
                     <td>
						海淀区软件园孵化器
					</td>                
                </tr>

				

            </table>
            </form>
        </div>
    </body>
</html>