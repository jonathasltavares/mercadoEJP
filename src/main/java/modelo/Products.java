package modelo;

public class Products {
    private int prodID;
    private String nome;
    private int quantid;
    private float preco;
    private String categoria;

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantid(int quantid) {
        this.quantid = quantid;
    }

    public int getQuantid() {
        return quantid;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

   
    
    
}
