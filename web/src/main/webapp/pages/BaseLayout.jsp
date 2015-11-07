<%--
  Created by IntelliJ IDEA.
  User: fredrick
  Date: 8/22/15
  Time: 7:01 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

  <link rel="stylesheet" href="../css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <title></title>

</head>
<body>
<div id="header">
  <tiles:insertAttribute name="header" />
</div>
<div id="body">
 <tiles:insertAttribute name="body"/>
</div>



</body>
</html>
