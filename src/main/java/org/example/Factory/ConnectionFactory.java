package org.example.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private static final String usuario = "RM558266";
    private static final String senha = "030604";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }
}
