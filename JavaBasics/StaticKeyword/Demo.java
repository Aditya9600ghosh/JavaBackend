package JavaBackend.JavaBasics.StaticKeyword;

class Mobile{
    // instance variables
    String brand;
    int price;

    // static variable
    static String name;

    // Default Constructor
    // public Mobile(){
    //     brand = "";
    //     price = 200;
    //     System.out.println("This is default Constructor");
    // }

    // static block
    // static{
    //     name = "Phone";
    //     System.out.println("Static Block");
    // }

    public void display(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // static method
    public static void show(Mobile objectName){
        System.out.println("This is a static method");

        
        // System.out.println(brand + " : " + price + " : " + name);      here name is a static variable which can be used inside the static method but you can't use non-static variable directly, because it can't clarify that price and brand belongs to which object

        System.out.println(objectName.brand + " : " + objectName.price + " : " + name);
    }
}

public class Demo {
    public static void main(String[] args){ //throws ClassNotFoundException{
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1200;

        Mobile obj2 = new Mobile();
        obj2.brand = "Realme";
        obj2.price = 1000;

        Mobile.name = "Smart Phone"; // Accessing static variable name

        // obj1.display();
        // obj2.display();

        // for static block example
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1300;

        // Mobile obj2 = new Mobile();


        // If we don't want to create any objects then we can load the class using Class.forName
        // Class.forName("JavaBackend.JavaBasics.StaticKeyword.Mobile");

        // Mobile.show();


        // for using non-static variables inside the static method you can pass the object name as the parameter
        Mobile.show(obj1);
    }
}
