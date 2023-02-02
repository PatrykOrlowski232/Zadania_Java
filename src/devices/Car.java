package devices;

public class Car extends Devices {


    public Car(String model, String producer, double price) {
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    @Override
    public void turnOn() {
        System.out.println("Auto jest włączone");
        this.oforon = true;
    }
}

