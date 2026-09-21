package com.sessiontracking;
import java.io.*; import jakarta.servlet.*; import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*;
@WebServlet("/sessionLogin") public class SessionLoginServlet extends HttpServlet { protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
 String username=req.getParameter("username"); HttpSession s=req.getSession(); s.setAttribute("username",username); res.setContentType("text/html"); PrintWriter o=res.getWriter();
 o.println("<html><body><h2>HTTP Session Tracking</h2><p>Welcome, <b>"+username+"</b></p><a href='sessionHistory'>View Transaction History</a></body></html>"); }}
