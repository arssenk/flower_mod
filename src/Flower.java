
/**
 * Created by matt on 10/3/16.
 */
public class Flower {

    protected boolean fresh;
    protected double price;
    protected FlowerSpec spec;

    public Flower(FlowerSpec spec, boolean fresh, double price) {
        this.spec = spec;
        this.fresh = fresh;
        this.price = price;
    }

    public FlowerType getType() {
        return this.spec.getFlowerType();
    }
    public double getPrice() {
        return price;
    }
    public double getLength() {
        return this.spec.getLength();
    }
    public FlowerColor getColor() {
        return this.spec.getColor();
    }
    public boolean isFresh() {
        return fresh;
    }


    public String toString() {
        return "Type: " + getType() + ", Price:  " + String.valueOf(getPrice()) + ", Color is " + getColor() + ", Freshness level is " + String.valueOf(isFresh()) + ", Height: " + String.valueOf(getLength());
    }

}
