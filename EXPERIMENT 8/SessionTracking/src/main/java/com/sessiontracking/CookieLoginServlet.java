package com.sessiontracking;
import java.io.*; import jakarta.servlet.*; import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*;
@WebServlet("/cookieLogin") public class CookieLoginServlet extends HttpServlet { protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
 String username=req.getParameter("username"); Cookie c=new Cookie("username",username); c.setMaxAge(3600); res.addCookie(c); res.setContentType("text/html"); PrintWriter out=res.getWriter();
 out.println("<html><body><h2>Cookie Session Tracking</h2><p>Welcome, <b>"+username+"</b></p><a href='cookieHistory'>View Transaction History</a></body></html>"); }}
