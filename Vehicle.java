public class Vehicle {

    private String make;
    private String color;
    private int year;
    private String model;

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color =color;
        this.year = year;
        this.model = model;

    }

    public void printDetails() {
        System.out.println("Manufacturer:  " + make);
        System.out.println("Color: "+color);
        System.out.println("Year: "+year);
        System.out.println("Model "+ model);
    }
}


//class Car extends Vehicle {
//    private String bodyStyle;
//
//    public Car(String make, String color, int year, String model, String bodyStyle) {
//        super(make, color, year, model);
//        this.bodyStyle = bodyStyle;
//    }
//
//    public void carDetails() {
//        printDetails();
//        System.out.println("Body Style: " + bodyStyle);
//    }
//
//    public void getDetails(String carName) {
//
//        System.out.println(carName);
//    }
//}

