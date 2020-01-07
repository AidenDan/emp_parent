<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: LIKUS
  Date: 2019-12-10
  Time: 10:29:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<center>
    <h3>修改员工</h3>
    <form action="${pageContext.request.contextPath}/main/modify2" method="post">
        <input type="hidden" name="eid" value="${emp.eid}">
        <table border="1px" cellspacing="0" cellpadding="5px" width="60%" style="text-align: center">
            <tr>
                <th>姓名</th>
                <td><input type="text" name="ename" value="${emp.ename}"></td>
            </tr>
            <tr>
                <th>性别</th>
                <td><input type="radio" name="esex" value="男" checked>男
                    <input type="radio" name="esex" value="女">女
                </td>
            </tr>
            <tr>
                <th>入职日期</th>
                <%--日期格式要相同，否则客户端不能识别--%>
                <td><input type="date" name="estartime" value="<fmt:formatDate value="${emp.estartime}" pattern="yyyy-MM-dd"></fmt:formatDate>"></td>
            </tr>
            <tr>
                <th>工资</th>
                <td><input type="text" name="epay" value="${emp.epay}"></td>
            </tr>
            <tr>
                <th>部门名称</th>
                <td>
                    <select name="did" id="">
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
