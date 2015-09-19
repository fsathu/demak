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
      color: #5bb75b;
      width:100%;
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
    body {

      /*background-image: url("page-background.png");*/


    }
    .row{
      margin-bottom: 10px;
    }
  </style>
  <link rel="stylesheet" href="/css/bootstrap.min.css">

</head>
<body>
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
<div class="center">

  <div class="container-fluid " style="margin-left: 400px">
    <s:form action="addProduct">
      <div class="row" style="padding-bottom: 10px">
        <div class="col-xs-4">
          <label for="productName">Product Name :</label>
          <input class="form-control" id="productName" type="text" name="productName">
        </div>
      </div>
      <div class="row">
        <div class="col-xs-4">
          <label for="productCat">Barcode :</label>
          <input class="form-control" id="productCat" type="text" name="barcode">
        </div>
      </div>
      <div class="row">
        <div class="col-xs-4">
          <label for="sellingPrice">Selling Price :</label>
          <input class="form-control" id="sellingPrice" type="text" name="sellingPrice" required="true">
        </div>
      </div>
      <div class="row">
        <div class="col-xs-4">
          <label for="buyingPrice">Buying Price :</label>
          <input class="form-control" id="buyingPrice" type="text" name="buyingPrice">
        </div>
      </div>
      <div class="row">
        <div class="col-xs-4">
          <label for="qty">Qty :</label>
          <input class="form-control" id="qty" type="text" name="qty">
        </div>
      </div>
      <div class="row">
        <div class="col-xs-4">
          <button type="reset" class="btn btn-default">Reset</button>
          <button type="submit" class="btn btn-primary">Save</button>
        </div>

      </div>

    </s:form>

  </div>
</div>
<display:table class="table table-striped table-bordered" id="collection" name="productsList"
               pagesize="5" requestURI="loadList">
  <display:column property="productName" title="Product Name"/>
  <display:column property="buyingPrice" title="Buying Price"/>
  <display:column property="sellingPrice" title="Selling Price"/>
  <display:column property="qty" title="Quantity"/>
  <display:column property="expiryDate" title="Expiry Date"/>
  <display:column property="lastUpdateDate" title="Last Updated Date"/>
  <display:column titleKey="table.label.chargeType.edit">
    <a href="<s:url action='#'>
							<s:param name='chargeTypeId'><s:property value='%{#attr.chargeType.id}'/></s:param></s:url>">
      <s:text name="edit"/>
    </a>
  </display:column>
</display:table>
</body>
</html>
