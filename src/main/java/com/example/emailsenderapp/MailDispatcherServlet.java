package com.example.emailsenderapp;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "MailDispatcherServlet", value = "/MailDispatcherServlet")
public class MailDispatcherServlet extends HttpServlet {
    private String message;

    /**
     * method used to initialize
     */
    public void init() {
        message = "Hello World!";
    }


    /**
     * @param request
     * @param response
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}