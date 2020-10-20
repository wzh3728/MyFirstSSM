<%--
  AUthor: wzh
  Date: 2020/10/20
  Time: 20:54
  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            getAllUsers();
            $("#getAllUsers").click(function () {
                getAllUsers()
            })

            function getAllUsers() {
                $.ajax({
                    url: "getAllUsers.do",
                    success: function (res) {
                        console.log(res)
                        $("#info").html("");
                        $.each(res, function (i, data) {
                            $("#info").append("<tr>")
                                .append("<td>" + data.id + "</td>")
                                .append("<td>" + data.name + "</td>")
                                .append("<td>" + data.password + "</td>")
                                .append("<td>" + data.sex + "</td>")
                        });

                    }
                })
            }

            $("#getUserById").click(function () {
                var uid = $("#uid").val();
                getUser(uid);
            })

            function getUser(uid) {
                $.ajax({
                    url: "getUserById.do",
                    data: {
                        id: uid
                    },
                    success: function (res) {
                        $("#user").html("id"+res.id+"name"+res.name+"password"+res.password+"sex"+res.sex)
                        return res;
                    }
                })
            }

            $("#addUser").click(function () {
                var name = $("#name").val();
                var sex = $("#sex").val();
                var password = $("#password").val();
                adduser(name,password,sex)
            })

            function adduser(uname, upassword, usex) {
                $.ajax({
                    url: "addUser.do",
                    data: {
                        name: uname,
                        password: upassword,
                        sex: usex
                    },
                    success: function (res) {
                        alert(res)
                        return res;
                    }
                })
            }
        })


    </script>
</head>
<body>
<table align="center">
    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>password</td>
        <td>sex</td>
    </tr>
    </thead>
    <tbody id="info">

    </tbody>
</table>
<button id="getAllUsers">获取所有数据</button>
<br>
<div id="user" style="width: 100px;height: 100px;background: aqua"></div>
<input type="text" name="uid" id="uid">
<button id="getUserById">获取id、用户</button>
<br>
name:<input type="text" name="name" id="name"><br>
password:<input type="text" name="password" id="password"><br>
sex:<input type="text" name="sex" id="sex"><br>
<button id="addUser">add</button>
</body>
</html>
