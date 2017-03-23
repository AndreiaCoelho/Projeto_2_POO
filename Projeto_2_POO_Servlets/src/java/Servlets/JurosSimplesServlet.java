/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andréia
 */
@WebServlet(name = "JurosSimplesServlet", urlPatterns = {"/jurossimples.html"})
public class JurosSimplesServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Projeto POO Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Projeto POO Servlet</h1>");
            out.println("<h2>Juros Simples</h2>");
            out.println("<form>");
            out.println("<table border='2' style='border-collapse: collapse;'>");
            out.println("<tr>");
            out.println("<th>");
            out.println("Capital Inicial:");
            out.println("</th>");
            out.println("<td>");
            out.println("<input type='number' name='capital'/>");
            out.println("</td>");
            out.println("<th>");
            out.println("Taxa de Juros");
            out.println("</th>");
            out.println("<td>");
            out.println("<input type='number' name='juros'/>");
            out.println("</td>");
            out.println("<th>");
            out.println("Tempo");
            out.println("</th>");
            out.println("<td>");
            out.println("<input type='number' name='tempo'/>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='submit' value='Calcular'/><br/>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<th>");
            out.println("Montante:");
            out.println("</th>");
            out.println("<td colspan='6'>");
            out.println("<input type='text' name='montante'/><br/>");
            out.println("</td>");
            out.println("</table>");
            out.println("</form>");
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
