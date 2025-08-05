
class Laptop{
    String model;
    int price;

    // public String toString(){
    //     return model + " : " + price;
    // }

    // public boolean equals(Laptop that){
    //     return this.model.equals(that.model) && this.price == that.price;
    // }

    

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Laptop obj = new Laptop();
        // obj.model = "Dell Inspiron";
        // obj.price = 1000;

        // System.out.println(obj); // every time when you try to print the object by default behind the scene it will call toString() method

        // System.out.println(obj.toString());

        Laptop obj1 = new Laptop();
        obj1.model = "Dell Inspiron";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Dell Inspiron";
        obj2.price = 1000;

        boolean ans = obj1.equals(obj2);  // ByDefault it gives the result false while the values of obj1 & obj2 are equal because .equals() method is coming from the Object class where it compares the hexadecimal no. of both the objects

        System.out.println(ans);
    }
}
