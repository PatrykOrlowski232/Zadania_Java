import devices.Car;

public class Main {
    public static void main(String[] args) {
        Animal pet = new Animal ("cat");
        Human me = new Human();
        Car wagen = new Car("Camaro" , "Chevrolet" , 20000);
        Car wagen2 = new Car("Camaro" , "Chevrolet" , 20000);

        for(int i = 0 ; i < 8 ; i++)
        pet.takeAWalk();

        me.setSalary(2000);
        me.setCar(wagen);
        wagen.tostring();

       System.out.println(wagen.equals(wagen2));
       System.out.println(pet);

       wagen.turnOn();

    }
}