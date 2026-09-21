package com.sessiontracking;
import java.io.*; import jakarta.servlet.*; import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*;
@WebServlet("/logout") public class LogoutServlet extends HttpServlet { protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
 HttpSession s=req.getSession(false); if(s!=null)s.invalidate(); res.setContentType("text/html"); PrintWriter o=res.getWriter(); o.println("<html><body><h2>You have been logged out successfully.</h2><a href='index.html'>Login Again</a></body></html>"); }}
