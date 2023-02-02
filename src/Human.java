import devices.Car;

public class Human {
    String name;
    int age;
    double salary;

    Animal pet;

    private Car car;

    double getSalary()

    {
        return salary;
    }

    void setSalary(double x)
    {
        if(x < 0)
            System.out.println("Nie można przypisać ujemnej wartości");
        else {
            System.out.println("Bla bla bla biurokratyczne pierdoły");
            salary += x;
        }
    }

    Car getCar()
    {
        return car;
    }

    void setCar(Car car){
        if(salary > car.price)
            this.car = car;
        else if(salary > car.price/12) {
            System.out.println("Kupiłeś auto na kredyt");
            this.car = car;
        }
        else
                System.out.println("Nie stać Cie na to auto");
    }

}
