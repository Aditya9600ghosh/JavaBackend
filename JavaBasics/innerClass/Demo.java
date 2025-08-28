class Outer{
    int age;

    public void show(){
        System.out.println("in show");
    }

    // class Inner{
    //     public void config(){
    //         System.out.println("in Config");
    //     }
    // }

    static class Inner{ // here static can be used only for inner class
        public void config(){
            System.out.println("in Config");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Outer outerObject = new Outer();
        outerObject.show();


        // if you want to access the method config, you can't create the object of Inner class directly
        // Outer.Inner innerObject = outerObject.new Inner();  // since Inner class is a non static class that's why we need object to use it


        // if you make the class B as static then
        Outer.Inner innerObject = new Outer.Inner();
        innerObject.config();
    }
}
