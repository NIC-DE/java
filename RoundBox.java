package boxesnboxes;

public class RoundBox extends Box {

    private double r;

    public RoundBox(double h, double r) {
        super(h);
        this.r = r;
    }

    public double calcV() { 
        return 3.14*r*r*h;
    }

}
