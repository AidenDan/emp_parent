<%--@elvariable id="pageInfo" type="com.github.pagehelper.Page"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: LIKUS
  Date: 2019-12-9
  Time: 14:57:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工管理系统</title>
    <%--顺序不能错--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/bootstrap.css">
    <script src ="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/bootstrap.min.js"></script>
    <script src = "${pageContext.request.contextPath}/bootstrap/bootstrap-paginator.js"></script>
    <script src = "${pageContext.request.contextPath}/js/demo.js"></script>
</head>
<style>
    a {
        text-decoration: none;
    }
</style>
<body>
<center>
    <h3>员工管理系统</h3>
    <form action="${pageContext.request.contextPath}/main/list" method="post"  id="myform" class="form-inline">
        <input type="hidden" name="pageNum" id="pageNum">
    <p>
        姓名：<input type="text" name="cname" style="width:60px" value="${condition.cname}" class="form-control input-sm">
        工资：<input type="text" name="csalarystart" style="width: 60px" value="${condition.csalarystart}" class="form-control input-sm">--
        <input type="text" name="csalaryend" style="width: 60px" value="${condition.csalaryend}" class="form-control input-sm">
        入职日期：<input type="date" name="cdatestart" value="<fmt:formatDate value="${condition.cdatestart}" pattern="yyyy-MM-dd"></fmt:formatDate>" class="form-control input-sm">--
        <input type="date" name="cdateend" value="<fmt:formatDate value="${condition.cdateend}" pattern="yyyy-MM-dd"></fmt:formatDate>" class="form-control input-sm">
        部门：<select name="cdept" id="" class="form-control input-sm">
        <option value="-1">==请选择==</option>
        <c:forEach items="${deptList}" var="dept">
            <option value="${dept.did}"
            <c:if test="${dept.did eq condition.cdept}">selected</c:if>
            >${dept.dname}</option>
        </c:forEach>
                     </select>
        <input type="submit" value="查询" class="btn btn-info">
        <input type="button" value="新增员工"  class="btn btn-info" data-toggle="modal" data-target="#mymodal">
    </p>
    </form>
    <table  class="table  table-hover table-striped table-condensed">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>入职日期</th>
            <th>工资</th>
            <th>部门名称</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pageInfo.list}" var="emp" varStatus="vs">
            <tr
            <c:if test="${vs.index%2 eq 0}">style="background-color: aqua"</c:if>
            >
            <td>${emp.eid}</td>
            <td>${emp.ename}</td>
            <td>${emp.esex}</td>
            <td><fmt:formatDate value="${emp.estartime}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
            <td>${emp.epay}</td>
            <td>${emp.dept.dname}</td>
            <td>
                <button class="btn btn-warning btn-sm"
                        data-toggle="modal" data-target="#updateModal"
                        onclick="mValues('${emp.eid}','${emp.ename}','${emp.esex}','${emp.estartime}','${emp.epay}','${emp.did}')">修改</button>
                <button class="btn btn-danger btn-sm"
                        data-toggle="modal" data-target="#delModal" onclick="toDel(${emp.eid})">删除</button>
                <%--<a href="${pageContext.request.contextPath}/main/modify/${emp.eid}">修改</a>&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/main/remove/${emp.eid}">删除</a>--%>
            </td>
            </tr>
        </c:forEach>
    </table>
    <%--分页组件--%>
    <div class="row">
        <div class="col-md-10 col-md-offset-1">
            <%--必须要写ul标签: 分页的数据都放在ul标签中--%>
            <ul id="pagination"></ul>
        </div>
    </div>
  <%--  <br>
    <table border="1px"  cellpadding="3px" cellspacing="0" style="font-size: 10px">
        <tr>
            <td><a href="javascript:toPage(1)">首页</a></td>
            <td><a href="javascript:toPage(${pageInfo.pageNum-1})">上一页</a></td>
            <td>
                <c:forEach begin="1" end="${pageInfo.pages}" var="i">
                    <a href="javascript:toPage(${i})">${i}</a>
                </c:forEach>
            </td>
            <td><a href="javascript:toPage(${pageInfo.pageNum+1})">下一页</a></td>
            <td><a href="javascript:toPage(${pageInfo.pages})">尾页</a></td>
            <td>转跳到第</td>
            <td><input type="text" style="width: 60px; text-align: center" id="jumpPage" value="${pageInfo.pageNum}"></td>
            <td><input type="button" value="GO" onclick="jump()"></td>
        </tr>
    </table>--%>
