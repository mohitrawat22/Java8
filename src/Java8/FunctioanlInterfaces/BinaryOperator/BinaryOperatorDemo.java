package Java8.FunctioanlInterfaces.BinaryOperator;

import Java8.Person;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        Person person1 = new Person(10);
        Person person2 = new Person(20);
        System.out.println(person1);
        System.out.println(person2);

        BinaryOperator<Person> binaryOp = (p1, p2) -> {
            p1.age = p2.age;
            return p1;
        };
        binaryOp.apply(person1, person2);
        System.out.println("===============");
        System.out.println(person1);
        System.out.println(person2);
    }
}
