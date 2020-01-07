<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LIKUS
  Date: 2019-12-10
  Time: 08:29:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增员工</title>
</head>
<body>
<center>
    <h3>新增员工</h3>
    <form action="${pageContext.request.contextPath}/main/add" method="post">
        <table border="1px" cellspacing="0" cellpadding="5px" width="60%" style="text-align: center">
            <tr>
                <th>姓名</th>
                <td><input type="text" name="ename"></td>
            </tr>
            <tr>
                <th>性别</th>
                <td><input type="radio" name="esex" value="男" checked>男
                            <input type="radio" name="esex" value="女">女
                </td>
            </tr>
            <tr>
                <th>入职日期</th>
                <td><input type="date" name="estartime"></td>
            </tr>
            <tr>
                <th>工资</th>
                <td><input type="text" name="epay"></td>
            </tr>
            <tr>
                <th>部门名称</th>
                <td>
                    <select name="did" id="">
                        <option value="-1">==请选择==</option>
                        <c:forEach items="${deptList}" var="dept">
                            <option value="${dept.did}"
                            >${dept.dname}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交">
                    <input type="reset" value="取消">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
