<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <form method="post" action="/user/save">
        <div class="modal-header">
            <a href="javascript:void(0)" class="icon-remove pull-right" data-dismiss="modal" aria-hidden="true"></a>
            <h3 id="myModalLabel">test header</h3>
        </div>
        <div class="modal-body">
            <p>
            <div class="span9">
                <div class="hero-unit">
                    <table class="table table-striped" id="userForm">
                        <tr>
                            <td><label for="name">Name</label></td>
                            <td>:</td>
                            <td><input type="text" name="name" id="name" value="" /> </td>
                        </tr>
                        <tr>
                            <td><label for="address">Address</label></td>
                            <td>:</td>
                            <td><input type="text" name="address" id="address" value="" /> </td>
                        </tr>
                        <tr>
                            <td><label for="email">Email</label></td>
                            <td>:</td>
                            <td><input type="text" name="email" id="email" /></td>
                        </tr>
                        <tr>
                            <td><label for="phone">Phone</label></td>
                            <td>:</td>
                            <td><input type="text" name="phone" id="phone" /></td>
                        </tr>
                        <tr>
                            <td><label>User Role</label></td>
                            <td>:</td>
                            <td>
                                <p>
                                    <label class="pull-left" for="user_admin">ADMIN &nbsp;<input type="radio" name="type" value="ADMIN" id="user_admin" />&nbsp;&nbsp;&nbsp;&nbsp;</label>
                                    <label class="pull-left" for="user_normal">NORMAL &nbsp;<input type="radio" name="type" value="NORMAL" id="user_normal" /></label>
                                </p>
                            </td>
                        </tr>
                        <tr id="tr-username">
                            <td><label for="username">Username</label></td>
                            <td>:</td>
                            <td><input type="text" name="username" id="username" /></td>
                        </tr>
                        <tr id="tr-password">
                            <td><label for="password">Password</label></td>
                            <td>:</td>
                            <td><input type="password" name="password" id="password" /></td>
                        </tr>
                        <tr id="tr-rpassword">
                            <td><label for="rpassword">Re-Enter Password</label></td>
                            <td>:</td>
                            <td><input type="password" name="rpassword" id="rpassword" /></td>
                        </tr>
                    </table>
                </div>
            </div>
            </p>
        </div>
        <div class="modal-footer">
            <input type="reset" class="btn" data-dismiss="modal" aria-hidden="true" value="Close" />
            <input type="submit" class="btn btn-primary" value="Save changes" />
        </div>
    </form>
</div>
