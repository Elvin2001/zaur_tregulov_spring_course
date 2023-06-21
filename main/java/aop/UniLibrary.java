package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
//    @Override
    public void getBook(Book book) {
        System.out.println("Мы берём книгу из UniLibrary: " + book.getName());
    }

//    @Override
    public void returnBook() {
        System.out.println("Мы возвращаем книгу из UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал из UniLibrary");
    }
}
