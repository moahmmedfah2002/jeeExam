package ma.ensa.examjee.entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;
    private String email;
    @OneToMany
    private List<Skills> skill;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "project_employe",joinColumns = @JoinColumn(name = "id_employe")
            ,inverseJoinColumns = @JoinColumn(name = "id_project"))
    private List<Project> project;
    private Post post;
}
