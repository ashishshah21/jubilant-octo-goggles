class Engine {
    private int capacity;

    public Engine() {
        capacity = 0;
    }

    public Engine(int capacity) {
        this.capacity = capacity;
    }

    public void engineDetails() {
        System.out.println("Engine Capacity: " + capacity);
    }
}

class Tires {
    private int noOfTires;

    public Tires() {
        noOfTires = 0;
    }

    public Tires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void tireDetails() {
        System.out.println("Number of Tires: "+noOfTires );
    }
}


class Doors {

    private int noOfDoors;

    public Doors() {
        noOfDoors = 0;
    }

    public Doors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public void doorDetails() {
        System.out.println("Number of Doors: " + noOfDoors);
    }
}

class Car {
    private Engine eObj;
    private Tires tObj;
    private Doors dObj;
    private String color;


    public Car(String color, int capacity, int noOfTires, int noOfDoors ) {
        this.eObj = new Engine(capacity);
        this.tObj = new Tires(noOfTires);
        this.dObj = new Doors(noOfDoors);
        this.color = color;

    }

    public void carDetail() {
        eObj.engineDetails();
        tObj.tireDetails();
        dObj.doorDetails();
        System.out.println("The color of Car is: "+this.color);
    }

}
