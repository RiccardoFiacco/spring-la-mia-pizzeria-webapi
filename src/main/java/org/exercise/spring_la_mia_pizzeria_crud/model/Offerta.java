package org.exercise.spring_la_mia_pizzeria_crud.model;
import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



@Entity
@Table(name = "offerts")
public class Offerta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    @Size(min=5)
    @NotBlank(message = "campo deve essere popolato")
    private String title;

    @Column(name = "start")
    @NotBlank(message = "campo deve essere popolato")
    private LocalDate start;

    @Column(name = "end")
    @NotBlank(message = "campo deve essere popolato")
    private LocalDate end;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    


}
