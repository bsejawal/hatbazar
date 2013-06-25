<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="span13">
    <div class="hero-unit">
        <h4 class="pull-left">Reserved Items</h4>
        <table class="table table-striped">
            <tr>
                <th>Name</th>
                <th>Category</th>
                <th>Price</th>
                <th>Contact Person</th>
                <th>Contact Phone</th>
                <th>Details</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${reservedList}" var="item">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.category}</td>
                    <td>${item.price}</td>
                    <td>${item.contactPerson}</td>
                    <td>${item.contactPhone}</td>
                    <td>${item.details}</td>
                    <td>
                        <a href="/item/cancelReserved?id=${item.id}" role="button" class="btn btn-inverse"  title="Cancel This Reserved" onclick="return confirm('Are you really want to cancel this reserved?')">Cancel Reserved</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>