</center>
<%--模态框：新增员工功能--%>
<!--模态框-->
<!--第一层：声明模态框
    show:显示出来模态框
    tabindex="-1":模态框的标签页的下标，从-1开始
-->
<div class="modal" id="mymodal" tabindex="-1" data-backdrop="static">
    <!--第二层：声明窗口-->
    <div class="modal-dialog">
        <!--第三层：声明窗口里的内容-->
        <div class="modal-content">
            <!--第一层:头部分-->
            <div class="modal-header">
                <!--写出来窗口的关闭按钮
                    class="close":表示这个按钮是关闭窗口的按钮
                    data-dismiss="modal":表示这个按钮可以关闭窗口
                    &times;:表示  × 按钮
                -->
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
                <!--class="modal-title":表示内容的标题-->
                <h4 class="modal-title">新增员工信息</h4>
            </div>
            <!--第二层：主体部分-->
            <div class="modal-body">
                <form action="${pageContext.request.contextPath}/main/add" method="post" id="addForm" class="form-horizontal">
                    <div class="form-group">
                        <label class="col-md-3 control-label">员工姓名：</label>
                        <div class="col-md-4">
                            <input type="text" name="ename" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">员工性别：</label>
                        <label class="radio-inline">
                            <input type="radio" name="esex" value="男" checked> 男
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="esex" value="女"> 女
                        </label>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">入职日期：</label>
                        <div class="col-md-4"><input type="date" name="estartime" class="form-control"/></div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">工资：</label>
                        <div class="col-md-4">
                            <input type="text" name="epay" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">所在部门：</label>
                        <div class="col-md-4">
                            <select name="did" class="form-control">
                            <option value="-1">==请选择==</option>
                            <%--动态--%>
                            <c:forEach items="${deptList}" var="dept">
                                <option value="${dept.did}">${dept.dname}</option>
                            </c:forEach>
                        </select>
                        </div>
                    </div>
                </form>
            </div>
            <!--第三层：注脚部分-->
            <%--form="addForm":表示按钮提交时，提交到那个表单去！--%>
            <div class="modal-footer">
                <button class="btn btn-primary" form="addForm">添加</button>
                <button class="btn btn-danger" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>

<%--修改功能：模态框--%>
<div class="modal" id="updateModal" tabindex="-1" data-backdrop="static">
    <!--第二层：声明窗口-->
    <div class="modal-dialog">
        <!--第三层：声明窗口里的内容-->
        <div class="modal-content">
            <!--第一层:头部分-->
            <div class="modal-header">
                <!--写出来窗口的关闭按钮
                    class="close":表示这个按钮是关闭窗口的按钮
                    data-dismiss="modal":表示这个按钮可以关闭窗口
                    &times;:表示  × 按钮
                -->
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
                <!--class="modal-title":表示内容的标题-->
                <h4 class="modal-title">修改员工信息</h4>
            </div>
            <!--第二层：主体部分-->
            <div class="modal-body">
                <form action="${pageContext.request.contextPath}/main/modify2" method="post" id="updateForm" class="form-horizontal">
                    <%--隐藏域--%>
                    <%--该eid用来进行传值--%>
                    <input type="hidden" name="eid" id="eid">
                    <div class="form-group">
                        <label class="col-md-3 control-label">员工编号：</label>
                        <%--这里只是用来进行显示--%>
                        <div class="col-md-4">
                            <input type="text" name="update_eid" id="update_eid" class="form-control" disabled/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">员工姓名：</label>
                        <div class="col-md-4">
                            <input type="text" name="ename" id="ename" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">员工性别：</label>
                        <div class="col-md-4">
                            <label class="radio-inline">
                                <input type="radio" name="esex" id="boy" value="男"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="esex" id="girl" value="女"> 女
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">入职日期：</label>
                        <div class="col-md-4">
                            <input type="date" name="estartime" id="estartime" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">工资：</label>
                        <div class="col-md-4">
                            <input type="text" name="epay" id="epay" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">所在部门：</label>
                        <div class="col-md-4">
                            <select name="did" id="update_did" class="form-control">
                                <option value="-1">==请选择==</option>
                                <%--动态--%>
                                <c:forEach items="${deptList}" var="dept">
                                    <option value="${dept.did}">${dept.dname}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <!--第三层：注脚部分-->
            <%--form="addForm":表示按钮提交时，提交到那个表单去！--%>
            <div class="modal-footer">
                <button class="btn btn-primary" form="updateForm">修改</button>
                <button class="btn btn-danger" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>

