

public class TworzenieTablicy {

    int ilElementowTablicy;
    int[] tab;

    public TworzenieTablicy(int a){
        ilElementowTablicy = a;
        tab = new int[ilElementowTablicy];
    }

    public void WypelnijTablice(){
        for(int i=0;i<ilElementowTablicy;i++){
            tab[i] = (int)(Math.random()*100);
        }
    }

    public void WypiszTablice(){
        for(int i=0;i<ilElementowTablicy;i++){
            System.out.print(tab[i]+" : ");
        }
    }
}
