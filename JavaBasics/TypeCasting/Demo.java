
class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class Demo {
    public static void main(String[] args) {
        // double d = 4.5;
        // int i = (int)d;  // Typecasting of double into integer forcefully through which we loss after decimal value
        // System.out.println(i);


        // A obj = (A) new B(); // this type is called Upcasting

        A obj1 = new B();  // object of B but of type or reference of A
        obj1.show1();

        // why we need to do Downcasting because using obj1 we still cannot use show2() reason because is of the reference is of A

        // Downcasting only works safely if the object is actually an instance of the subclass
        B obj2 = (B)obj1; // here the obj1 is of parent class reference using Downcasting you make it to child class reference
        obj2.show2();
    }
}
