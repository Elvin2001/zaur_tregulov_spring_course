package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPet();

        // Создание Application Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получение бина из Application Context и внедрение зависимости(Dependency Injection) через constructor
        Person person = context.getBean("myPerson", Person.class);

        // Вывод информации о бине person
        System.out.println("person.getSurname() = " + person.getSurname());
        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.getAge() = " + person.getAge());
        context.close();
    }
}
