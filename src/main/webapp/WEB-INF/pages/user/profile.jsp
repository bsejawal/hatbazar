<div class="span9">
    <div class="hero-unit">
        <h4 class="pull-left">Profile</h4>
        <a href="#myModal" role="button" data-toggle="modal" class="pull-right icon-edit" onclick="prepareForm('profile','${user.id}',this)" title="Edit Your Profile"></a>
        <table class="table table-striped">
            <tr><td>Name</td><td>:</td><td>${user.name}</td></tr>
            <tr><td>Address</td><td>:</td><td>${user.address}</td></tr>
            <tr><td>Email</td><td>:</td><td>${user.email}</td></tr>
            <tr><td>Phone</td><td>:</td><td>${user.phone}</td></tr>
            <tr><td>User Type</td><td>:</td><td>${user.type}</td></tr>
            <tr><td>Username</td><td>:</td><td>${user.username}</td></tr>
        </table>
    </div>
</div>