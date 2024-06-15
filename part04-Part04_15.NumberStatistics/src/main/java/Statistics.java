
public class Statistics {
    private int count;
    private int sum;
   
    public Statistics() {
        count = 0;
        sum=0;
        
    }
    public void addNumber(int number) {
        this.count++;
        sum+=number;
    }

    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }

    public double average() { 
        if(this.getCount()==0){
            return 0.0;
        }
        double avg = (double)sum / this.getCount();
        return avg;
    }
}
