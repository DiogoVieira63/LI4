<%--
  Created by IntelliJ IDEA.
  User: facsc
  Date: 20/01/2022
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration From</title>
</head>
<body>

<h1>Register Account</h1>

<p>${error}</p>

<form method="post" action="/register">

    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br>

    <label for="phone">Phone:</label>
    <input type="number" id="phone" name="phone" maxlength="9"><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br>

    <label for="confirmPassword">Confirm Password:</label>
    <input type="password" id="confirmPassword" name="confirmPassword"><br>

    <button type="submit">Create Account</button>
</form>

</body>
</html>
