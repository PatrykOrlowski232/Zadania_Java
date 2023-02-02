package devices;

import creatures.Human;

public abstract class Devices  {

    boolean oforon;
    String model;
    String producer;
    int ageOfProduction;
    public double price;

    public void tostring(){
        System.out.println("Model :" + model + "\nProducent:" + producer +"\nCena: " + price);
    }

 public   abstract void turnOn();


}
