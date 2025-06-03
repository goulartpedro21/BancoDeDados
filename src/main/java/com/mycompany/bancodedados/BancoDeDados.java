/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1008009
 */
public class BancoDeDados {
    public static Connection conectar() throws SQLException{
        
        Connection conexao = null;
        
        String url = "jdbc:mysql://localhost:3306/BancoCrud";
        String usuario = "root";
        String senha = "5555";
        
        try {
            
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro na conexão" + ex.getMessage());
        }
        return conexao;
        
     
}
}


