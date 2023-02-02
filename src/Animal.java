public class Animal {
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

        void feed()
        {
            if(isLive == true)
            weight+=1;
            else
                System.out.println("Pet is dead");
        }

        void takeAWalk() {
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


    }

