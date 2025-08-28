


abstract class Car{
    // public void drive(){

    // }

    // Now instead of defining a method you should declare a method when it does not have any operation

    public abstract void drive(); // abstract here means a car should have this driving feature but I don't know how to implement it, abstract method should be declared only in abstract class( You cannot create object of an abstract class ) but it's not compulsory that an abstract class should have the abstract method without abstract method it will also work

    public abstract void fly(); // when a method is abstract it must define in the subclass

    public void playMusic(){
        System.out.println("play Music");
    }
}




abstract class Lamborghini extends Car{


    // but if you don't want to define the abstract method like fly() here then make this Lamborghini class also as an abstract class but the problem now is you cannot make the object of Lamborghini class

    public void drive(){
        System.out.println("Driving......");
    }
}

class Luxury extends Lamborghini{          // Concrete class
    public void fly(){
        System.out.println("Flying...");
    }
}

public class Demo {
    public static void main(String[] args) {
        Car obj = new Luxury();   // here the object is of Luxury class but the reference is of Car class
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
