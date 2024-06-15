import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoint(int point) {
        if(point>=0 && point<=100) {
            this.points.add(point);
            if(point>=50) {
                this.passingPoints.add(point);
            }
    
            this.grades.add(pointsToGrade(point));
        }
        
        
    }
    public double getAverageAll() {
        double avg = 0.0;
        int size = this.points.size();

        for(int i : this.points) {
            avg+=i;
        }
        return 1.0*avg / size;
    }

    public double getAveragePassing() {
        if(this.passingPoints.isEmpty()) {
            return -1;
        }
        double avg = 0.0;
        int size = this.passingPoints.size();

        for(int i: this.passingPoints) {
            avg+=i;
        }
        return 1.0*avg/size;
    }

    public double getPassPercentage() {
        int pass = this.passingPoints.size();
        if(pass==0){
            return -1;
        }
        int all = this.points.size();
        double percent = (double)pass/all;
        return percent*100.0;
    }

    public int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int totalGradesFromPoints(int grade) {

        int total = 0;
        for (int received : this.grades) {
            if (received == grade) {
                total++;
            }
        }

        return total;

    }

}
