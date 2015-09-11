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
    <link rel="stylesheet" href="/css/test.css">
    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <style>
        #rcorners2 {
            border-radius: 25px;
            border: 2px solid #8AC007;
            padding: 20px;
            width: 320px;
            height: 380px;
            margin-top: 200px;
        }


    </style>
</head>
<body>

<div class="container" id="rcorners2">

    <header class="w3-container w3-light-green">
        <h4><small>Welcome</small> Demak Pvt Ltd</h4>
    </header>
    <div class="w3-container" style="padding-top: 2px">
        <form role="form" action="loginAction">
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" style="width: 250px">
            </div>
            <div class="form-group">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password" style="width: 250px">
            </div>
            <div class="checkbox">
                <label><input type="checkbox"> Remember me</label>
            </div>

            <button type="reset" class="btn btn-default">Reset</button>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>

    </div>

</div>

</body>
</html>
