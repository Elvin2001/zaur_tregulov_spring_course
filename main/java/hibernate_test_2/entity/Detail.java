package hibernate_test_2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Detail {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;
}
