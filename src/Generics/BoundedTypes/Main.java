package Generics.BoundedTypes;


public class Main {
    public static void main(String[]args) {
        MyGenericsClass<Integer, Integer> myInt = new MyGenericsClass<>(1,1);
        MyGenericsClass<Double, Double> myDouble = new MyGenericsClass<>(3.4,4.3);

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
    }
}