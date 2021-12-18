package OOP_Programs;

class Car {

    String brand;
    String color;

    // constructor
    public Car() {
        brand = "ford";
        color = "red";
    }

    public void set(String Brand, String Color) {
        this.brand = Brand;
        this.color = Color;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {

        return brand;

    }

    void run() {

        System.out.println("Car is running...");

    }
}

public class Sample {

    public static void main(String[] args) {
        Car ford = new Car();

        info(ford);
        // set attributes
        ford.set("BMW", "black");

        System.out.println("The brand of the car is: " + ford.getBrand());
        System.out.println("The color of the car is:" + ford.getColor());
        System.out.println("-----------------------------------------------------------");

        Car[] clone = new Car[3];

        extract(clone);
        int num = clone.length;
        int i;

        extracted(clone, num);
        for (i = 0; i < num; i++) {
            System.out.println("Car " + (i + 1) + " : " + (clone[i].getColor()) + " " + (clone[i].getBrand()));
        }

        ford.run();

    }

    private static void info(Car ford) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("The brand of the car is: " + ford.getBrand());
        System.out.println("The color of the car is:" + ford.getColor());
        System.out.println("-----------------------------------------------------------");
    }

    private static void extracted(Car[] clone, int num) {
        int i;
        for (i = 0; i < num; i++) {
            clone[i].set("BMW", "black");
        }
    }

    private static void extract(Car[] clone) {
        for (int i = 0; i < 3; i++) {
            clone[i] = new Car();
        }
    }
}