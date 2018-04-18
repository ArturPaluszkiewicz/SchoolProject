public class MaszynaSortujaca {

    Runnable[] runners;
    Thread[] threads;
    TworzenieTablicy tab;

    public MaszynaSortujaca(TworzenieTablicy tab){
        runners = new Runnable[4];
        threads = new Thread[4];
        this.tab = tab;
    }

    public void Sortuj(){

        int[] temp1 = new int[(tab.ilElementowTablicy/4)];
        int[] temp2 = new int[(tab.ilElementowTablicy/4)];
        int[] temp3 = new int[(tab.ilElementowTablicy/4)];
        int[] temp4 = new int[(tab.ilElementowTablicy-3*(tab.ilElementowTablicy/4))];

        for(int i=0;i<temp1.length;i++){
            temp1[i]=tab.tab[i];
        }

        for(int i=0;i<temp2.length;i++){
            temp2[i]=tab.tab[i+temp1.length];
        }

        for(int i=0;i<temp3.length;i++){
            temp3[i]=tab.tab[i+2*temp1.length];
        }

        for(int i=0;i<temp4.length;i++){
            temp4[i]=tab.tab[i+3*temp1.length];
        }

        runners[0]= new Sortowanie(temp1);
        runners[1]= new Sortowanie(temp2);
        runners[2]= new Sortowanie(temp3);
        runners[3]= new Sortowanie(temp4);


        for(int i=0;i<4;i++){
            threads[i]=new Thread(runners[i]);
        }

        for(int i=0; i<4; i++){
            threads[i].start();
        }

        try {
            threads[0].join();
            threads[1].join();
            threads[2].join();
            threads[3].join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        for(int i=0;i<temp1.length;i++){
            tab.tab[i]=temp1[i];
        }
        for(int i=0;i<temp2.length;i++){
            tab.tab[i+temp2.length]=temp2[i];
        }

        for(int i=0;i<temp3.length;i++){
            tab.tab[i+2*temp1.length]=temp3[i];
        }

        for(int i=0;i<temp4.length;i++){
            tab.tab[i+3*temp1.length]=temp4[i];
        }

        tab.WypiszTablice();
        System.out.println();
        sort();
        tab.WypiszTablice();

    }

    private void sort(){
        int tem;
        for(int i=0;i<tab.ilElementowTablicy-1;i++){
            for(int j=0;j<tab.ilElementowTablicy-1;j++){
                if(tab.tab[j] > tab.tab[j+1]){
                    tem = tab.tab[j];
                    tab.tab[j] = tab.tab[j+1];
                    tab.tab[j+1] = tem;
                }
            }
        }
    }
}
