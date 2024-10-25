package org.example;

import org.example.Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        try{
            Connection conexao = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucessoo!");
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
