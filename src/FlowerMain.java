
import java.util.Arrays;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower(new FlowerSpec(FlowerColor.RED, FlowerType.MAK, 10), true, 12.5);
        Flower romashka = new Flower(new FlowerSpec(FlowerColor.BLUE, FlowerType.ROMASHKA, 5), true, 12.5);
        Flower rose = new Flower(new FlowerSpec(FlowerColor.RED, FlowerType.ROSE, 10), true, 12.5);
        FlowerSpec flower = new FlowerSpec(FlowerColor.RED, FlowerType.MAK, 10);

        bucket.addFlower(mak);
        bucket.addFlower(romashka);
        bucket.addFlower(rose);

        System.out.println(Arrays.toString(bucket.searchFlower(flower)));

    }
}
