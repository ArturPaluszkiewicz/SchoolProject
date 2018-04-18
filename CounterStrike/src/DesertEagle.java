public class DesertEagle implements Bron
{
    private String nazwa = "Desert Eagle";
    private int dmg = 60;

    @Override
    public String Atak()
    {
        return("Jebudu - Zadales "+dmg+" obrazen!" );
    }
    @Override
    public String PokazNazwe()
    {
        return(nazwa);
    }

}
