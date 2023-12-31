package spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;

    @Value("${person.surname}")
    private String surname;

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created");
    }

    //    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

//    public void setSurname(String surname) {
//        this.surname = surname;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
