class Person{

    String name;
    int age;
    String gender;


}

public class ObjectCreation {


    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Harry";
        person1.age = 35;

        person2.name = "Sally";
        person2.age = 40;

        System.out.println(person1.name);
        System.out.println(person1.age);

    }
}
