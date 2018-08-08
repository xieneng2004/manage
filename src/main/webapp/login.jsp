<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <script src="/js/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="/js/bootstrap.min.js" type="text/javascript"></script>

    <title>欢迎使用</title>

    <style type="text/css">
        .login-area{
            padding: 40px;
            border-radius: 15px;
            background: #56666B;
            color: #fff;
        }
    </style>

</head>

<body>

<div class="container" id="top" >
    <div class="row" style="margin-top: 300px">
        <div class="col-md-4"></div>
        <div class="col-md-4 login-area" id="login-box">
            <form class="form-horizontal" role="form" action="/user/login" id="topForm" method="post">
                <div class="form-group">
                    <label for="username" class="col-sm-3 control-label">用户名</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">密码</label>
                    <div class="col-sm-9">
                        <input type="password" class="form-control" name="password" id="password" placeholder="请输入密码">
                    </div>
                </div>

                <div>
                    <div class="col-sm-offset-3 col-sm-8" style="margin-top: 15px">
                        <button type="submit" class="btn btn-default btn-success">登陆</button>
                        <button type="reset" class="btn btn-default btn-info pull-right">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(document).ready(function(){
        $("#login").click(function(){
            var username = $("#username").val();
            if(username=='undefined'||username==""){
                alert('请输入用户名');
                return false;
            }
            var password = $("#password").val();
            if(password=='undefined'||password==""){
                alert('请输入密码');
                return false;
            }
        });
    });
</script>


</body>
</html>
