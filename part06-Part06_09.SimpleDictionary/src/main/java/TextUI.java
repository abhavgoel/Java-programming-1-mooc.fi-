import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while(true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;

            }
            else if(input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();

                System.out.println("Translation:");
                String translation = scanner.nextLine();

                this.dict.add(word,translation);
            }
            else if(input.equals("search")) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                
                String translated = this.dict.translate(word);
                if(translated==null){
                    System.out.println("Word " + word + " was not found");
                }
                else{
                    System.out.println("Translation:");
                    System.out.println(translated);
                }
            }
            else{
                System.out.println("Unknown command");
            }
        }
    }
}
