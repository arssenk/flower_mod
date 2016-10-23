/**
 * Created by Arsen on 23-Oct-16.
 */
public enum FlowerColor {
    RED, GREEN, BLUE, YELLOW;
    public String toString(){
        switch(this){
            case RED:
                return "Red";
            case GREEN:
                return "Green";
            case BLUE:
                return "Blue";
            case YELLOW:
                return "Yellow";
            default:
                return "No colour";
        }
    }
}
