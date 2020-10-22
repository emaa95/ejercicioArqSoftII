package ar.edu.ucc.arqSoftII.rental.model;

import ar.edu.ucc.arqSoftII.common.model.GenericObject;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "FILM")

public class Film extends GenericObject {

    @NotNull
    @Size(min=1 , max = 50)
    @Column(name = "TITLE")
    private String title;

    @NotNull
    @Size(min=1 , max = 50)
    @Column(name = "SYNOPSIS")
    private String synopsis;

    @NotNull
    @Size(min=1 , max = 50)
    @Column(name = "YEAR")
    private String year;

    @Enumerated(value = EnumType.ORDINAL)
    @Column(name = "GENDER")
    private Gender gender;

    @OneToMany(mappedBy="film", fetch = FetchType.LAZY)
    private Set<Rental> rental;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

	public Set<Rental> getRental() {
		return rental;
	}

	public void setRental(Set<Rental> rental) {
		this.rental = rental;
	}
    
}
