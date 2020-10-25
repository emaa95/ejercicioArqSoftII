package ar.edu.ucc.arqSoftII.rental.controller;

import ar.edu.ucc.arqSoftII.rental.dto.FilmRequestDto;
import ar.edu.ucc.arqSoftII.rental.dto.FilmResponseDto;
import ar.edu.ucc.arqSoftII.rental.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/film")
public class FilmController {
    @Autowired
    private FilmService filmService;
    @RequestMapping(method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)

    public @ResponseBody List<FilmResponseDto> getAllFilms()
    {
        return filmService.getAllFilms();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody FilmResponseDto lookupStateById(@PathVariable("id") Long id)
    {
        return filmService.getFilmById(id);
    }

    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody FilmResponseDto saveFilm(@RequestBody FilmRequestDto request)
    {
        return filmService.insertFilm(request);
    }
}
