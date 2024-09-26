/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
public class Inheritance1 extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Inheritance1 dog = new Inheritance1();
        dog.eat();
        dog.bark();
    }
}
