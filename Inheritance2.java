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

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance2 extends Dog {
    void play() {
        System.out.println("The puppy plays.");
    }

    public static void main(String[] args) {
        Inheritance2 puppy = new Inheritance2();
        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}
