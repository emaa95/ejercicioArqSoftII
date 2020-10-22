package ar.edu.ucc.arqSoftII.common.model;

import javax.persistence.*;

@MappedSuperclass
public class GenericObject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	} 
	
	
	

}
