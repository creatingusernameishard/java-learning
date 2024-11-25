package lv.acodemy;

import lv.acodemy.objects.Car;
import lv.acodemy.objects.Dog;

public class ObjectExample {

    public static void main(String[] args) {

        //Encapsulation - getters, setters
        //Inheritance
        //Polymorphism
        //Abstraction

        Car audi = new Car("blue", "RS6");
        audi.start();
        System.out.println(audi);

        //audi.color = "Blue";
       // audi.model = "RS6";
        audi.setColor("Blue");
        audi.setModel("RS6");
        System.out.println(audi);

        Car bmw = new Car();
        bmw.start();
        bmw.setModel("X5");
        bmw.setColor("Red");
        System.out.println(bmw);

        System.out.println("My car model is " + bmw.getModel() + " and color is " + bmw.getColor());

        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();

    }
}
