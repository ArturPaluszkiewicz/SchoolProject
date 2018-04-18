public class M4 implements Bron
{
    private String nazwa = "M4";
    private int dmg = 40;

    @Override
    public String Atak()
    {
        return("Trutututu - Zadales "+dmg+" obrazen!" );
    }
    @Override
    public String PokazNazwe()
    {
        return(nazwa);
    }
}
