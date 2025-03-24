import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KvetinyTableModel extends AbstractTableModel {

    private List<Kvetina> data = new ArrayList<>();

    public KvetinyTableModel(List<Kvetina> coZobrazit) {
        this.data.addAll(coZobrazit);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kvetina kvetinaNaRadku = data.get(rowIndex);

        switch (columnIndex) {
            case 0: return rowIndex;
            case 1: return kvetinaNaRadku.getNazev();
            case 2: return kvetinaNaRadku.getPocet();
            case 3:
                Color barva = kvetinaNaRadku.getBarva();
                return barva.getRed() + "," + barva.getGreen() + "," + barva.getBlue();

            default: throw new RuntimeException("Špatné číslo sloupce:" + columnIndex);
        }
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "ID";
            case 1 -> "Název";
            case 2 -> "Pocet kusů";
            case 3 -> "Barva";
            default -> throw new RuntimeException("Špaté číslo sloupce:" + column);
        };
    }
// dve moznosti jak udelat ten switch
}
