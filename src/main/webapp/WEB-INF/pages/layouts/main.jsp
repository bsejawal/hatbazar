<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
    <title>Hatbazar</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <jsp:include page="_resources.jsp"/>
    <decorator:head/>
</head>
<body>
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
                    <li class="active"><a href="/">Home</a></li>
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
    <decorator:body/>
<jsp:include page="footer.jsp" flush="true"/>
</body>
</html>