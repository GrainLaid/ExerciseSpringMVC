<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>User Info</title>
</head>
<body>

<h2>User Information</h2>
<table>
    <tr>
        <td>Id</td>
        <td>${id}</td>
    </tr>
    <tr>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Nickname</td>
        <td>${users.userName}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${users.email}</td>
    </tr>

</table>
</body>
</html>