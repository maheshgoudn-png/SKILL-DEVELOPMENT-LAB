package com.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookieHistory")
public class CookieHistoryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = "Guest";

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {

            for (Cookie cookie : cookies) {

                if (cookie.getName().equals("username")) {
                    username = cookie.getValue();
                }
            }
        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Transaction History</title></head>");
        out.println("<body>");

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

        out.println("</body>");
        out.println("</html>");
    }
}
