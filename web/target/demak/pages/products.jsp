<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net" %>

<html>
<head>

  <style>
    .center {
      margin: auto;

      padding: 10px;
    }
    .welcome {
      background-color:#DDFFDD;
      border:1px solid #009900;
      width:200px;
      border-radius: 25px;
    }
    .welcome li{
      list-style: none;
    }
    .errors {
      background-color:#FFCCCC;
      border:1px solid #CC0000;
      width:400px;
      margin-bottom:8px;
      border-radius: 25px;
    }
    .errors li{
      list-style: none;
    }
  </style>
  <link rel="stylesheet" href="/css/bootstrap.min.css">

</head>
<body>
<div class="center">
  <s:if test="hasActionErrors()">
    <div class="errors">
      <s:actionerror/>
    </div>
  </s:if>
  <s:if test="hasActionMessages()">
    <div class="welcome">
      <s:actionmessage/>
    </div>
  </s:if>
  <div class="container-fluid " style="margin-left: 400px">
    <s:form action="addProduct">
      <div class="row" style="padding-bottom: 10px">
        <div class="col-xs-4">
          <label for="productName">Product Name :</label>
          <input class="form-control" id="productName" type="text" name="productName">
        </div>
      </div>
      <div class="row" style="padding-bottom: 10px">
        <div class="col-xs-4">
          <label for="productCat">Barcode :</label>
          <input class="form-control" id="productCat" type="text" name="barcode">
        </div>
      </div>
      <div class="row" style="padding-bottom: 10px">
        <div class="col-xs-4">
          <label for="sellingPrice">Selling Price :</label>
          <input class="form-control" id="sellingPrice" type="text" name="sellingPrice">
        </div>
      </div>
      <div class="row" style="padding-bottom: 10px">
        <div class="col-xs-4">
          <label for="buyingPrice">Buying Price :</label>
          <input class="form-control" id="buyingPrice" type="text" name="buyingPrice">
        </div>
      </div>
      <div class="row" style="padding-bottom: 10px">
        <div class="col-xs-4">
          <label for="qty">Qty :</label>
          <input class="form-control" id="qty" type="text" name="qty">
        </div>
      </div>
      <div class="row" style="padding-bottom: 10px">
        <s:submit value="Save" cssClass="btn btn-primary"></s:submit>
        <s:reset value="Reset" cssClass="btn btn-danger"></s:reset>
      </div>
    </s:form>

  </div>
</div>
</body>
</html>
