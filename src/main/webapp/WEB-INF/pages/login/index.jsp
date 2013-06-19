<meta name="decorator" content="login"/>
<jsp:include page="../layouts/flashMessage.jsp" flush="true" />
<div class="container"><br/><br/><br/><br/><br/><br/>
    <form class="form-signin" action="/login/authenticate" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" name="username" class="input-block-level" placeholder="Username" />
        <input type="password" name="password" class="input-block-level" placeholder="Password" />
        <input class="btn btn-large btn-primary" type="submit" value="Sign in" />
    </form>

</div>
