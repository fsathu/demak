<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body onload="greeting()">

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Demak Pvt Ltd</a>
    </div>
    <div>
      <ul class="nav navbar-nav">

        <li class="active"><a href="<s:url action ="viewHome"/>">Home</a></li>
          <s:set name="uType" value="%{#session.userType}"/>
          <s:if test="%{#uType == 'admin' || #uType == 'semi_admin' || #uType == 'cashier'}">
          <li><a href="<s:url action ="viewInvoice"/>">Invoice</a></li>
</s:if>
<<s:if test="%{#uType == 'admin' || #uType == 'semi_admin' || #uType == 'store_keeper'}">
        <li><a href="<s:url action ="viewProducts"/>">Product Details</a></li>
  </s:if>
          <s:if test="%{#uType == 'admin' || #uType == 'semi_admin' || #uType == 'cashier'}">
        <li><a href="#">Cash Summary</a></li>
  </s:if>
          <s:if test="%{#uType == 'admin' || #uType == 'semi_admin' || #uType == 'store_keeper'}">
        <li><a href="#">Stock Summary</a></li>
  </s:if>
          <li><a href="#">Reports</a></li>
          <li><a href="#">Security Details</a></li>
          <li><a href="<s:url action ="viewUserCreation"/>">Users Accounts</a></li>
        <li><a href="#">Contact Us</a></li>

      </ul>
      <ul class="nav navbar-nav navbar-fixed-bottom navbar-inverse">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> <i id="greet"></i> <i>${sessionScope.email}</i></a></li>
        <li><a href="<s:url action="logout"/>"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
 </div>

</body>
</html>

<script type="text/javascript">
  var greet=document.getElementById("greet");
  function greeting(){
    var time=new Date()
    var hours=time.getHours()
    var hello="Hello, Nightowl!"
    if (hours>5 && hours < 12){
      hello="Good Morning!"
    }
    if (hours>12 && hours < 15){
      hello="Good Day!"
    }
    if (hours>16){
      hello="Good Evening!"
    }
    if (hours>22){
      hello="Good Night!"
    }
    greet.innerHTML=hello;
  }
</script>