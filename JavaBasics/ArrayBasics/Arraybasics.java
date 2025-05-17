package JavaBackend.JavaBasics.ArrayBasics;

public class Arraybasics {
    public static void main(String[] args) {
        // int arr[] = {12,13,14,15};
        // System.out.println(arr[0]);

        int arr[] = new int[5];
        arr[0] = 23;
        arr[3] = 34;
        arr[1] = 12;
        arr[2] = 45;
        arr[4] = 56;

        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
