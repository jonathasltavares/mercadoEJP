package modelo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class sellerTableModel extends AbstractTableModel {
    private static final long serialVersionUID = 1L; 
    private List<Seller> sellers; 
    private String r;
    
    public sellerTableModel(final List<Seller> seller) {
        this.sellers = seller;
    }
    
    @Override
    public int getColumnCount() {
        return 3;
    }

    
    @Override
    public String getColumnName(final int col) {       
        switch (col) { 
            case 0: r = "userID"; break;
            case 1: r = "Nome";break;
            case 2: r = "Password";break;
    }
        
    return r;
    }
    @Override
    public int getRowCount() {
        return sellers.size(); 
    }
  
    @Override
    public Object getValueAt(final int rowIndex, final int columnIndex) {
        Seller obj = sellers.get(rowIndex); 
        return switch (columnIndex) {
            case 0 -> obj.getUserID();
            case 1 -> obj.getNome();
            case 2 -> obj.getPassword();
            default -> null;
        };
    }
}