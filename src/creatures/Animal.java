package creatures;

import devices.sellable;

public abstract class Animal implements sellable , Feedable {
    private double weight;
    final String species;
    String name;
    int age;
    boolean isLive;

    public Animal(String species) {
        this.species = species ;
        isLive = true;
        switch (species) {

            case "wolf":
                weight = 20;
                break;
            case "elephant":
                weight = 500;
                break;
            case "cat": weight = 4;

        }
        }

       @Override
       public void feed()
        {
            if(isLive == true)
            weight+=1;
            else
                System.out.println("Pet is dead");
        }

    @Override
    public void feed(double weight)
    {
        if(isLive == true)
            this.weight+= weight/2;
        else
            System.out.println("Pet is dead");
    }
        public void takeAWalk() {
            if (isLive == true) {
                weight -= 1;
                if (weight <= 0) {
                    System.out.println("Dead");
                    isLive = false;
                }
            }
            else
                System.out.println("Pet is dead");
        }

    public void sell(Human seller , Human buyer, double price)
    {
        if(seller.getAnimal() == this && buyer.cash >= price) {
            System.out.println("Tranzakcja przebiegła pomyślnie");
            buyer.setAnimal(this);
            seller.setAnimal(null);
            seller.cash += price;
            buyer.cash -= price;
        }
        else
            System.out.println("Nie można przeprowadzić tranzakcji");
    }


    }

