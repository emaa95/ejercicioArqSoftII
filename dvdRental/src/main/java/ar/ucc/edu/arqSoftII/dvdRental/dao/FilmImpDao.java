package ar.ucc.edu.arqSoftII.dvdRental.dao;

import ar.ucc.edu.arqSoftII.common.dao.GenericDaoImp;
import ar.ucc.edu.arqSoftII.dvdRental.model.Film;
import ar.ucc.edu.arqSoftII.dvdRental.model.Film;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class FilmImpDao extends GenericDaoImp<Film, Long> implements ar.ucc.edu.arqSoftII.dvdRental.dao.FilmDao {
    @Override
    public List<Film> findByTittle(String tittle) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Film> criteria = builder.createQuery(Film.class);
        Root<Film> entity = criteria.from(Film.class);

        criteria.select(entity).where(builder.equal(entity.get("tittle"), tittle));
        return em.createQuery(criteria).getResultList();
    }
}
