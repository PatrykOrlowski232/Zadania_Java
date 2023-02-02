package devices;

public class Car {
    final String model;

    public double price;
    final String producer;
    int ageOfProduction;

    public Car(String model , String producer , double price){
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public void tostring(){
        System.out.println("Model :" + model + "\nProducent:" + producer +"\nCena: " + price);
    }
}

