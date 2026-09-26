<%@ page errorPage="error.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <%
        // Read inputs
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        String op = request.getParameter("op");
        double result = 0;

        switch(op) {
            case "Add":
                result = a + b;
                break;
            case "Subtract":
                result = a - b;
                break;
            case "Multiply":
                result = a * b;
                break;
            case "Divide":
                result = a / b;   // Will throw exception if b=0
                break;
        }
    %>

    <h3>Operation: <%= op %></h3>
    <h3>Result: <%= result %></h3>
    <br>
    <a href="index.html">Go Back 🔙</a>
</body>
</html>
