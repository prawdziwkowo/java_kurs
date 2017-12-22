package r09obiektowe;

public abstract class VehicleProperties {
    public void notToFast(int speed, int speedMax) {
        if (speed * 2 > speedMax) {
            System.out.println("Jedziesz za szybko do jasnej ciasnej anielki");
        }
    }

    public abstract void turn(int angle);
}
