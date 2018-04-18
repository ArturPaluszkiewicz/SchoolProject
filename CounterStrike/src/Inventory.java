

public class Inventory {

    private Bron[] TabBron = new Bron[3];

    public String DodajDoEkwipunku(Bron bron){
        //if (slot <0 || slot >2){
          //  throw new IllegalArgumentException("Nie ma takiego miejsca w ekwipunku");
        //}
        String str = "Blad";
        for(int i=0;i<3;i++) {
            if (TabBron[i] == null) {
                TabBron[i] = bron;
                str = "Bron dodana pomyślnie";
                break;
            }
            else if(i==2){
                str = "Ekwipunek jest pełny";
            }
        } return str;
    }
    public String WyswietlZawartoscPlecaka(){
        String str = "";
        for(int x=0;x<3;x++){
            if(TabBron[x]!=null) {
                str =(str+" "+TabBron[x].PokazNazwe());
            }
        }
        if (str == "") {
            str = "Ekwipunek jest pusty";
        }
        return str;
    }
}
