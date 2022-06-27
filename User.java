import java.util.Arrays;
import java.util.LinkedList;

public class User {

    // Public Fields
    private String userName;
    private String password;

    //Parameterized constructor to create new users
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public void login(String userName, String password) {
        //Check if the username and password match
        if (this.userName.toLowerCase().equals(userName.toLowerCase()) && this.password.equals(password)) {
            System.out.println("Access Granted against the username: " + this.userName + " and password: " + this.password);
        }
        else System.out.println("Invalid Credentials");

    }
}


class Main {

    public static void main(String[] args) {
        User educative = new User("Educative", "12345");

        educative.login("Educative", "12345");

        educative.login("Educative", "6789");

        //educative.password = "6789";

//        educative.login("Educative", "6789");
//
//        Car myCar = new Car("Lexus", "Midnight Blue", 2016, "RX350", "SUV 4 Wheel Drive");
//        myCar.carDetails();

        Shape[] shape = new Shape[2];

        shape[0] = new Rectangle(5,10);
        shape[1] = new Circle(76);

        System.out.println(shape[0].getArea());
        System.out.println(shape[1].getArea());

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal sheep = new Sheep();

        dog.makeSound();
        dog.move();

        cat.makeSound();
        cat.move();

        sheep.makeSound();
        sheep.move();

        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();

        parrot.eat();
        parrot.flying();

        penguin.eat();
        penguin.walk();


        Car cObj = new Car("Midnight Blue", 600, 4,4);
        cObj.carDetail();

        int input = 20;
        System.out.println("Fibonacci sequence for the first" + input + " elements is:");

        // Loop to print all the fibonacci sequence elements
        FibbonacciClass fb = new FibbonacciClass();

        int i = 0;
        while (i < input ) {
            System.out.print(fb.fibonacci(i) + " ");
            i++;
        }

        Solution c = new Solution();
        System.out.println(" ");
        System.out.println("--------GCD Solution-----");
        System.out.println(c.gcd(83,89));

        System.out.println(c.reverseString("kayak refer racecar"));

        System.out.println(c.remDuplicates("Thissss isss a tessttt"));

        char[] input_pr = {'a', 'b', 'c', 'd'};
        Solution.strPermutations(input_pr, input_pr.length);

        Permutations pr = new Permutations("ABC");

        pr.permute();
        int[] a = new int[]{1,2,3,4,4};
        System.out.println(c.firstoccurance(a, 3));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c.inverseArray(a, 0, 4)));

        System.out.println("Now sorting above array");

        System.out.println(Arrays.toString(c.sortArray(a, 0)));
//
//        LinkedList.Node head = null;
//        head = LinkedList.insertAtHead(head, 5);
//        head = LinkedList.insertAtHead(head, 4);
//        head = LinkedList.insertAtHead(head, 3);
//        head = LinkedList.insertAtHead(head, 2);
//        head = LinkedList.insertAtHead(head, 1);
//
//        System.out.println("Print Linked List");
//        for (LinkedList.Node i_link= head; i_link != null; i_link = i_link.next) {
//            System.out.print(i_link.value + " ");
//        }
//        System.out.println(" ");
//        System.out.println("Print reversed Linked List");
//        System.out.println(" ");
//        LinkedList.reverse(head);
//
//        System.out.println(LinkedList.search(head, 8));
//



    }

} // End of Main class