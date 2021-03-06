package viewsmodel;

import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DANIEL LOZA
 */
public class AlumnoTableModel extends AbstractTableModel {

    private ImageIcon imgDelete = new ImageIcon(getClass().getResource("/images/delete.png"));
    private ImageIcon imgUpdate = new ImageIcon(getClass().getResource("/images/update.png"));
    private String[] header = {"Cve Alumno", "Nombre", "Edad", "Cve Grupo", "Eliminar", "Editar"};
    private Vector data = new Vector();

    //total de las columnas
    @Override
    public int getColumnCount() {
        //tamaño del arreglo
        return header.length;
    }

    //total de los datos a mostrar en en Jtable
    @Override
    public int getRowCount() {
        //datos de la colección
        return data.size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        return ((Vector) data.get(row)).get(column);
    }

    @Override
    public String getColumnName(int col) {
        return header[col];
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        ((Vector) data.get(row)).setElementAt(value, col);
        fireTableCellUpdated(row, col);
    }

    public void inserData(Object[] values) {
        data.add(new Vector());
        for (int i = 0; i < values.length; i++) {
            ((Vector) data.get(data.size() - 1)).add(values[i]);
        }
        ((Vector) data.get(data.size() - 1)).add(imgDelete);
        ((Vector) data.get(data.size() - 1)).add(imgUpdate);
        fireTableDataChanged();
    }

    public void removeRow(int row) {
        data.removeElementAt(row);
        fireTableDataChanged();
    }

}