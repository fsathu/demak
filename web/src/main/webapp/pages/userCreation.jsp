
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="container-fluid">
<s:form action="createUser">
    <div class="row" style="margin-left: 300px">
        <div class="col-sm-4">
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-8">
                    <label for="fn">First Name :*</label>
<<<<<<< HEAD
                    <input class="form-control" id="fn" type="text" name="personalDetails.first_name">
                </div>

=======
                    <input class="form-control" id="fn" type="text" name="first_name">
                </div>
>>>>>>> e9243e234f4ad7d1e07b0ecf65a20ca1edbd36b9
            </div>
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-8">
                    <label for="ln">Last Name :</label>
<<<<<<< HEAD
                    <input class="form-control" id="ln" type="text" name="personalDetails.last_name">
=======
                    <input class="form-control" id="ln" type="text" name="last_name">
>>>>>>> e9243e234f4ad7d1e07b0ecf65a20ca1edbd36b9
                </div>
            </div>
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-8">
                    <label for="age">Age :</label>
<<<<<<< HEAD
                    <input class="form-control" id="age" type="text" name="personalDetails.age">
=======
                    <input class="form-control" id="age" type="text" name="age">
>>>>>>> e9243e234f4ad7d1e07b0ecf65a20ca1edbd36b9
                </div>
            </div>
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-8">
                    <label for="gen">Gender :</label>
<<<<<<< HEAD
                    <input class="form-control" id="gen" type="text" name="personalDetails.gender">
=======
                    <input class="form-control" id="gen" type="text" name="gender">
>>>>>>> e9243e234f4ad7d1e07b0ecf65a20ca1edbd36b9
                </div>
            </div>
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-8">
                    <label for="privilage">User Type :</label>
                    <select class="form-control" id="privilage" name="privilage">
                        <option value="0" selected>Select</option>
                        <option value="admin">Admin</option>
                        <option value="semi_admin">Semi-Admin</option>
                        <option value="cashier">Cashier</option>
                        <option value="store_keeper">Store-Keeper</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-8">
                    <label for="email">Email :</label>
                    <input class="form-control" id="email" type="email" name="email">
                </div>
            </div>
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-8">
                    <label for="pw">Password :</label>
                    <input class="form-control" id="pw" type="password" name="password">
                </div>
            </div>
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-8">
                    <label for="cpw">Confirm Password :</label>
                    <input class="form-control" id="cpw" type="password">
                </div>
            </div>
            <div class="row" style="padding-bottom: 10px">
                <div class="col-xs-8">
                    <label for="isActive">Is Active :</label>
                    <input class="" id="isActive" type="checkbox" name="isActive" value="true">
                    <%--<s:checkbox name="isActive" fieldValue="true" label="Is Active"/>--%>
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Save User</button>
        </div>

    </div>



</s:form>
</div>
</body>
</html>
