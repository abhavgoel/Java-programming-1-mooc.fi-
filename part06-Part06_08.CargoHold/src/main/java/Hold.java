import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight = 0;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
        this.totalWeight = 0;

    }
    public void addSuitcase(Suitcase suitcase) {
        if(totalWeight + suitcase.totalWeight()<=maxWeight)
        {
        suitcases.add(suitcase);
        totalWeight += suitcase.totalWeight();
        }
    }

    public String toString(){
        String str = String.valueOf(this.suitcases.size()) + " suitcases " + "(" + this.totalWeight + " kg)"  ;
        return str;
    }
    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
}
