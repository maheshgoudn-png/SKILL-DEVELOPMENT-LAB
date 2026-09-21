package com.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookieLogin")
public class CookieLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");

        // Create cookie
        Cookie userCookie = new Cookie("username", username);

        // Cookie remains for 1 hour
        userCookie.setMaxAge(60 * 60);

        // Add cookie to response
        response.addCookie(userCookie);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Cookie Session</title></head>");
        out.println("<body>");

        out.println("<h2>Cookie Session Tracking</h2>");
        out.println("<p>Welcome, <b>" + username + "</b></p>");

        out.println("<a href='cookieHistory'>View Transaction History</a>");

        out.println("</body>");
        out.println("</html>");
    }
}
