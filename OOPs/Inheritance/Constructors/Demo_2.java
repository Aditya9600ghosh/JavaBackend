// Here we are talking about super() keyword

class A{

    // Default Constructor
    public A(){

        super();  // now this super() keyword shows its SuperClass which is an Object class means its classname is Object
        System.out.println("in A");
    }

    // Parameterised Constructor
    public A(int n){

        super();
        System.out.println("in A int " + n);
    }
}

class B extends A{

    // Default Constructor
    public B(){

        super();  // But if you want to call A's Parameterised Constructor & B's Default Constructor then pass the parameter in this super(5)
        System.out.println("in B");
    }

    // Parameterised Constructor
    public B(int n){

        this();  // now suppose you want to call both the constructor of B and the default constuctor of A then this() keyword will execute the constructor of this same class which is the default constructor of B

        //super(); // Now here the super() keyword is without any parameter that's why it call class A(which is SuperClass of B) default constructor but if you want to call A's Parameterised Constructor then pass some value in this super(5)
        System.out.println("int B int " + n);
    }
}

public class Demo_2 {
    public static void main(String[] args) {
        B obj = new B(5);   // now here when you invoke the parameterised constructor of B it will call the default constructor of A and parameterised constructor of B

        // Every constructor has a super() keyword which shows its SuperClass
    }
}
