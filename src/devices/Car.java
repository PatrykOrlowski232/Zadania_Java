package devices;

import creatures.Human;

public abstract class Car extends Devices implements  sellable {


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

    @Override
    public void sell(Human seller , Human buyer, double price)
    {
        if(seller.getCar() == this && buyer.cash >= price) {
            System.out.println("Tranzakcja przebiegła pomyślnie");
            buyer.setCar(this);
            seller.setCar(null);
            seller.cash += price;
            buyer.cash -= price;
        }
        else
            System.out.println("Nie można przeprowadzić tranzakcji");
        }

        abstract void refuel();
    }


