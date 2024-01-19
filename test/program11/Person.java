package test.program11;

public class Person {
    public String name;
    public int age;
    public String address;
    String email;

    Person(String name, int age, String address, String email){
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public boolean checkAge(int age){
        if(0 <= age && age < 100){
            return true;
        }
        return false;
    }
    public String getAddress(){
        return address;
    }
}
