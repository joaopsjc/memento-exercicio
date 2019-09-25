/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
public class SalvarEstadoTrancadoAction implements Action{
    public void execute (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ClassNotFoundException
    {
        String nome = request.getParameter("textNome");
        
        if(nome.equals("")) {
        
           response.sendRedirect("OperacaoErro.jsp");
        
        } else {
            try{

                response.sendRedirect("OperacaoSucesso.jsp");
            }
            catch(SQLException ex)
            {
                response.sendRedirect("OperacaoErro.jsp");
                ex.printStackTrace();
            }
        
        }
    }
}
