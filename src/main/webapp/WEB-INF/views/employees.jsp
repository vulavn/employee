<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Employee</title>
</head>
<body>
    <h3>List Department</h3>
    <c:forEach items="${lstDepartment}" var="item">
        <h4>${item.deptName} : ${item.location}</h4>
    </c:forEach>

    <br/>

    <c:forEach items="${lstEmployee}" var="item">
        <h4>${item.empName}</h4>
    </c:forEach>
</body>
</html>