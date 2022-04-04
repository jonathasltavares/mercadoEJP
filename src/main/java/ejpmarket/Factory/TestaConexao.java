package Factory;

import java.sql.Connection;
import java.sql.SQLException;
public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        try (Connection c = new ConnectionFactory().conecta()){
            System.out.println("Conexão bem sucedida!");
            c.close();
        } 
    }
}
