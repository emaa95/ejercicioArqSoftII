package ar.ucc.edu.arqSoftII.dvdRental.model;

import ar.ucc.edu.arqSoftII.common.model.GenericObject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "RENTAL")
public class Rental extends GenericObject {

    @NotNull
    @Size(min=1 , max = 50)
    @Column(name = "RENTALDATE")
    private Date rentalDate;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToMany(targetEntity= Rental.class, mappedBy="rental", fetch = FetchType.LAZY)
    private Set<Film> film;

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Set<Film> getFilm() {
        return film;
    }

    public void setFilm(Set<Film> film) {
        this.film = film;
    }
}
