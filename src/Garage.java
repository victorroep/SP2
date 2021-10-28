import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars = new ArrayList<Car>();
    private String name;

    public Garage(String name) {
        this.name = name;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public double calcTaxForGarage(){
        double tax = 0;
        for(Car car : cars){
            tax += car.calcTax();
        }
        return tax;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Garage{" +
                "cars=" + cars +
                ", name='" + name + '\'' +
                '}';
    }
}