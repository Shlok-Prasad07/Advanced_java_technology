package com.P7;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class ErrorHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        
        // Throwable is the parent class of Exception and Error
        Throwable e = (Throwable) request.getAttribute(
                "javax.servlet.error.exception");    // standard attribute

        response.getWriter().println(
                "<h2>Something went wrong!</h2>");

        response.getWriter().println(
                "<p>Error: " + e.getMessage() + "</p>");
    }
}