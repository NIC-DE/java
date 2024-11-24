package boxesnboxes;

public class RectangleBox extends Box {

    private double m;
    private double p;

    public RectangleBox(double h, double m, double p) {
        super(h);
        this.m = m;
        this.p = p;
    }

    public double calcV() {
        return m*p*h;
    }

}
