package ar.ucc.edu.arqSoftII.dvdRental.dao;

import ar.ucc.edu.arqSoftII.common.dao.GenericDao;
import ar.ucc.edu.arqSoftII.dvdRental.model.Film;
import ar.ucc.edu.arqSoftII.dvdRental.model.Member;

import java.util.List;

public interface FilmDao extends GenericDao<Film, Long> {
    public List<Film> findByTittle(String tittle);
}
