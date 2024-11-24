package boxesnboxes;

public abstract class Box {

    protected double h;

    public Box(double h) {
        this.h = h;
    }

    public abstract double calcV();

}
