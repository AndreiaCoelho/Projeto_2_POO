/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andreia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet: Juros Simples</title>");            
            out.println("</head>");
            out.println("<body>");
            double capitalInicial = 0;
            double juros = 0;
            int meses = 0;
            try{
              capitalInicial = Double.parseDouble(request.getParameter("capitalInicial"));
              juros = Double.parseDouble(request.getParameter("taxaJuros"));
              meses = Integer.parseInt(request.getParameter("tempo"));
            } catch(Exception ex){ }
            out.println("<form>");
            out.println("<table border='5'>");
            out.println("<tr>");
            out.println("<th colspan='3'>");
            out.println("Entrada de Dados");
            out.println("</th>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<th>");
            out.println("Valor inicial");
            out.println("</th>");
            out.println("<th>");
            out.println("Taxa de juros");
            out.println("</th>");
            out.println("<th>");
            out.println("Tempo(Meses)");
            out.println("</th>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<input type='text' name='capitalInicial' value='" + capitalInicial + "'/>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' name='taxaJuros' value='" + juros + "'/>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' name='tempo' value='" + meses + "'/>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<input type='submit' value='Calcular'/>");
            out.println("</td>");
            out.println("<td colspan='2'>");
            DecimalFormat df = new DecimalFormat("#.##");
            out.println("<p>" + df.format((capitalInicial)+(capitalInicial * juros * meses)) + "</p");
            out.println("</td>");
            out.println("</table");
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
