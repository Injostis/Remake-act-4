/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author rod06
 */
@WebServlet(name = "AreaPerimeterSrvlt", urlPatterns = {"/AreaPerimeterSrvlt"})
public class AreaPerimeterSrvlt extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String base = request.getParameter("base");
            String height = request.getParameter("height");

            equations.Triangle myTriangle = new equations.Triangle(base, height);
            
            myTriangle.calculateArea();
            myTriangle.calculatePerimeter();
            
            HttpSession sesion = request.getSession(false);
            sesion.setAttribute("base", myTriangle.getBase());
            sesion.setAttribute("height", myTriangle.getHeight());
            sesion.setAttribute("area", myTriangle.getArea());
            sesion.setAttribute("perimeter", myTriangle.getPerimeter());

            request.setAttribute("equation", myTriangle);
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
