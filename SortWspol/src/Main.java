public class Main {
    public static void main(String[] args) {
        TworzenieTablicy tablica = new TworzenieTablicy(20);

        tablica.WypelnijTablice();
        tablica.WypiszTablice();
        System.out.println();
        MaszynaSortujaca maszine = new MaszynaSortujaca(tablica);
        maszine.Sortuj();
    }
}
