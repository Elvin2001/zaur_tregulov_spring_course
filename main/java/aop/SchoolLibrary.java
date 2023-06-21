package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
//    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из SchoolLibrary");
    }

    @Override
    public void returnBook() {
        System.out.println("Мы возвращаем книгу из SchoolLibrary");
    }
}
