<%--
  Created by IntelliJ IDEA.
  User: bsejawal
  Date: 6/24/13
  Time: 9:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="flashMessage.jsp" flush="true" />
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar" type="button">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="/" class="brand">Haatbazar</a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li><a href="/about">About</a></li>
                    <li><a href="/contact">Contact</a></li>
                    <c:choose>
                        <c:when test="${isLogin}">
                            <li><a href="/user">Admin Pannel</a></li>
                            <li><a href="/item">Manage Items</a></li>
                            <li><a href="/login/logout">Logout</a></li>
                        </c:when>
                        <c:otherwise><li><a href="/login">Login</a></li></c:otherwise>
                    </c:choose>
                </ul>
                <form class="navbar-form pull-right" action="#" method="post">
                    <input type="search" placeholder="Search" class="span2">
                    <button class="btn" type="submit">OK</button>
                </form>
            </div>
        </div>
    </div>
</div><br /><br /><br />