<%--删除功能的对话提示模态框--%>
<%--删除提示功能--%>
<!-- 模态框   信息删除确认 -->
<div class="modal" id="delModal" data-backdrop="static">
    <div class="modal-dialog">
        <div class="modal-content message_align">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"
                        aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
                <h4 class="modal-title">提示</h4>
            </div>
            <div class="modal-body">
                <%--删除功能的表单--%>
                <form action="${pageContext.request.contextPath}/main/remove" method="post" id="delForm">
                    <%--删除的时候，需要eid传递到后台controller--%>
                    <%--隐藏域--%>
                    <input type="hidden" name="delEid" id="delEid">
                    <p>您确认要删除该条信息吗？</p>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default"
                        data-dismiss="modal">取消</button>
                <input type="submit" class="btn btn-primary" form="delForm" value="确认删除"></input>
            </div>
        </div>
    </div>
</div>

</body>
<script>
    $(function () {
        var element = $('#pagination');
        options = {
            bootstrapMajorVersion:3, //对应的bootstrap版本
            currentPage: ${pageInfo.pageNum}, //当前页数，这里是用的EL表达式，获取从后台传过来的值
            totalPages:${pageInfo.pages}, //总页数，这里是用的EL表达式，获取从后台传过来的值
            itemTexts: function (type, page, current) {//设置显示的样式，默认是箭头
                switch (type) {
                    case "first":
                        return "首页";
                    case "prev":
                        return "上一页";
                    case "next":
                        return "下一页";
                    case "last":
                        return "末页";
                    case "page":
                        return page;
                }
            },
            //点击事件  page:当前的页码
            onPageClicked: function (event, originalEvent, type, page) {
                //处理具体的业务
                //把当前页码发送到后台的controller做分页查询
                //给隐藏域赋值
                $("#pageNum").val(page);
                //提交表单
                $("#myform").submit();
            }
        };
        element.bootstrapPaginator(options);
    })
</script>
<script>
    function toPage(page) {
        $("#pageNum").val(page);
        $("#myform").submit();
    }

    function jump() {
       toPage($("#jumpPage").val())
    }

    function btnAdd() {
        window.location.href="${pageContext.request.contextPath}/jsp/add.jsp";
    }

</script>
<script>
    <c:if test="${msg01 eq 'success'}">
     window.alert("添加员工成功！");
    </c:if>
    <c:if test="${msg01 eq 'fail'}">
    window.alert("添加员工失败！");
    </c:if>
    <c:if test="${msg02 eq 'success'}">
    window.alert("删除员工成功！");
    </c:if>
    <c:if test="${msg02 eq 'fail'}">
    window.alert("删除员工失败！");
    </c:if>
    <c:if test="${msg03 eq 'success'}">
    window.alert("修改员工成功！");
    </c:if>
    <c:if test="${msg03 eq 'fail'}">
    window.alert("修改员工失败！");
    </c:if>

</script>
<script>
    //回显更新功能的参数值
    function mValues(eid,ename,esex,estartime,epay,did) {
        console.log(eid);
        console.log(estartime);
        //给更新模态框的元素赋值
        $("#update_eid").val(eid);
        $("#ename").val(ename);
        //判断
        if(esex=='男'){
            //选中:添加属性：checked
            $("#boy").attr("checked",true);
        }else if(esex=='女'){
            //选中
            $("#girl").attr("checked",true);
        }
        //先把日期字符串转换成日期
        var date = convertDateFromString(estartime);
        //再把日期转换成字符串形式：yyyy-MM-dd
        var format = timeStamp2String(date.getTime());
        $("#estartime").val(format);
        $("#epay").val(epay);
        $.each($("#update_did>option"),function (i, e) {
            //console.log(e);
            if(e.value==did){
                $(e).attr("selected",true);
            }
        });
        //给隐藏域的update_eid值
        $("#eid").val(eid);
    }
</script>
<script>
    /*只点击了删除按钮*/
    function toDel(eid) {
        //把获取的参数的eid赋值给删除功能隐藏域
        $("#delEid").val(eid);
    }
</script>
</html>



















