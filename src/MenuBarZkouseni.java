import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MenuBarZkouseni extends JFrame {
    private JPanel panMain;
    private JCheckBox cbZatrzeno;
    private JTextField tfText;
    private JTable table1;

    KvetinyTableModel model = new KvetinyTableModel(
            List.of(
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW),
                    new Kvetina("Tulipán", 10, Color.RED),
                    new Kvetina("Růže", 20, Color.RED),
                    new Kvetina("Narcis", 30, Color.YELLOW))

    );

    private Random generator = new Random();

    public MenuBarZkouseni() {
        initComponents();
    }

    private void initComponents() {
        setContentPane(panMain);
        setTitle("MenuBar zkouska");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        table1.setModel(model);
        initMenu();
    }

    private void initMenu() {
        JMenuBar menu = new JMenuBar();
        setJMenuBar(menu);

        JMenu menuAkce = new JMenu("Akce");
        menu.add(menuAkce);

        JMenuItem pozdravItem = new JMenuItem("Pozdrav");
        pozdravItem.addActionListener(e -> pozdrav());
        menuAkce.add(pozdravItem);
        menuAkce.addSeparator();

        JMenuItem provedZmenyItem = new JMenuItem("Proveď změny!");
        provedZmenyItem.addActionListener(e -> provedZmeny());
        menuAkce.add(provedZmenyItem);

    }

    private void provedZmeny() {
        cbZatrzeno.setSelected(! cbZatrzeno.isSelected());
        tfText.setText(""+(generator.nextInt()*100));
    }

    private void pozdrav() {
        JOptionPane.showMessageDialog(this, "Ahoj z menu! \nV textovém poli je napsáno: " + tfText.getText());
    }

    public static void main(String[] args) {
        MenuBarZkouseni frame = new MenuBarZkouseni();
        frame.setVisible(true);
    }
}
