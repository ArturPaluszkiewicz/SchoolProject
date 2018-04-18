import javax.swing.*;

public class CsView extends JFrame
{
    private JButton Atak; //= new JButton("Atak");
    private JPanel panel1;
    private JButton ZmianaBroni;
    private JButton NazwaBroni;
    private JButton DodajDoEkwipunku;
    private JButton WyswietlEkwipunek;

    public CsView()
    {
        setSize(800,600);
        setContentPane(panel1);
        setLocationRelativeTo(null);
    }

    public JButton getAtak()
    {
        return Atak;
    }

    public JButton getZmianaBroni()
    {
        return ZmianaBroni;
    }

    public JButton getNazwaBroni()
    {
        return NazwaBroni;
    }

    public JButton getDodajDoEkwipunku()
    {
        return DodajDoEkwipunku;
    }

    public JButton getWyswietlEkwipunek()
    {
        return WyswietlEkwipunek;
    }
}
