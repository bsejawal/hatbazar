<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
    $(document).ready(function(){
        adminTab("${tab}");
    });
</script>
<ul class="nav nav-tabs" id="myTab">
    <li class="active"><a id="tab-profile" data-toggle="tab" href="#profile">Profile</a></li>
    <c:if test="${sessionScope.userType=='SUPER'}">
    <li><a id="tab-list" data-toggle="tab" href="#user-list">List</a></li>
    </c:if>
</ul>
<div class="tab-content" id="myTabContent">
    <div id="profile" class="tab-pane fade in active">
        <p><jsp:include page="profile.jsp" flush="true" /></p>
    </div>
    <c:if test="${sessionScope.userType=='SUPER'}">
    <div id="user-list" class="tab-pane fade">
        <p><jsp:include page="list.jsp" flush="true" /></p>
    </div>
    <jsp:include page="form.jsp" flush="true" />
    </c:if>
</div>