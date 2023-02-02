package creatures;
import devices.Phone;

import creatures.Animal;
import devices.Car;

public class Human {
    String name;
    int age;
    double salary;

  private  Animal pet;

    private Car car;

    private Phone phone;

    public double cash;

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

    public Car getCar()
    {
        return car;
    }

   public  void setCar(Car car){
        if(salary > car.price)
            this.car = car;
        else if(salary > car.price/12) {
            System.out.println("Kupiłeś auto na kredyt");
            this.car = car;
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

}
