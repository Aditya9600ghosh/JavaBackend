class A{
    int age;

    public void show(){
        System.out.println("in show");
    }

    // class B{
    //     public void config(){
    //         System.out.println("in Config");
    //     }
    // }

    static class B{ // here static can be used only for inner class
        public void config(){
            System.out.println("in Config");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();


        // if you want to access the method config, you can't create the object of B directly
        // A.B obj1 = obj.new B();  // since B class is a non static class that's why we need object to use it


        // if you make the class B as static then
        A.B obj1 = new A.B();
        obj1.config();
    }
}
