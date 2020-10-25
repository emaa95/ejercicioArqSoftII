package ar.edu.ucc.arqSoftII.rental.service;

import ar.edu.ucc.arqSoftII.common.dto.ModelDtoConverter;
import ar.edu.ucc.arqSoftII.rental.dao.FilmDao;
import ar.edu.ucc.arqSoftII.rental.dto.FilmRequestDto;
import ar.edu.ucc.arqSoftII.rental.dto.FilmResponseDto;
import ar.edu.ucc.arqSoftII.rental.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class FilmService {

    @Autowired
    private FilmDao filmDao;
	
	public FilmResponseDto getFilmById (Long id) {
		
		Film film = filmDao.load(id);
		
		FilmResponseDto dto = new FilmResponseDto();
		dto.setTitle(film.getTitle());
		dto.setSynopsis(film.getSynopsis());
		dto.setYear(film.getYear());
		dto.setGender(film.getGender());
		return dto;
		
	}

 
    public List<FilmResponseDto> getAllFilms() {
        List<Film> films = filmDao.getAll();

        List<FilmResponseDto> response = new ArrayList<FilmResponseDto>();

        for (Film film : films) {
            response.add((FilmResponseDto) new ModelDtoConverter().convertToDto(film, new FilmResponseDto()));
        }

        return response;
    }


    public FilmResponseDto insertFilm(FilmRequestDto request) {

        Film film = (Film) new ModelDtoConverter().convertToEntity(new Film(), request);

        filmDao.insert(film);

        FilmResponseDto response = (FilmResponseDto) new ModelDtoConverter().convertToDto(film, new FilmResponseDto());

        return response;
    }
}
