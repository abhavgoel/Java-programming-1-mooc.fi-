
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String filename = scanner.nextLine();

        try {
            Scanner fileRead = new Scanner(Paths.get(filename));
            
            while(fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                String []parts = line.split(",");
                System.out.println(parts[0] + ", " + "age: " + parts[1] + " years");
            }
        } catch(Exception e){
            System.out.println("Failed to open file");
        }
    }
}
