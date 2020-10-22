package ar.edu.ucc.arqSoftII.rental.dao;

import ar.edu.ucc.arqSoftII.common.dao.GenericDaoImp;
import ar.edu.ucc.arqSoftII.rental.model.Film;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class FilmImpDao extends GenericDaoImp<Film, Long> implements ar.edu.ucc.arqSoftII.rental.dao.FilmDao {
    @Override
    public List<Film> findByTittle(String tittle) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Film> criteria = builder.createQuery(Film.class);
        Root<Film> entity = criteria.from(Film.class);

        criteria.select(entity).where(builder.equal(entity.get("tittle"), tittle));
        return em.createQuery(criteria).getResultList();
    }
}
