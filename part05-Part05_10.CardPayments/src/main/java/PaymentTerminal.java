
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;

    }

    public double eatAffordably(double payment) {
       if(payment>=2.5) {
        payment-=2.5;
        this.money+=2.5;
        this.affordableMeals++;
        return payment;
       }
       else{
        return payment;
       }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            this.heartyMeals += 1;
            this.money += 4.30;
            payment -= 4.30;
            return payment;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if(card.balance()>=2.5) {
            card.takeMoney(2.5);
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance()>=4.3) {
            card.takeMoney(4.30);
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum>=0) {
            this.money+=sum;
            card.addMoney(sum);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
