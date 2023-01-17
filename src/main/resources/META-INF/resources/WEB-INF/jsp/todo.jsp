<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Todos Page</title>
</head>
<body>
<div>Your name ${name}</div>
<div>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="mb-3">
        <form:label path="description">Description</form:label>
        <form:input type="text" path="description" name="description" required="required" />
        <form:errors path="description" />
        </fieldset>

        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input type="text" path="targetDate" name="description" required="required" />
            <form:errors path="targetDate" />
        </fieldset>

        <form:input type="hidden" path="id" name="description"  />
        <form:input type="hidden" path="done" name="description"  />
        <input type="submit" class="btn btn-success" />
    </form:form>
</div>

</body>
</html>