class A{
    public void show(){ // now let's say you want to update the show() method, for this you can create a SubClass and override the show() method but suppose if this show() method used only once then you can use anonymous Inner class
        System.out.println("in A show");
    }
}


public class Demo {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("this is the latest show");
            }
        };

        obj.show();
    }
}