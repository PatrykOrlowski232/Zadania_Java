public class Human {
    String name;
    int age;
    double salary;

    Animal pet;

    Car car;

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

}
