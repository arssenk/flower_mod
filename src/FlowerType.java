/**
 * Created by Arsen on 23-Oct-16.
 */
public enum FlowerType {
    ROSE, TULIP, MAK, ROMASHKA;
    public String toString(){
        switch(this){
            case ROSE:
                return "Rose";
            case TULIP:
                return "Tulip";
            case MAK:
                return "Mak";
            case ROMASHKA:
                return "Romashka";
            default:
                return "No type";
        }
    }
}
