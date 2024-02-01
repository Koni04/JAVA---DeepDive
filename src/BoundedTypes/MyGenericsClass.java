package BoundedTypes;

public class MyGenericsClass <Thing extends Number, Thing2> {
    Thing x;
    Thing2 y;

    MyGenericsClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue() {
        return this.y;
    }
}
