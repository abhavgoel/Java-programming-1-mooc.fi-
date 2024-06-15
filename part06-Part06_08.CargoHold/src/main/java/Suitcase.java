import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int weightSum;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.weightSum = 0;
    }   

    public void addItem(Item item) {
        
        if(weightSum + item.getWeight()<=maxWeight) {
            items.add(item);
            weightSum += item.getWeight();
        }
    }

    public String toString() {
        if(this.items.size()==0) {
            return "no items (0 kg)";
        }
        else if(this.items.size()==1) {
            return this.items.size() + " item " + "(" + this.weightSum + " kg)";
        }
        return this.items.size() + " items " + "(" + this.weightSum + " kg" + ")";
    }

    public void printItems() {
        for(Item item:items)
        {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        return this.weightSum;
    }

    public Item heaviestItem() {
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviest = this.items.get(0);
        for(Item item:items) {
            if(item.getWeight()>heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
