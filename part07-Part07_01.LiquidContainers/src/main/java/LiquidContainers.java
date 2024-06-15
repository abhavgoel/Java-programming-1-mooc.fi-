
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int MAX = 100;

        while (true) {
            System.out.println("First: " + firstVolume + "/100");
            System.out.println("Second: " + secondVolume + "/100");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            } 
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

           

            if(command.equals("add") && amount >= 0) {
                if (firstVolume + amount >= MAX) {
                    firstVolume = MAX;
                } else{
                    firstVolume+=amount;
                }
            }
            else if(command.equals("move") && amount >= 0) {
                if((firstVolume - amount) >= 0) {
                    firstVolume-=amount;
                    secondVolume+=amount;

                    if(secondVolume>MAX) {
                        secondVolume = MAX;
                    }
                } else if((firstVolume - amount) < 0) {
                    secondVolume+=firstVolume;
                    firstVolume = 0;
                   
                    if(secondVolume>MAX) {
                        secondVolume=MAX;
                    }
                } 
                

            }
            else if(command.equals("remove") && amount >=0 ) {
                if ((secondVolume - amount) >= 0) {
                    secondVolume -= amount;
                } else if ((secondVolume - amount) < 0){
                    secondVolume = 0;
                }
            }

        }
        // System.out.println("First: " + firstVolume + "/100");
        // System.out.println("Second: " + secondVolume + "/100");
    }

}
