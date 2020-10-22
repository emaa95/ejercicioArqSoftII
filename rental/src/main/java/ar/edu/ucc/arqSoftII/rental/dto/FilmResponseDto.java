package ar.edu.ucc.arqSoftII.rental.dto;


import ar.edu.ucc.arqSoftII.common.dto.DtoEntity;
import ar.edu.ucc.arqSoftII.rental.model.Gender;

import java.util.Date;

public class FilmResponseDto implements DtoEntity {
	private String title;
	private String synopsis;
	private String year;
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

}
