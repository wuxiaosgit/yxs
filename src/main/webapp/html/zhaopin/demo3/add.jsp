<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
        <title>面试管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="../../css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：面试管理-》面试结果登记</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.jsp">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">应聘职位名称<span style="color:red">*</span>：</td>
                    <td><input type="text" name="f_goods_name" value="高级开发工程师" /></td>
                </tr>
                <tr>
                    <td>应聘职位编码<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="f_goods_name" value="a1006" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>职位分类<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="f_goods_price"  /></td>
                </tr>
                <tr>
                    <td>姓名<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" readonly name="f_goods_image" value="杨XX" />
					</td>
                </tr>
                <tr>
                    <td>性别<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="f_goods_image"  />
                    </td>
                </tr>


				<tr>
                    <td>招聘类型<span style="color:red">*</span>：</td>
                    <td>
                       <select>
						<option>-请选择-</option>
						<option>社会招聘</option>
						<option>校园招聘</option>
					   </select>
                    </td>                
                </tr>

				<tr>
                    <td>EMAIL：</td>
                    <td>
                        <input type="text" name="f_goods_image"  />
                    </td>                
                </tr>

				<tr>
                    <td>联系电话：</td>
                    <td>
                        <input type="text" name="f_goods_image" />
                    </td>                
                </tr>

				<tr>
                    <td>户口所在地：</td>
                    <td>
                        <input type="text" name="f_goods_image"  />
                    </td>                
                </tr>

				<tr>
                    <td>住址：</td>
                    <td>
                        <input type="text" name="f_goods_image"  />
                    </td>                
                </tr>
				<tr>
                    <td>政治面貌：</td>
                    <td>
                        <input type="text" name="f_goods_image"  />
                    </td>                
                </tr>
				<tr>
                    <td>身份证号：</td>
                    <td>
                        <input type="text" name="f_goods_image"  />
                    </td>                
                </tr>
				<tr>
                    <td>毕业院校：</td>
                    <td>
                        <input type="text" name="f_goods_image" />
                    </td>                
                </tr>	

				<tr>
                    <td>学历：</td>
                    <td>
						  <select>
						<option>-请选择-</option>
						<option>本科</option>
						<option>硕士</option>
					   </select>
                    </td>
                </tr>
				<tr>
                    <td>专业：</td>
                    <td>
                        <input type="text" name="f_goods_image" />
                    </td>                
                </tr>
					<tr>
                    <td>工作经验：</td>
                    <td>
                        <input type="text" name="f_goods_image" />
                    </td>                
                </tr>
					<tr>
                    <td>薪资要求：</td>
                    <td>
                        <input type="text" name="f_goods_image" />（月薪）
                    </td>                
                </tr>
					<tr>
                    <td>是否在职：</td>
                    <td>
                        <select>
							<option>-请选择-</option>
							<option>在职</option>
							<option>离职</option>
						</select>
                    </td>                
                </tr>
					<tr>
                    <td>是否应届生：</td>
                    <td>
                         <select>
							<option>-请选择-</option>
							<option>应届</option>
							<option>毕业</option>
						</select>
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>登记时间：</td>
                    <td>
                        <input type="text" name="f_goods_image" />
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>个人履历：</td>
                    <td>
                       <textarea cols="70" rows="8">2006-2008年 就职于***公司，职位：高级软件开发工程师</textarea>
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>简历附件：</td>
                    <td>
                        <input type="file" name="f_goods_image" />
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>是否推荐面试：</td>
                    <td>
                      <select>
							<option>-请选择-</option>
							<option>是</option>
							<option>否</option>
						</select>
						推荐人：<input type="text" value="徐徐">
						推荐时间：<input type="text" value="2013-09-08">
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>推荐面试意见：</td>
                    <td>
                       <textarea cols="70" rows="3">此人学历，工作经验符合岗位要求，推荐面试。</textarea>
                    </td>                
                </tr>		
            </table>
			<br>
			
             面试结果：  <hr color="#009966" size="1px">
            
			<table border="1" width="100%" class="table_a">
			<tr>
					<td colspan="2">
						面试结果：	
					 <select>
							<option>-请选择-</option>
						
							<option>存档</option>
							<option>推荐面试</option>
							<option>推荐二面</option>
							<option>推荐三面</option>
							<option selected="selected" >建议录用</option>
							<option>录用</option>
							<option>删除</option>
						</select>
						
					</td>
				</tr>
				
				 <tr>
                    <td>一面面试人：<input type="text" value="zhangsan"> 面试时间：<input value="2015-11-01">
					</td>
                    <td>
                     二面面试人：<input type="text" value="zhangsan"> 面试时间：<input value="2015-11-01">
                    </td>
                </tr>
				</tr>
					<tr>
                    <td>一面面试评价：<textarea cols="70" rows="3">此人学历，工作经验符合岗位要求，推荐面试。</textarea></td>
                    <td>
                      二面面试评价：<textarea cols="70" rows="3">此人学历，工作经验符合岗位要求，推荐面试。</textarea>
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>三面面试人：<input type="text" value="zhangsan"> 面试时间：<input value="2015-11-01"></td>
                    <td>
                      三面面试评价：<textarea cols="70" rows="3"></textarea>
                    </td>                
                </tr>
				 <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="保存">
						<input type="button" value="返回">
                    </td>
                </tr>  
			</table>
            </form>
        </div>
    </body>
</html>