public class Calculator{

    private double num1;
    private double num2;

    public Calculator() {
        num1 = 0;
        num2 = 0;
    }
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    

    double add() {return num1+num2;}
    double subtract() { return num1-num2;}
    double multiply() { return num1*num2;}
    double divide() { return num1/num2;}

}

class Demo {
    
    public static void main(String args[]) {
        Calculator calcpair = new Calculator(5,10);
        System.out.println(calcpair.add());
        System.out.println(calcpair.subtract());
        System.out.println(calcpair.multiply());
        System.out.println(calcpair.divide());

        Calculator calc = new Calculator();
        System.out.println(calc.add());
        System.out.println(calc.subtract());
        System.out.println(calc.multiply());
        System.out.println(calc.divide());
    }
}