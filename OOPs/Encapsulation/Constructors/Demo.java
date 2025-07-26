class Human{

    private int age;
    private String name;

    public Human(){       // Default Constructor

        System.out.println("It is a default Constuctor");
        age = 34;
        name = "Aditya";
    }

    public Human(String name){       // Parameterised Constructor
        
        System.out.println("It is a Parameterised Constuctor");
        this.age = 5;
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human("Rama");
        // Default values using Constructor
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println();

        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println();


        // Instead of assign the values here if we want to set some default values to the variables then we can use Constructor
        // obj.setAge(20);
        // obj.setName("Tony");
        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}