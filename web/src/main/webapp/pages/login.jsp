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
            background-color: #595959;
            background-image: url("page-background.png");


        }
        .fonts{
            color: white;
        }

    </style>
</head>
<body>

<div class="w3-card-24" id="rcorners2">


    <div class="w3-container" style="padding-top: 2px">
        <form role="form" action="loginAction">
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
                <label class="fonts"><input type="checkbox"> Remember me</label> | <a href="#" class="fonts">Sign Up</a>
            </div>

            <button type="reset" class="btn btn-default">Reset</button>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>

    </div>

</div>

</body>
</html>
