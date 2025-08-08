
public class Demo {
    public static void main(String[] args) {

        int n = 8;
        // Integer num1 = new Integer(n);  // now what we doing is that converting a primitive type into an object type called boxing

        Integer num1 = n;  // AutoBoxing

        // int x = num1.intValue();  // the num1 is of object type you have to get the value called Unboxing because you take out the value from object type to a primitive type

        int x = num1;  // this is called Auto-Unboxing

        System.out.println(x);


        String s = "12";
        int y = Integer.parseInt(s);
        System.out.println(y*3);
    }
}
