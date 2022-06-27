import com.sun.security.jgss.GSSUtil;

public abstract class Animal {

    public abstract void makeSound();

    public void move() {
        System.out.println(getClass().getSimpleName()+" is moving");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof....");
    }

}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow Meow....");
    }
}

class Sheep extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Baa Baa....");
    }
}