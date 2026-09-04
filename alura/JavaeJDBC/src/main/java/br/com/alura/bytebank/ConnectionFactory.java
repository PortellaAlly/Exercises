package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static void main(String... x) {

        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=Allyson&password=VeryWeakPass1");

            System.out.println("Conexao estabelecida");
            connection.close();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
