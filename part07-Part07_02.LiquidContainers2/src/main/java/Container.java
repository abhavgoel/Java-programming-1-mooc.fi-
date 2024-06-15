public class Container {
    private int liquid;
    public Container() {
        this.liquid = 0;
    }

    public int contains() {
        return this.liquid;
    }
    public void add(int amount){
        if(amount>=0 && (amount + this.liquid) <=100) {
            this.liquid += amount;
        } else {
            this.liquid = 100;
        }
    }
    public void remove(int amount){
        if(amount>=0 && (this.liquid - amount)>=0){
            this.liquid-=amount;
        }
        else {
            this.liquid = 0;
        }
    }
    public String toString(){
        return this.liquid + "/100";
    }
}
