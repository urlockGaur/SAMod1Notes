package creator;

public class Bike {

    private Wheel frontWheel, backWheel;
    private Frame frame;

    /* Finish the Bike class. You should be able create a Bike
    object with two Wheel objects and a Frame object*/
    public Bike(Wheel wheel1, Wheel wheel2, Frame frame){
        frontWheel = wheel1;
        backWheel = wheel2;
        this.frame = frame;
    }
    
    public Bike(float wheelSize, float frameSize){
        frontWheel = new Wheel(wheelSize);
        backWheel = new Wheel(wheelSize);
        frame = new Frame(frameSize);
    }
}
