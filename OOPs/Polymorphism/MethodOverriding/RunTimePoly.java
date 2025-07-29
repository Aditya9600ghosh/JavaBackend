class A{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class B extends A{
    public int add(int n1, int n2){  // here this B's method override its parent class A's method
        return n1 + n2 + 5;
    }
}

public class RunTimePoly {
    public static void main(String[] args) {
        B obj = new B();
        int ans = obj.add(3, 4);
        System.out.println(ans);
    }
}