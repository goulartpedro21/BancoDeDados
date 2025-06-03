/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodedados;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 1008009
 */
public class TesteBanco {
    public static void main(String[] args) {
        
        try{
            
        Connection con = BancoDeDados.conectar();
        
        if(con != null){
           
            con.close();
        }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
 }
    
}
