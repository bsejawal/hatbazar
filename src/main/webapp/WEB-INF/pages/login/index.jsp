<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container">
    <form:form class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <form:input path="username" type="text" placeholder="Email address" class="input-block-level" />
        <form:password path="password" placeholder="Password" class="input-block-level" />
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> Remember me
        </label>
        <button type="submit" class="btn btn-large btn-primary">Sign in</button>
    </form:form>
</div>