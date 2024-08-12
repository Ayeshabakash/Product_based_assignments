public class main {
    public static void main(String[] args) {
        Person person1 = new Person("Anish", 25);
        Person person2 = new Person("Fathima", 30);
        System.out.println( person1.name + " "+ person1.age);
        System.out.println( person2.name + " "+ person2.age);
    }
}
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
