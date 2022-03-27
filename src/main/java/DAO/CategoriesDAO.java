
package DAO;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categories;

public class CategoriesDAO {
    private Connection connection;
    private int catID;
    private String nome;
    private String descri;
    
    public CategoriesDAO(){
        this.connection = new ConnectionFactory().conecta();
    }
    
    public void adiciona(Categories categories){
        String sql = "INSERT INTO categories(catID,nome,descri) VALUES(?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, categories.getCatId());
            stmt.setString(2, categories.getNome());
            stmt.setString(3, categories.getDescri());
            stmt.executeUpdate(); 
            
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Categories consulta(Categories c) {
        String sql = "SELECT * FROM products WHERE prodID = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getCatId());
            ResultSet rs = stmt.executeQuery(); 
            if (rs.next()) { 
            c.setNome(rs.getString("nome")); 
            c.setDescri(rs.getString("descri"));
            
            }
            stmt.close();
            } 
        catch (SQLException e) {
        throw new RuntimeException(e);
        }
        return c;
}
    
   public void editar(Categories categories){
 
        String sql = "UPDATE categories SET nome = ?,descri =? WHERE catId ='"+categories.getCatId()+"';";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, categories.getNome());
            stmt.setString(2, categories.getDescri());
            
            
            stmt.executeUpdate(); 
            
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Categories deleta(Categories c) {
        PreparedStatement stmt;
        String sql = "delete from categories where catId = '"+c.getCatId()+"';";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.executeUpdate(); 
            stmt.close();
            } 
        catch (SQLException e) {
        throw new RuntimeException(e);
        }
        return c;
    
    }
        public List<Categories> getLista(String sql) {
        try {
        List<Categories> todosOsRegistros = new ArrayList<Categories>();
        PreparedStatement cons = connection.prepareStatement(sql);
        ResultSet rs = cons.executeQuery(); 
        while (rs.next()) { 
        Categories registro = new Categories();
        registro.setCatId(rs.getInt("catId")); 
        registro.setNome(rs.getString("nome"));
        registro.setDescri(rs.getString("descri"));
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
