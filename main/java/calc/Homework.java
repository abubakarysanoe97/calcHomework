package calc;

public class Homework {

    public static double addition(double num1, double num2){
        return num1 + num2;

    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }
    public static double squareRoot(double num1, double num2) {
        if (num1 < 0) {

        }
        return Math.sqrt(num1);
    }
    public static double exponent(double base, double toThePowerOf){
        return Math.pow(base,toThePowerOf);
    }

    public static void main(String[] args) {
        double num1 = 3;
        double num2 = 5;
        System.out.println(squareRoot(num1,num2));
        System.out.println(exponent(num1,num2));
        System.out.println(division(num1,num2));
        System.out.println(multiplication(num1,num2));
        System.out.println(subtract(num1,num2));
        System.out.println(addition(num1,num2));
    }
}
