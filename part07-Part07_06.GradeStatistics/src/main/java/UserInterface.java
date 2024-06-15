import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
    public void start() {
        readPoints();
        printAverageAll();
        printAveragePassing();
        printPassPercentage();
        printGradeDistribution();
    }
    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int point = Integer.valueOf(this.scanner.nextLine());
            if(point==-1) {
                break;
            }
            this.register.addPoint(point);
        }
    }

    public void printAverageAll() {
        System.out.println("Point average (all): " + this.register.getAverageAll());
    }

    public void printAveragePassing() {
        double avgPassing = this.register.getAveragePassing();
        if(avgPassing==-1) {
        System.out.println("Point average (passing): " + "-");
        }
        else {
            System.out.println("Point average (passing): " + avgPassing);
        }
    }
    public void printPassPercentage() {
        if(this.register.getAveragePassing()==-1) {
            System.out.println("Pass percentage: " + "0.0");
        }
        else {
            System.out.println("Pass percentage: " + this.register.getPassPercentage());
        }
        
    }

    public void printGradeDistribution() {

        System.out.println("Grade distribution:");

        int grade = 5;

        while (grade >= 0) {
            int stars = register.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade--;
        }

    }

    // Print the number of stars for total number of grades horizontally
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
