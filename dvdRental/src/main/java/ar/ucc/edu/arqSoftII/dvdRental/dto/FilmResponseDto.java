package ar.ucc.edu.arqSoftII.dvdRental.dto;


import ar.ucc.edu.arqSoftII.common.dto.DtoEntity;
import ar.ucc.edu.arqSoftII.dvdRental.model.Gender;

import java.util.Date;

public class FilmResponseDto implements DtoEntity {
	private String title;
	private String synopsis;
	private Date year;
	private Gender gender;

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

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
