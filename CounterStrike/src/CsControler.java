import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CsControler {

    private Bron bron;
    private Inventory inventory;
    private CsView theView;
    private JButton Atak;
    private JButton ZmianaBroni;
    private JButton NazwaBroni;
    private JButton DodajDoEkwipunku;
    private JButton WyswietlEkwipunek;

    public CsControler() {


        this.bron = new M4();
        this.inventory = new Inventory();
        initComponents();
        initListener();
    }
    public void showWindow()
    {
        theView.setVisible(true);
    }

    private void initComponents()
    {
        theView = new CsView();

        Atak = theView.getAtak();
        ZmianaBroni = theView.getZmianaBroni();
        NazwaBroni = theView.getNazwaBroni();
        DodajDoEkwipunku = theView.getDodajDoEkwipunku();
        WyswietlEkwipunek = theView.getWyswietlEkwipunek();
    }

    private void initListener()
    {
        Atak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,bron.Atak());
            }
        });

        ZmianaBroni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // menu[3].Menu1();
                if((bron.PokazNazwe())==("Desert Eagle")){
                    bron = new M4();
                }
                else{
                    bron = new DesertEagle();
                }
            }
        });

        NazwaBroni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,bron.PokazNazwe());
            }
        });

        DodajDoEkwipunku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,inventory.DodajDoEkwipunku(bron));
            }
        });

        WyswietlEkwipunek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,inventory.WyswietlZawartoscPlecaka());
            }
        });
    }
}
