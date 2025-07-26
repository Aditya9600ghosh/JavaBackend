class Calculator {

    int num = 5; // instance variable

    public int add(int n1, int n2){
        System.out.println("Accessing instance var num inside add method : " + num);
        return n1+n2;
    }
}

public class Demo {
    public static void main(String[] args) {
        int data = 10;
        System.out.println("Local variable of main method : " + data);
        Calculator obj1 = new Calculator();
        System.out.println("Addition of 3 & 4 = " + obj1.add(3,4));

        Calculator obj2 = new Calculator();
        obj1.num = 12;
        System.out.println(obj1.num);
        System.out.println(obj2.num);
    }
}
