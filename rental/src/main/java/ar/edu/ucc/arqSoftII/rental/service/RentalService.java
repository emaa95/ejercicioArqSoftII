package ar.edu.ucc.arqSoftII.rental.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoftII.rental.dao.FilmDao;
import ar.edu.ucc.arqSoftII.rental.dao.MemberDao;
import ar.edu.ucc.arqSoftII.rental.dao.RentalDao;
import ar.edu.ucc.arqSoftII.rental.dto.RentalRequestDto;
import ar.edu.ucc.arqSoftII.rental.dto.RentalResponseDto;
import ar.edu.ucc.arqSoftII.rental.model.Rental;

@Service
@Transactional
public class RentalService {
	
	@Autowired
	private RentalDao rentalDao;
	
	@Autowired
	private FilmDao filmDao;
	
	@Autowired
	private MemberDao memberDao;
	
	
	public RentalResponseDto registerRental (RentalRequestDto dto) {
		
		Rental rental = new Rental();
		
		rental.setRentalDate(Calendar.getInstance().getTime());
		rental.setFilm(filmDao.load(dto.getFilmId()));
		rental.setMember(memberDao.load(dto.getMemberId()));
		
		rentalDao.insert(rental);
		
		RentalResponseDto response = new RentalResponseDto();
		
		response.setLastName(rental.getMember().getLastName());
		response.setTitle(rental.getFilm().getTitle());
		response.setDate(rental.getRentalDate());
		
		return response;
	

}
}
