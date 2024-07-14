package co.develhope.repository2.entities;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestParam;

@Entity
@Table(name = "linguaggi_di_programmazione")
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name" , nullable = false)
    private String name;
    @Column(name = "first_appearance ")
    private Integer firstAppearance;
    @Column(name = "inventor " , nullable = false)
    private String inventor;

    public ProgrammingLanguage(){
    }

    public ProgrammingLanguage(Integer firstAppearance, Integer id, String inventor, String name) {
        this.firstAppearance = firstAppearance;
        this.id = id;
        this.inventor = inventor;
        this.name = name;
    }

    public Integer getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(Integer firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "firstAppearance=" + firstAppearance +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", inventor='" + inventor + '\'' +
                '}';
    }
}
