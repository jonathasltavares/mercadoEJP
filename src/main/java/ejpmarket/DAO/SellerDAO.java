package DAO;

import Factory.ConnectionFactory;
import modelo.Seller;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class SellerDAO {
    private Connection connection;
    private String userID;
    private String nome;
    private int password;

    public SellerDAO(){
        this.connection = new ConnectionFactory().conecta();
    }
    
    public void adiciona(Seller seller){
        String sql = "INSERT INTO sellers(userID,nome,password) VALUES(?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, seller.getUserID());
            stmt.setString(2, seller.getNome());
            stmt.setInt(3, seller.getPassword());
            stmt.executeUpdate(); 
            
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Seller consulta(Seller s) {
        String sql = "SELECT * FROM sellers WHERE userID = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, s.getUserID());
            ResultSet rs = stmt.executeQuery(); 
            if (rs.next()) { 
            s.setNome(rs.getString("nome")); 
            s.setPassword(Integer.valueOf(rs.getString("Password")));
            
            }
            stmt.close();
            } 
        catch (SQLException e) {
        throw new RuntimeException(e);
        }
        return s;
}
    
   public void editar(Seller seller){
 
        String sql = "UPDATE sellers SET nome = ?, password =? WHERE userID ='"+seller.getUserID()+"';";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, seller.getNome());
            stmt.setInt(2, seller.getPassword());
            
            stmt.executeUpdate(); 
            
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Seller deleta(Seller s) {
        PreparedStatement stmt;
        String sql = "delete from sellers where userID = '"+s.getUserID()+"';";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.executeUpdate(); 
            stmt.close();
            } 
        catch (SQLException e) {
        throw new RuntimeException(e);
        }
        return s;
    
    }
        public List<Seller> getLista(String sql) {
        try {
        List<Seller> todosOsRegistros = new ArrayList<Seller>();
        PreparedStatement cons = connection.prepareStatement(sql);
        ResultSet rs = cons.executeQuery(); 
        while (rs.next()) { 
        Seller registro = new Seller();
        registro.setUserID(rs.getString("userID")); 
        registro.setNome(rs.getString("nome"));
        registro.setPassword(rs.getInt("password"));
        todosOsRegistros.add(registro); 
        }
        rs.close();
        cons.close();
        return todosOsRegistros; 
        } catch (SQLException e) {
        throw new RuntimeException(e);
        }
       }

    }

    
   




