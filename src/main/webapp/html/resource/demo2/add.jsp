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
                <span style="float:left">当前位置是：-》资源管理》用户管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">用户编号<span style="color:red">*</span>：</td>
                    <td><input type="text" name="f_goods_name" value="201501010" /></td>
                </tr>
                <tr>
                    <td>登录账号<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="f_goods_name" value="zhangsan" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>用户姓名<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="f_goods_price" value="张三" /></td>
                </tr>
                <tr>
                    <td>密码<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="f_goods_image" value="......" />
					</td>
                </tr>
                <tr>
                    <td>所属职位<span style="color:red">*</span>：</td>
                    <td>
                        
						<select>
							<option>人事总监</option>
							<option>人事经理</option>
							<option>招聘专员</option>
						</select>
                    </td>
                </tr>


				<tr>
                    <td>所属部门<span style="color:red">*</span>：</td>
                    <td>
                       
						<select>
							<option>人事部</option>
							<option>研发部</option>
							<option>项目部</option>
						</select>
                    </td>                
                </tr>

				<tr>
                    <td>身份证<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="372902198708084567" />
                    </td>                
                </tr>

				<tr>
                    <td>联系电话<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="17718181920"/>
                    </td>                
                </tr>

				<tr>
                    <td>邮箱<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="AAA@163.com" />
                    </td>                
                </tr>

				<tr>
                    <td>联系地址：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="海淀区软件园孵化器" />
                    </td>                
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="添加">
						<input type="submit" value="清空">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>