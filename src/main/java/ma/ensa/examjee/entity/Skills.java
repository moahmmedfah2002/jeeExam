package ma.ensa.examjee.entity;

import jakarta.persistence.*;


@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    private Employe employe;
}
