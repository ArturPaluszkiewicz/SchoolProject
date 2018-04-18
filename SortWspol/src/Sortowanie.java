public class Sortowanie implements Runnable{

    int[] tab;


    public Sortowanie(int[] tab){
        this.tab = tab;
    }


    @Override
    public void run() {
        System.out.println("Dzialajacy watek");
        int temp;
        for(int i=0;i<tab.length-1;i++){
            for(int j=0;j<tab.length-1;j++){
                if(tab[j] > tab[j+1]){
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
    }
}
