<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@include file="include/importTags.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <title> Welcome </title>
    </head>
    <body>
        <form:form  id="magicKeyForm"
                    method="POST"
                    action="/firstSpring/hello/send"
                    modelAttribute="magicKeyForm">
            <form:label path="magicKey">Magic Key</form:label>
            <form:input path="magicKey"/>
            <form:button>Send</form:button>
        </form:form>
    </body>
</html>