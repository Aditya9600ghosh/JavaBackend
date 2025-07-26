class A{
    public A(){
        System.out.println("Object created & Constructor Invoked");
    }

    public void show(){
        System.out.println("in A's show");
    }
}

public class Demo {
    public static void main(String[] args) {

        // new A();  // anonymous object because it does not have a name
        new A().show();



        // A obj;  // so here you are creating a reference variable
        // obj = new A();    // this new A() is called object creation & assigning the value to obj
        // obj.show();
    }
}
