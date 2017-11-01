<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Employee</title>
</head>
<body>
    <c:forEach items="${lstName}" var="item">

        <h4>${item.name}</h4>

    </c:forEach>
</body>
</html>