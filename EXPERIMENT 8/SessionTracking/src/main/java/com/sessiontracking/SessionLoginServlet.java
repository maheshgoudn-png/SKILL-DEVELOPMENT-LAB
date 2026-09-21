package com.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sessionLogin")
public class SessionLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");

        // Create session
        HttpSession session = request.getSession();

        // Store username in session
        session.setAttribute("username", username);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<h2>HTTP Session Tracking</h2>");

        out.println("<p>Welcome <b>" + username + "</b></p>");

        out.println("<a href='sessionHistory'>View Transaction History</a>");

        out.println("</body>");
        out.println("</html>");
    }
}
