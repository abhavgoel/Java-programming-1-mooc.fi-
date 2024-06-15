
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.rooms*this.squares > compared.rooms*compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int price1 = this.squares * this.princePerSquare;
        int price2 = compared.squares * compared.princePerSquare;
        return Math.abs(price1-price2);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price1 = this.squares*this.princePerSquare;
        int price2 = compared.squares*compared.princePerSquare;
        return price1>price2;   
    }
}
