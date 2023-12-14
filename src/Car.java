public class Car extends Vehicle implements Comparable<Car>{
    private String model;
    private String brand;
    private int year;

    public Car() {
        this.model = "";
        this.brand = "";
        this.year = 0;
    }

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void drive() {
        System.out.println("The vehicle is moving.");
    }


    @Override
    public int compareTo(Car o) {
        if (this.getYear() < o.getYear()){
            return -1;
        }
        else if (this.getYear() > o.getYear()){
            return 1;
        }
        else{
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }


}
