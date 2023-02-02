package devices;
import creatures.Human;

public interface sellable {

     default void sell(Human seller, Human buyer, double price) {

    }
}
