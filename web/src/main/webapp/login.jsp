<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">

    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <style>
        #rcorners2 {
            border-radius: 25px;
            border: 2px solid #8AC007;
            padding: 20px;
            width: 320px;
            height: 380px;
            margin-top: 200px;
            margin-left: 500px;

        }
        body {
            /*background-color: #595959;*/
            background-image: url("page-background.png");


        }
        .fonts{
            color: white;
        }
        .errors {
            background-color:#FFCCCC;
            margin-top:8px;
            height: auto;
            width:100%;
            color: #ee5f5b;
            margin-bottom:8px;
            border-radius: 25px;
        }
        .errors li{
            list-style: none;
        }

    </style>
</head>
<body>
<s:if test="hasActionErrors()">
    <div class="errors">
        <s:actionerror/>
    </div>
</s:if>

<div class="w3-card-24" id="rcorners2">
    <div class="w3-container" style="padding-top: 2px">
        <form role="form" action="loginAction" method="post">
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-12">
                    <label for="email" class="fonts">Email:</label>
                    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                </div>
            </div>
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-12">
                    <label for="pwd" class="fonts">Password:</label>
                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password" >
                </div>
            </div>

            <div class="checkbox">
                <label class="fonts"><input type="checkbox" id="chkBox" onclick="test()" style="visibility: hidden"> Remember me</label> | <a href="#" class="fonts" data-toggle="modal" data-target="#myModal">Forgot Password?</a>
            </div>

            <button type="reset" class="btn btn-default" id="reset">Reset</button>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>

    </div>

</div>
<!-- Modal -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Reset Password</h4>
            </div>
            <div class="modal-body">
                <div class="w3-container" style="padding-top: 2px">
                    <form role="form" action="test" method="post">

                            <div class="row" style="padding-bottom: 10px">
                                <div class="col-xs-10">
                                    <label for="modalemail">Email:</label>
                                    <input type="email" class="form-control" id="modalemail" placeholder="Enter email" name="email">
                                </div>
                            </div>


                        <button type="submit" class="btn btn-primary">Reset</button>
                    </form>

                </div>
            </div>
        </div>

    </div>
</div>

</body>
</html>
<script type="text/javascript">

            function hello(){
                alert("Hello World")
            }

</script>