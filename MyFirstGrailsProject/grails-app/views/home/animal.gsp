<%--
  Created by IntelliJ IDEA.
  User: shivam
  Date: 11/04/22
  Time: 4:57 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <ol>
        <g:each in="${animalListKey}" var="animalList">
            <li>${animalList}</li>
        </g:each>
    </ol>
</body>
</html>