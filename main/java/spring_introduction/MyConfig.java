package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("spring_introduction")
public class MyConfig {
    @Bean
    public Pet catBean() {
        System.out.println("Cat bean is created!");
        return new Cat();
    }
    @Bean
    public Person personBean() {
        System.out.println("Person bean is created!");
        return new Person(catBean());
    }
}