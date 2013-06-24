<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="span13">
    <div class="hero-unit">
        <h4 class="pull-left">List</h4>
        <a href="#myModal" role="button" data-toggle="modal" class="pull-right" onclick="prepareItemForm('new','0',this)" title="Add New Item">Add New Item</a>
        <table class="table table-striped">
            <tr>
                <th>Name</th>
                <th>Category</th>
                <th>Added By</th>
                <th>Price</th>
                <th>Status</th>
                <th>Contact Person</th>
                <th>Contact Phone</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.category}</td>
                    <td>${item.addedBy}</td>
                    <td>${user.price}</td>
                    <td>${user.status}</td>
                    <td>${user.contactPerson}</td>
                    <td>${user.contactPhone}</td>
                    <td><a href="#myModal" role="button" class="icon-edit" data-toggle="modal" title="Edit" onclick="prepareItemForm('edit','${user.id}',this)"></a>&nbsp;&nbsp;<a href="/item/delete?id=${user.id}" onclick="return confirm('Are you sure to delete?')" class="icon-remove" title="Delete"></a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>