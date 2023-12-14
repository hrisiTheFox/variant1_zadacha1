import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Camry", "Toyota", 2020));
        cars.add(new Car("Vectra", "Opel", 1988));
        cars.add(new Car("C180", "Mercedes", 2007));
        cars.add(new Car("CX-5", "Mazda", 2023));

        Collections.sort(cars);
        for (Car car: cars){
            System.out.println(car);
        }
    }
}
