/**
 * Created by Arsen on 23-Oct-16.
 */
public class FlowerSpec {
    protected FlowerColor color;
    protected FlowerType type;
    protected double length;

    public FlowerSpec(FlowerColor color, FlowerType type, double length) {
        this.color = color;
        this.type = type;
        this.length = length;
    }

    protected FlowerColor getColor() {
        return this.color;
    }

    protected FlowerType getFlowerType() {
        return this.type;
    }
    protected double getLength(){
        return this.length;
    }
}
