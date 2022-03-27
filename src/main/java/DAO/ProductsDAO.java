
package DAO;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Products;

public class ProductsDAO {
    private Connection connection;
    private int prodID;
    private String nome;
    private int quantid;
    private float preco;
    private String categoria;
    
    public ProductsDAO(){
        this.connection = new ConnectionFactory().conecta();
    }
    
    public void adiciona(Products products){
        String sql = "INSERT INTO products(prodID,nome,quantid,preco,categoria) VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, products.getProdID());
            stmt.setString(2, products.getNome());
            stmt.setInt(3, products.getQuantid());
            stmt.setFloat(4, products.getPreco());
            stmt.setString(5, products.getCategoria());
            stmt.executeUpdate(); 
            
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Products consulta(Products p) {
        String sql = "SELECT * FROM products WHERE prodID = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, p.getProdID());
            ResultSet rs = stmt.executeQuery(); 
            if (rs.next()) { 
            p.setNome(rs.getString("nome")); 
            p.setQuantid(rs.getInt("quantid"));
            p.setPreco(Float.valueOf(rs.getString("preco")));
            p.setCategoria(rs.getString("categoria"));
            
            }
            stmt.close();
            } 
        catch (SQLException e) {
        throw new RuntimeException(e);
        }
        return p;
}
    
   public void editar(Products products){
 
        String sql = "UPDATE products SET nome = ?, quantid = ?, preco =?, categoria =? WHERE prodID ='"+products.getProdID()+"';";
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, products.getNome());
            stmt.setInt(2, products.getQuantid());
            stmt.setFloat(3, products.getPreco());
            stmt.setString(4, products.getCategoria());
            
            stmt.executeUpdate(); 
            
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Products deleta(Products p) {
        PreparedStatement stmt;
        String sql = "delete from products where prodID = '"+p.getProdID()+"';";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.executeUpdate(); 
            stmt.close();
            } 
        catch (SQLException e) {
        throw new RuntimeException(e);
        }
        return p;
    
    }
        public List<Products> getLista(String sql) {
        try {
        List<Products> todosOsRegistros = new ArrayList<Products>();
        PreparedStatement cons = connection.prepareStatement(sql);
        ResultSet rs = cons.executeQuery(); 
        while (rs.next()) { 
        Products registro = new Products();
        registro.setProdID(rs.getInt("prodID")); 
        registro.setNome(rs.getString("nome"));
        registro.setQuantid(rs.getInt("quantid")); 
        registro.setPreco(rs.getFloat("preco"));
        registro.setCategoria(rs.getString("categoria"));
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
