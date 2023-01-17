<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<%--<div>Your todos are ${todos} </div>--%>
<div>Your name ${name}</div>
<div>
    <h1>Your Todos</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is Done?</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td><a href="delete-todo?id=${todo.id}" class="btn btn-success">Delete</a></td>
                <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add todo</a>

</div>

</body>
</html>