//Base Class Bird
public class Bird {

    //Common trait of all birds so implemented in the base class

    public void eat() {
        System.out.println(getClass().getSimpleName()+" is Eating!");
    }

}//End of Bird Class

interface CanFly {
    //This method is by default abstract and public

    void flying();
}// End of CanFly Interface

class Parrot extends Bird implements CanFly {

    @Override                   //If you don't implement the flying() you will get an error!
    public void flying() {      //Overriing the method of CanFly interface
        System.out.println("Parrot is Flying!");
    }
}//End of Parrot Class

class Penguin extends Bird {
    //Penguin cannot fly so not implementing CanFly

    public void walk() {
        System.out.println("Penguin is Walking!");
    }
} //End if Penguin Class