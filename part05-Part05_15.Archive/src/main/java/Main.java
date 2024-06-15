
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.equals("")){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            Archive newArchive = new Archive(identifier, name);

            if(!archives.contains(newArchive)){
                archives.add(newArchive);
            }
        }

        System.out.println("==Items==");
        for(Archive archive : archives){
            System.out.println(archive);
        }
        
    }
}
