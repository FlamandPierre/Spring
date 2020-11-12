<%@ page pageEncoding="UTF-8"
         contentType="text/html; charset=UTF-8"%>
<%@include file="include/importTags.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>userInscription</title>
</head>
<body>
    <form:form id="userIncription"
               method="POST"
               action="/firstSpring/inscription/send"
               modelAttribute="user">
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
        <form:errors path="name"/>
        <form:label path="age">Age</form:label>
        <form:input path="age"/>
        <form:errors path="age"/>
        <form:radiobutton path="male" value="true" label="Boy"/>
        <form:radiobutton path="male" value="false" label="Girl"/>
        <form:select path="hobby">
            <form:options items="${hobbies}" itemValue="id" itemLabel="name"/>
        </form:select>
        <form:button>Send</form:button>

    </form:form>
</body>
</html>
