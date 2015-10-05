
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="container-fluid ">
<s:form action="createUser">
  <div class="row" style="padding-bottom: 10px">
    <div class="col-xs-3">
      <label for="fn">First Name :</label>
      <input class="form-control" id="fn" type="text" name="first_name">
    </div>
  </div>
    <div class="row" style="padding-bottom: 10px">
    <div class="col-xs-3">
      <label for="ln">Last Name :</label>
      <input class="form-control" id="ln" type="text" name="last_name">
    </div>
  </div>
  <div class="row" style="padding-bottom: 10px">
    <div class="col-xs-3">
      <label for="age">Age :</label>
      <input class="form-control" id="age" type="text" name="age">
    </div>
    </div>
    <div class="row" style="padding-bottom: 10px">
    <div class="col-xs-3">
      <label for="gen">Gender :</label>
      <input class="form-control" id="gen" type="text" name="gender">
    </div>
  </div>
  <div class="row" style="padding-bottom: 10px">
    <div class="col-xs-3">
      <label for="ut">User Type :</label>
      <input class="form-control" id="ut" type="text" name="age">
    </div>
  </div>
</s:form>
</div>
</body>
</html>
