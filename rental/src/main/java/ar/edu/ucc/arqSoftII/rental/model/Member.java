package ar.edu.ucc.arqSoftII.rental.model;

import ar.edu.ucc.arqSoftII.common.model.GenericObject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "MEMBER")
public class Member extends GenericObject {

    @NotNull
    @Size(min=1 , max = 50)
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Size(min=1 , max = 50)
    @Column(name = "LASTNAME")
    private String lastName;

    @NotNull
    @Column(name = "DNI")
    private Long dni;

    @NotNull
    @Size(min=1 , max = 50)
    @Column(name = "EMAIL")
    private String email;

    @OneToMany(mappedBy="member", fetch = FetchType.LAZY)
    private Set<Rental> rental;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Rental> getRental() {
        return rental;
    }

    public void setRental(Set<Rental> rental) {
        this.rental = rental;
    }
}
