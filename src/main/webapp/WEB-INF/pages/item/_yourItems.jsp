<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="span13">
    <div class="hero-unit">
        <h4 class="pull-left">List</h4>
        <a href="#myModal" role="button" data-toggle="modal" class="pull-right" onclick="prepareItemForm('new','0',this)" title="Add New Item">Add New Item</a>
        <table class="table table-striped">
            <tr>
                <th>Name</th>
                <th>Category</th>
                <th>Price</th>
                <th>Status</th>
                <th>Contact Person</th>
                <th>Contact Phone</th>
                <th>Details</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${yourList}" var="item">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.category}</td>
                    <td>${item.price}</td>
                    <td>${item.status}</td>
                    <td>${item.contactPerson}</td>
                    <td>${item.contactPhone}</td>
                    <td>${item.details}</td>
                    <td>
                        <a href="#myModal" role="button" class="icon-edit" data-toggle="modal" title="Edit" onclick="prepareItemForm('edit','${item.id}',this)"></a>&nbsp;&nbsp;
                        <a href="/item/delete?id=${item.id}" onclick="return confirm('Are you sure to delete?')" class="icon-remove" title="Delete"></a>
                        <c:if test="${item.status=='ACTIVE'}">
                            <a href="/item/reserve?id=${item.id}" onclick="return confirm('Are you really want to  Reserve this?')" class="btn btn-inverse" title="Reserve">Reserve</a>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>