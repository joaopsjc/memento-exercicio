/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelos.Aluno;

/**
 *
 * @author ice
 */
public class AlunoDAO {
    /**
 * DAO = data access object
 */
    private static AlunoDAO instance = new AlunoDAO();
    public static AlunoDAO getInstance()
    {
        return instance;
    }
    
    public void saveEstado(Aluno aluno) throws SQLException,ClassNotFoundException
    {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("UPDATE aluno SET aluno.estado = '"
                    + aluno.getNomeEstado()+  "' where aluno.nome = '"
                    + aluno.getNome() + "';");
        } catch (SQLException e) {
            throw e;
        } 
        finally
        {
            closeResources(conn,st);
        }
    }
    private void closeResources(Connection conn, Statement st) {
        try {
                    if(st!=null) st.close();
                    if(conn!=null) conn.close();
                    
                } catch(SQLException e) {
                    
                }
    }
}