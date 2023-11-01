package cars;

public class Car {
    public static void main(String[] args) {
        Demo<Car3> c = new Demo<>();
    }
}

class Car1 {

}

class Car2 extends Car1 {

}

class Car3 extends Car2 {

}

class Demo<T extends Car2> {

}