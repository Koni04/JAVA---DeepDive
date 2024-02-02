package Generics.GenericsClass;

public class Main {
    public static void main(String []args ){
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,1);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.4,4.3);
        MyGenericClass<Character, Character> myCharacter = new MyGenericClass<>('@', '&');
        MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello World", '!');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myCharacter.getValue());
        System.out.println(myString.getValue());
    }
}