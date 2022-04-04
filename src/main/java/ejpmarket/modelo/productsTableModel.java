package modelo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class productsTableModel extends AbstractTableModel {
    private static final long serialVersionUID = 1L; 
    private String r;
    private List<Products> products; 
    public productsTableModel(final List<Products> products) {
        this.products = products;
    }
    @Override
    public int getColumnCount() {
        return 5; 
    }

    //@Override
    @Override
    public String getColumnName(final int col) {
        switch (col) { 
            case 0: r = "prodID"; break;
            case 1: r = "Nome"; break;
            case 2: r = "Quantidade"; break;
            case 3: r = "Preço"; break;
            case 4: r = "Categoria"; break;
    }
        
    return r;
    }
    @Override
    public int getRowCount() {
        return products.size(); 
    }
  
    @Override
    public Object getValueAt(final int rowIndex, final int columnIndex) {
        Products obj = products.get(rowIndex); 
        switch (columnIndex) { 
            case 0: return obj.getProdID();
            case 1: return obj.getNome();
            case 2: return obj.getQuantid();
            case 3: return obj.getPreco();
            case 4: return obj.getCategoria();
            default: return null; 
        }
    }
}