class Calculator {

    public int add(int n1, int n2){
        return n1+n2;
    }
}

public class Main{
    public static void main(String[] args) {
        int a = 4, b = 5;
        Calculator obj = new Calculator();
        int ans = obj.add(a,b);
        System.out.println(ans);
    }
}