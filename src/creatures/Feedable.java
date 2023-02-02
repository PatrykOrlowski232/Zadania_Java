package creatures;

public interface Feedable {
    default void feed(){}
    default void feed(double weigth){}
}
