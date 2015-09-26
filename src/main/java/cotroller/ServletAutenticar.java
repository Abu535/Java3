/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotroller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-107
 */
public class ServletAutenticar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login= request.getParameter("login");
       String password=  request.getParameter("password");
       //creamos un atributo de mvc para ser compartido con la vista
       request.setAttribute("usuario", login);
       
        //response.setContentType("text/html;charset=UTF-8");//tipo mine
       //PrintWriter out = response.getWriter();
        //out.println("<h1>Este es mi primer servlet</h1>");
        RequestDispatcher despachador=request.getRequestDispatcher("/bienvenida.jsp");
        despachador.forward(request, response);
        
    }

  

}
