public class Demo {
    public static void main(String[] args) {

        // By default StringBuffer has the Buffer size or capacity of 16 bits
        StringBuffer obj = new StringBuffer();
        System.out.println(obj.capacity());

        StringBuffer sb = new StringBuffer("Aditya");
        System.out.println(sb.capacity());  // give capacity of 22 bits
        System.out.println(sb.length()); // while the length is 6 of Aditya
        System.out.println(sb.append(" Ghosh")); // here you can change the string data
        sb.deleteCharAt(3);
        sb.insert(4, "JavaLang");
        sb.setLength(30);
        sb.ensureCapacity(100);
        System.out.println(sb);


        // String name = sb.toString();
        // System.out.println(name);
    }
}
