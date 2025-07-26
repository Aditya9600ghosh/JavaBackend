class America{ // SuperClass
    public America(){
        System.out.println("A construtor");
    }
}

class Bhutan extends America{ // SubClass
    public Bhutan(){
        System.out.println("B constuctor");
    }
}

public class Demo_1 {
    public static void main(String[] args) {
        Bhutan obj = new Bhutan();  // Whenever you create an obj of a class it will call Constructor of both SubClass & SuperClass
    }
}
