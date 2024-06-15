
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean flag = false;
        try {
            Scanner fileRead = new Scanner(Paths.get(file));

        while(fileRead.hasNextLine()) {
            String line = fileRead.nextLine();
            
            if(line.contains(searchedFor)) {
                flag = true;
                break;
            }
            
        }
    }
    catch(Exception e) {
        System.out.println("Reading the file " + file + " failed.");
    }
    if(flag==true) {
        System.out.println("Found!");
    }
    else {
        System.out.println("Not found.");
    }
    }
}
