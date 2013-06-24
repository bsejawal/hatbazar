<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="span13">
    <div class="hero-unit">
        <h4 class="pull-left">List</h4>
        <a href="#myModal" role="button" data-toggle="modal" class="pull-right" onclick="prepareUserForm('new','0',this)" title="Add New User">Add New User</a>
        <table class="table table-striped">
            <tr>
                <th>Name</th>
                <th>Address</th>
                <th>Email</th>
                <th>Phone</th>
                <th>User Type</th>
                <th>Username</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${list}" var="user">
                <tr>
                    <td>${user.name}</td>
                    <td>${user.address}</td>
                    <td>${user.email}</td>
                    <td>${user.phone}</td>
                    <td>${user.type}</td>
                    <td>${user.username}</td>
                    <td><a href="#myModal" role="button" class="icon-edit" data-toggle="modal" title="Edit" onclick="prepareUserForm('edit','${user.id}',this)"></a>&nbsp;&nbsp;<a href="/user/delete?id=${user.id}" onclick="return confirm('Are you sure to delete?')" class="icon-remove" ></a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>