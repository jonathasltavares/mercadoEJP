package modelo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class categoriesTableModel extends AbstractTableModel {
    private static final long serialVersionUID = 1L; 
    private String r;
    private List<Categories> categories; 
    public categoriesTableModel(final List<Categories> categories) {
        this.categories = categories;
    }
    @Override
    public int getColumnCount() {
        return 3; 
    }

    
    @Override
    public String getColumnName(final int col) {
        switch (col) { 
            case 0: r = "catId"; break;
            case 1: r = "Nome"; break;
            case 2: r = "descri"; break;
        }
        
    return r;
    }
    @Override
    public int getRowCount() {
        return categories.size(); 
    }
  
    @Override
    public Object getValueAt(final int rowIndex, final int columnIndex) {
        Categories obj = categories.get(rowIndex); 
        switch (columnIndex) { 
            case 0: return obj.getCatId();
            case 1: return obj.getNome();
            case 2: return obj.getDescri();
            default: return null; 
        }
    }
}