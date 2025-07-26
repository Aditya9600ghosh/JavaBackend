class Human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }



    // public void setAge(int a){  // here we ("a" as local var) which assigned to (age -> instance var)
    //     age = a;
    // }


    // But what if we don't want to use 2 variables like instead of "a" we can use "age"
    // public void setAge(int age) {
    //     age = age;     But here the compiler doesn't understand that the "age" is act as local var or instance var use for the object
    // }

    // for this we can just pass the object to the method
    // public void setAge(int age, Human obj) {
    //     Human obj1 = obj;
    //     obj1.age = age;
    // }

    // But we this keyword for the above task also
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
        
        // And here we can pass the object itself
        // obj.setAge(34, obj);

        obj.setAge(20);
        obj.setName("Tony");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
