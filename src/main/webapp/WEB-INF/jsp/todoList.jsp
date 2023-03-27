<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>ToDo Page</title>
</head>
<body>
<form>
    <div>
        Hi ${name}, your To-Do's are:
    </div>
    <div>
        <td>
            ${todos}
        </td>
    </div>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Desciption</th>
            <th>Target Date</th>
            <th>Done</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.isDone}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</body>
</html>