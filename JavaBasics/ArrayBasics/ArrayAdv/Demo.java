class Student{
    int rollNo;
    String name;
    int marks;
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 2;
        s1.name = "Aditya";
        s1.marks = 91;

        Student s2 = new Student();
        s2.rollNo = 1;
        s2.name = "Aarohi";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Akshita";
        s3.marks = 92;


        Student arr[] = new Student[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i].name + " " + arr[i].marks);
        // }

        // forEach loop
        for(Student a : arr){
            System.out.println(a.name + " : " + a.marks);
        }
    }
}
