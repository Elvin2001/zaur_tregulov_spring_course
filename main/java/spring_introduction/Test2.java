package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        // Создание Application Context - контейнера, где содержатся бины(объекты)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получение бинов(объектов) из Application Context
        Pet myDog = context.getBean("dog", Pet.class);
        Pet myCat = context.getBean("cat", Pet.class);

        myDog.say();
        myCat.say();

        // Закрытие Application Context
        context.close();
    }
}
