package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Maksim", 8);
//            Child child2 = new Child("Ivan", 10);
//            Child child3 = new Child("Anastasia", 7);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!") ;

            session = factory.getCurrentSession();
//            Section section = new Section("Dancing");
//            Child child1 = new Child("Masha", 12);
//            Child child2 = new Child("Alena", 13);
//            Child child3 = new Child("Igor", 9);
//
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);

            session.beginTransaction();
            Child child = session.get(Child.class, 4);
            session.remove(child);

            session.getTransaction().commit();
            System.out.println("Done!!!");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
