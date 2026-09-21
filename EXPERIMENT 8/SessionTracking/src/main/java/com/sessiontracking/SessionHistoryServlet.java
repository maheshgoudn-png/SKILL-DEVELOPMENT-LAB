package com.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sessionHistory")
public class SessionHistoryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        if (session == null) {

            out.println("<h3>Session expired. Please login again.</h3>");

        } else {

            String username =
                    (String) session.getAttribute("username");

            out.println("<h2>Transaction History</h2>");

            out.println("<p>User: <b>" + username + "</b></p>");

            out.println("<table border='1' cellpadding='10'>");

            out.println("<tr>");
            out.println("<th>Transaction ID</th>");
            out.println("<th>Product</th>");
            out.println("<th>Amount</th>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>TXN001</td>");
            out.println("<td>Laptop</td>");
            out.println("<td>₹55,000</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>TXN002</td>");
            out.println("<td>Keyboard</td>");
            out.println("<td>₹1,500</td>");
            out.println("</tr>");

            out.println("</table>");

            out.println("<br>");

            out.println("<a href='logout'>Logout</a>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
