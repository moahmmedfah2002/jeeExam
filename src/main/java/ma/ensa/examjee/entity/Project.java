package ma.ensa.examjee.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;
    private double budget;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "project_employe",joinColumns = @JoinColumn(name = "id_project")
            ,inverseJoinColumns = @JoinColumn(name = "id_employe"))
    private List<Employe> employes;
}
