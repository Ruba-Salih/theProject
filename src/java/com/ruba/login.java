/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruba;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RUBA
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    String username;
    String userName;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String userName=request.getParameter("username");
        String password=request.getParameter("password");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(" <title>Login Form</title>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <link href='//fonts.googleapis.com/css?family=Open+Sans:700,600' rel='stylesheet' type='text/css'>\n" +
"    <style>\n" +
"        body{\n" +
"          font-family: 'Open Sans', sans-serif;\n" +
"          background:white;\n" +
"          margin: 0 auto 0 auto;  \n" +
"          width:100%; \n" +
"          text-align:center;\n" +
"          margin: 20px 0px 20px 0px;   \n" +
"        }\n" +
"        p{\n" +
"          font-size:12px;\n" +
"          text-decoration: none;\n" +
"          color:#ffffff;\n" +
"        }\n" +
"        h1{\n" +
"          font-size:1.5em;\n" +
"          color:#525252;\n" +
"        }\n" +
"        .box{\n" +
"          background:white;\n" +
"          width:300px;\n" +
"          border-radius:6px;\n" +
"          margin: 0 auto 0 auto;\n" +
"          padding:0px 0px 70px 0px;\n" +
"          border: #787878 4px solid; \n" +
"        }\n" +
"        .username{\n" +
"          background:#ecf0f1;\n" +
"          border: #ccc 1px solid;\n" +
"          border-bottom: #ccc 2px solid;\n" +
"          padding: 8px;\n" +
"          width:250px;\n" +
"          color:#AAAAAA;\n" +
"          margin-top:10px;\n" +
"          font-size:1em;\n" +
"          border-radius:4px;\n" +
"        }\n" +
"        .button{\n" +
"          background:#4890ED;\n" +
"          width:125px;\n" +
"          padding-top:5px;\n" +
"          padding-bottom:5px;\n" +
"          color:white;\n" +
"          border-radius:4px;\n" +
"          border: #27ae60 1px solid;\n" +
"          margin-top:20px;\n" +
"          margin-bottom:20px;\n" +
"          float:left;\n" +
"          margin-left:88px;\n" +
"          font-weight:800;\n" +
"          font-size:0.8em;\n" +
"        }\n" +
"        .button:hover{\n" +
"          background:#2CC06B; \n" +
"        }\n" +
"        .fpwd{\n" +
"            color:#f1c40f;\n" +
"            text-decoration: underline;\n" +
"        }\n" +
"       #absoluteCenteredDiv{\n" +
"            position: absolute;\n" +
"            top:0;\n" +
"            bottom: 0;\n" +
"            left: 0;\n" +
"            right: 0;\n" +
"            margin: auto;\n" +
"            width:400px;\n" +
"            height: 300px;\n" +
"            text-align: center;\n" +
"       }\n" +
"    </style>");            
            out.println("</head>");
            out.println("<body>");
            out.println("    <div id=\"absoluteCenteredDiv\">\n" +
"        <form action=\"home.html\" method=\"post\">\n" +
"            <div class=\"box\">\n" +
"                <h1>Login Form</h1>\n" +
"                <input class=\"username\" name=\"username\" type=\"text\" placeholder=\"User Name\">\n" +
"                <input class=\"username\" name=\"password\" type=\"password\" placeholder=\"Password\">\n" +
"                <a href=\"#\"><div class=\"button\">Sign In</div></a>\n" +
"            </div>\n" +
"        </form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
