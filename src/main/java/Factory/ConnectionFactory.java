package Factory;
// importa as classes necessárias para o funcionamento da classe
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções
public class ConnectionFactory {
    public Connection conecta() {
        try {
        return 
        DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
