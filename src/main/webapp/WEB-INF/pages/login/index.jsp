<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="login">
    <fieldset>
        <lagend>Secure Login System</lagend>
        <form:form method="post" action="login/authencate">
        <table>
            <tr>
                <td><form:label path="username">Username</form:label></td>
                <td><form:input path="username" /></td>
            </tr>

            <tr>
                <td><form:label path="password">Password</form:label></td>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Login"/>
                </td>
            </tr>
        </table>
        </form:form>
    </fieldset>
</div>