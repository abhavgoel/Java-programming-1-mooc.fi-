
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        BirdDatabase bird_db = new BirdDatabase();
        while(true) {
            System.out.print("? ");
            String command = scanner.nextLine() ;
            
            if(command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String nameInLatin = scanner.nextLine();
                bird_db.add(name, nameInLatin);

            } else if(command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                if(bird_db.observe(name)==false) {
                    System.out.println("Not a bird!");
                }

            } else if(command.equals("All")) {
                bird_db.getAll();

            } else if(command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                bird_db.getOne(name);

            } else if(command.equals("Quit")) {
                break;
            }


        }

    }

}
