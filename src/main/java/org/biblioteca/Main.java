package org.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String url = "jdbc:postgresql://localhost:5432/biblioteca";
    static String user = "";
    static String password = "";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexão estabelecida com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao estabelecer conexão com o banco de dados: " + e.getMessage());
        }
    }
}