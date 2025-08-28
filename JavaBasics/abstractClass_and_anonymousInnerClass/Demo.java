abstract class A{
    public abstract void show();
}
// now one method to define abstract show() method is to define in the subclass but instead of subclass we can use anonymous inner class also
public class Demo {
    public static void main(String[] args) {
        A obj = new A(){ // here it create the object of the anonymous inner class not of abstract class A
            public void show(){
                System.out.println("in show method");
            }
        };

        obj.show();
    }
}