package creator;

public class BikeShop {

    public static void main(String[] args) {
        /**
         * Create a Bike object.
         */
        Wheel frontWheel = new Wheel(20);
        Wheel backWheel = new Wheel(20);
        Frame frame = new Frame(30);

        Bike bike = new Bike( frontWheel, backWheel, frame);

        System.out.println(bike);
    }
}
