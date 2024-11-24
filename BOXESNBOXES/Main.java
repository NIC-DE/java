package boxesnboxes;

public class Main {

    public static void main(String[] args) {

        Warehouse w = new Warehouse("ΔΙΚΗΣ 25");

        for (int i = 0; i < 10; i++) {
            RoundBox rb = new RoundBox(2,2);
            w.addBox(rb);
        }

        for (int i = 0; i < 20; i++) {
            RectangleBox rb = new RectangleBox(1.5,3,2);
            w.addBox(rb);
        }

        System.out.println("Total volume: " + w.totalV());

    }

}
