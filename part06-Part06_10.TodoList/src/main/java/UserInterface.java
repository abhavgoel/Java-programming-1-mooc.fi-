import java.util.Scanner;
import java.util.TooManyListenersException;

public class UserInterface{
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
         while(true) {
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            if(input.equals("stop")) {
                break;
            } else if(input.equals("add")) {
                System.out.println("To add:");
                String toAdd = this.scanner.nextLine();
                this.list.add(toAdd);
            } else if(input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int num = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(num);
            }
         }
    }
}