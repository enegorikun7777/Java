package test.program11;

public class Mondai8 {
    public static void main(String[] args) {
        Person a = new Person(name:"A", age:18, address:"千代田区", email:"aaa@gmail");

        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.address);
        System.out.println(a.getAddress());
    }
}
