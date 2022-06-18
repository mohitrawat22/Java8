package Java8;

public class Person {
    public int age;

    public Person() {
    }
    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
