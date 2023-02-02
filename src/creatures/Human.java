package creatures;
import devices.Phone;

import devices.Car;

public class Human {
    String name;
    int age;
    double salary;

  private  Animal pet;

    private Car[] garage;

    int howMuchCars;

    private Phone phone;

    public double cash;

    public Human(Car[] garage)
    {
        this.garage = garage;
        howMuchCars = 0;
    }

    public Human(Car[] garage , int size)
    {
        this.garage = garage;
        howMuchCars = 0;
    }

   public double getSalary()

    {
        return salary;
    }

    public void setSalary(double x)
    {
        if(x < 0)
            System.out.println("Nie można przypisać ujemnej wartości");
        else {
            System.out.println("Bla bla bla biurokratyczne pierdoły");
            salary += x;
        }
    }

    public Car getCar(int whoes)
    {
        return garage[whoes];
    }

   public  void setCar(Car car){
        if(salary > car.price) {
            this.garage[howMuchCars] = car;
            howMuchCars++;
        }
        else if(salary > car.price/12) {
            System.out.println("Kupiłeś auto na kredyt");
            this.garage[howMuchCars] = car;
            howMuchCars++;
        }
        else
                System.out.println("Nie stać Cie na to auto");
    }
    public Phone getphone()
    {
        return phone;
    }
    public  void setPhone(Phone phone){

            this.phone = phone;

    }

    public Animal getAnimal()
    {
        return pet;
    }
    public  void setAnimal(Animal animal){

            this.pet= animal;

    }

    double value(){
        for(int i = 0 ; i < howMuchCars ; i++)
            garage[0].value += garage[i].price;
        return garage[0].value;
    }
}
