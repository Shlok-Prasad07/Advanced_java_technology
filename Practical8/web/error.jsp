<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <h2 style="color:red;">Something went wrong. Please try again.</h2>
    <p><b>Error Details:</b> <%= exception %></p>
    <br>
    <a href="index.html">Go Back</a>
</body>
</html>