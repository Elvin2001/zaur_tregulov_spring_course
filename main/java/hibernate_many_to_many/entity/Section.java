package hibernate_many_to_many.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
@Getter
@Setter
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String sectionName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "child_section",
            joinColumns = @JoinColumn(name = "section_id"),
            inverseJoinColumns = @JoinColumn(name = "child_id")
    )
    private List<Child> children;

    public Section() {
    }

    public Section(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", sectionName='" + sectionName + '\'' +
                '}';
    }

    public void addChildToSection(Child child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
        System.out.println("Новый ребёнок " + child.getFirstName() + " записан в данную секцию");
    }


}
