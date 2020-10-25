package ar.edu.ucc.arqSoftII.rental.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqSoftII.common.dto.DtoEntity;
import ar.edu.ucc.arqSoftII.rental.model.Rental;

public class MemberResponseDto implements DtoEntity{
	private String name;
    private String lastName;
    private Long dni;
    private String email;
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
