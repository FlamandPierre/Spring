<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <spring:url var="localeFr" value="">
        <spring:param name="locale" value="fr"/>
    </spring:url>
    <spring:url var="localeEn" value="">
        <spring:param name="locale" value="en"/>
    </spring:url>
</head>
<body>
<div>
    <a href="${localeEn}">
        <img alt="en" src='<spring:url value="/images/localeEn.png"/>' width="60" height="40"/>
    </a>
    <a href="${localeFr}">
        <img alt="fr" src='<spring:url value="/images/localeFr.png"/>' width="60" height="40"/>
    </a>
</div>
<div>
    <tiles:insertAttribute name="main-content"/>
</div>
<div>
    Footer : ...
</div>
</body>
</html>