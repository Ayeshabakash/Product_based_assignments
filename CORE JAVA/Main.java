
class Vehicle {
    int speed;
    Vehicle() {
        speed = 0;
    }
    void speedUp() {
        speed += 75;
        System.out.println( speed);
    }
}
class Car extends Vehicle {
    @Override
    void speedUp() {
        speed += 100;
        System.out.println( speed);
    }
}
class Bicycle extends Vehicle {
    @Override
    void speedUp() {
        speed += 80;
        System.out.println( speed);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.speedUp();
        Car myCar = new Car();
        myCar.speedUp();
        Bicycle myBicycle = new Bicycle();
        myBicycle.speedUp();
    }
}
 