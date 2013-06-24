<script type="text/javascript">
    $(document).ready(function(){
        adminTab("${tab}");
    });
</script>
<ul class="nav nav-tabs" id="myTab">
    <li class="active"><a id="tab-profile" data-toggle="tab" href="#profile">List</a></li>
    <li><a id="tab-user_list" data-toggle="tab" href="#user-list">List</a></li>
</ul>
<div class="tab-content" id="myTabContent">
    <div id="profile" class="tab-pane fade in active">
        <p><jsp:include page="list.jsp" flush="true" /></p>
    </div>
    <div id="user-list" class="tab-pane fade">
        <p><jsp:include page="list.jsp" flush="true" /></p>
    </div>
    <jsp:include page="form.jsp" flush="true" />
</div>