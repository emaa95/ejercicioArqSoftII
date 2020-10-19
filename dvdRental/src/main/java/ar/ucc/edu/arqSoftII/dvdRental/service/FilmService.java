package ar.ucc.edu.arqSoftII.dvdRental.service;

import ar.ucc.edu.arqSoftII.common.dto.ModelDtoConverter;
import ar.ucc.edu.arqSoftII.dvdRental.dao.FilmDao;
import ar.ucc.edu.arqSoftII.dvdRental.dto.FilmRequestDto;
import ar.ucc.edu.arqSoftII.dvdRental.dto.FilmResponseDto;
import ar.ucc.edu.arqSoftII.dvdRental.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FilmService {

    @Autowired
    private FilmDao filmDao;

    public FilmResponseDto getStateById(Long id) {
        Film film = filmDao.load(id);

        FilmResponseDto response = (FilmResponseDto) new ModelDtoConverter().convertToDto(film, new FilmResponseDto());
        return response;
    }


    public FilmResponseDto insertProduct(FilmRequestDto request) {

        Film film = (Film) new ModelDtoConverter().convertToEntity(new Film(), request);

        filmDao.insert(film);

        FilmResponseDto response = (FilmResponseDto) new ModelDtoConverter().convertToDto(film, new FilmResponseDto());

        return response;
    }
}
