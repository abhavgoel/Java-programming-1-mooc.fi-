
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String nameStr = "The collection " + this.name;
        if(this.elements.isEmpty()) {
            return nameStr + " is empty.";
        }

        String values = "";
        for(String element:elements) {
            if(elements.size()<=1){
                values = element;
            }
            else {
                values+=element+"\n";
            }
        }

        String numElements = "";
        if(elements.size()==1){
            numElements = " element:\n";
        }
        else if(elements.size()>1) {
            numElements = " elements:\n";
        }

        return nameStr + " has " + elements.size() + numElements + values;
    }
    
}
