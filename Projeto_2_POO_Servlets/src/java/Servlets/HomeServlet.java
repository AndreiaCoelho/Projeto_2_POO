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
@WebServlet(name = "HomeServlet", urlPatterns = {"/home.html"})
public class HomeServlet extends HttpServlet {

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
            out.println("<title>Projeto POO 2</title>");    
            out.println("<link href='bootstrap/css/bootstrap.min.css' rel='stylesheet'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Projeto POO Servlet</h1>");
            out.println("<h2>Calculando Juros Simples e Juros Compostos</h2>");
            out.println("<h3>Juros Simples</h3>");
            out.println("<p>Juros Simples\n" +
            "No sistema de juros simples, o percentual é aplicado apenas sobre o valor inicial." + 
                    "Geralmente, o juro simples é usado em situações de curto prazo. "+
                    "Podemos definir juros como o rendimento de uma aplicação financeira, "+
                    "valor referente ao atraso no pagamento de uma prestação ou a quantia paga pelo empréstimo de um capital.</p>");
            out.println("<h3>Juros Compostos</h3>");
            out.println("<p>Juros Compostos\n" + "Juros compostos são os juros de um determinado período" + 
            "somados ao capital para o cálculo de novos juros nos períodos seguintes. Juros compostos fazem" +
            "parte de disciplinas e conceitos de matemática financeira, e esses juros são representados" +
                    "através de um percentual.</p>");
            out.println("<div>");
            out.println("Calcular:<br/>");
            out.println("<a href='jurossimples.html'>Juros Simples</a><br/>");
            out.println("<a href='juroscompostos.html'>Juros Compostos</a><br/>");
            out.println("</div>");
            out.println("<div>");
            out.println("Equipe<br/>");
            out.println("<img src='imagens/andreia.jpg' class='img-circle' width='140' height='140'/>");
            out.println("<p>Andreia</p>");
            out.println("<img src='imagens/jeferson.jpg' class='img-circle' width='140' height='140'/>");
            out.println("<p>Jeferson</p>");
            out.println("</div>");
            out.println("<footer>");
            out.println("<p>© Fatec-PG - POO</p>");
            out.println("</footer>");
                        
            
            
            
            
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
