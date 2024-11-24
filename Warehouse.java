package boxesnboxes;

public class Warehouse {

    private String address;
    private int countRoundB;
    private int countRectB;
    private Box[] boxes;

    public Warehouse(String address) {
        this.address = address;
        boxes = new Box[50];
        countRoundB = 0;
        countRectB = 0;
    }

    public String getAddress() { return address; }

    public void addBox(Box b) {

        if (b instanceof RoundBox) {
            if (countRoundB == 20)
                return;
            else
                countRoundB++;
        } else {
            if (countRectB == 30)
                return;
            else
                countRectB++;
        }

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == null) {
                boxes[i] = b;
                break;
            }
        }

    }

    public double totalV() {

        double sum = 0;

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] != null)
                sum += boxes[i].calcV();
            else
                break;
        }
        return sum;

    }

}
