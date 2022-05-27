import java.util.ArrayList;

public class Hotel {
    private int number;
    private int floor;
    private int price;
    ArrayList<Hotel>list;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "number=" + number +
                ", floor=" + floor +
                ", price=" + price +
                '}';
    }
}
