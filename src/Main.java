import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Diesel;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("cat");
        Car[] Garage = new Car[5];
        Car[] Garage2 = new Car[5];
        Human me = new Human(Garage);
        Human sister = new Human(Garage2);
        Car wagen = new Diesel("Camaro" , "Chevrolet" , 20000);
        Car wagen2 = new Diesel("Camaro" , "Chevrolet" , 20000);

        for(int i = 0 ; i < 8 ; i++)
        pet.takeAWalk();

        me.setSalary(2000);
        me.setCar(wagen);
        wagen.tostring();

       System.out.println(wagen.equals(wagen2));
       System.out.println(pet);

       wagen.turnOn();

        sister.cash += 1000;

        me.setAnimal(pet);
        pet.sell(sister,me,500);
        pet.sell(me,sister,500);

    }
}