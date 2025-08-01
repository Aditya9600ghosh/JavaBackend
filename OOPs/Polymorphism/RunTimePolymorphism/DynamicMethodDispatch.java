
class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}

public class DynamicMethodDispatch{
    public static void main(String[] args) {
        // A obj = new B(); // here the type of obj variable is A but its implementation is B

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show(); // here the reference is A but the object is of B

        obj = new C();
        obj.show();

        // At this point we aren't sure that obj.show() call which method of which class it all decide at the runtime & that's why this is called runtime polymorphism and this method is called Dynamic Method Dispatching because that's Dynamic which method it will call we aren't sure
    }
}