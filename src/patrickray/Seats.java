package patrickray;

public class Seats {

    boolean occupied = false;
    int price = 0;


    public boolean isOccupied() {
        return occupied;
    }
    public String OccupiedOrEmpty() {
        if (occupied == true)
            return "Occupied";
        else
            return "Empty";

    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Seats occupied=" + occupied +
                " price=" + price;
    }
}
