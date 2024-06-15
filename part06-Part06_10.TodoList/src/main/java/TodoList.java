import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }
    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        int counter = 1;
        for(String task: this.tasks){
            System.out.print(counter + ": ");
            System.out.println(task);
            counter++;
        }
    }

    public void remove(int number) {
        this.tasks.remove(number-1);
    }
}
