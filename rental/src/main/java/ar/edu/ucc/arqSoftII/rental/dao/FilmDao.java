package ar.edu.ucc.arqSoftII.rental.dao;

import ar.edu.ucc.arqSoftII.common.dao.GenericDao;
import ar.edu.ucc.arqSoftII.rental.model.Film;
import java.util.List;

public interface FilmDao extends GenericDao<Film, Long> {
    public List<Film> findByTittle(String tittle);
}
