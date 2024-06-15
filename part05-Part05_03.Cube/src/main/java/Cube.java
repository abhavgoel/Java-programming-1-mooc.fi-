public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return edgeLength*edgeLength*edgeLength;
    }

    public String toString() {
        String str = "The length of the edge is " + this.edgeLength + " and the volume is " + this.volume();
        return str; 
    }
}
