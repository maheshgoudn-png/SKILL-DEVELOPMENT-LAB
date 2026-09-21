package com.sessiontracking;
import java.io.*; import jakarta.servlet.*; import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*;
@WebServlet("/cookieHistory") public class CookieHistoryServlet extends HttpServlet { protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
 String username="Guest"; Cookie[] cs=req.getCookies(); if(cs!=null)for(Cookie c:cs)if("username".equals(c.getName())){username=c.getValue();break;}
 res.setContentType("text/html"); PrintWriter o=res.getWriter(); o.println("<html><body><h2>Cookie - Transaction History</h2><p>User: <b>"+username+"</b></p>"); table(o); o.println("</body></html>"); }
 private void table(PrintWriter o){o.println("<table border='1' cellpadding='10'><tr><th>Transaction ID</th><th>Product</th><th>Amount</th></tr><tr><td>TXN001</td><td>Laptop</td><td>₹55,000</td></tr><tr><td>TXN002</td><td>Keyboard</td><td>₹1,500</td></tr></table>");}}
