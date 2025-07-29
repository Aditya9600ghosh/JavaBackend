public class Main{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(7, 12);
        int r2 = obj.sub(12, 7);
        int r3 = obj.multi(5, 4);
        int r4 = obj.div(4, 2);

        System.out.println("Sum = " + r1 + " " + "Difference = " + r2);
        System.out.println("Prod = " + r3 + " " + "Div = " + r4);
    }
}