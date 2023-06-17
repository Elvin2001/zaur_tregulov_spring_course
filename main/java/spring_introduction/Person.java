package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private String name;
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {
//        System.out.println("Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
