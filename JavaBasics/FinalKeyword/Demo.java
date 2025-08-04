// final keyword can be used with a - variable or method or class

// final keyword can be used with variable make it constant
// final keyword can be used with class to stop inheritance
// final keyword can be used with method to stop override this method

// final class Calc{
//     public void show(){
//         System.out.println("By Aditya");
//     }

//     public void add(int a, int b){
//         System.out.println(a + b);
//     }
// }

// class AdvCalc extends Calc{   if the Calc class is final no other class is able to extends this class

// }

class Calc{
    public final void show(){ // here the method is final so it can't be override
        System.out.println("By Aditya");
    }

    public void add(int a, int b){
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc{
    public void show(){  // since the show() method is final so it cannot be override in his subclass
        System.out.println("By John");
    }
}

public class Demo {
    public static void main(String[] args) {
        // final int n = 10; // final variable act same as const in C++ which can't change its value one's assigned

        // // n = 5;
        // System.out.println(n);


        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(13, 12);
    }
}
