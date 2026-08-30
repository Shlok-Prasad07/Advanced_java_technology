package com.P7;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.isEmpty() ||
            password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Username or password cannot be empty");
        }

        if (username.equals("admin") &&
            password.equals("admin123")) {

            response.setContentType("text/html");

            response.getWriter().println(
                    "<h2>Login Successful</h2>");

        } else {

            throw new ServletException(
                    "Invalid username or password");
        }
    }
}