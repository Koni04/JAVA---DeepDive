package Generics.GenericsMethod;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};
        Double[] doubleArr = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArr = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArr = {"B", "Y", "E"};

        //displayArray(intArr);
        //displayArray(doubleArr);
        //displayArray(charArr);
        //displayArray(stringArr);

        /*
        System.out.println(getFirst(intArr));
        System.out.println(getFirst(doubleArr));
        System.out.println(getFirst(charArr));
        System.out.println(getFirst(stringArr));
        * */
    }

    public static <Thing> void displayArray(Thing[] array) {
        for (Thing x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0];
    }
}