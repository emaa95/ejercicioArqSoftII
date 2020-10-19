package ar.ucc.edu.arqSoftII.dvdRental.dao;

import ar.ucc.edu.arqSoftII.common.dao.GenericDaoImp;
import ar.ucc.edu.arqSoftII.dvdRental.model.Rental;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

@Repository
public class RentalImpDao extends GenericDaoImp<Rental, Long> implements ar.ucc.edu.arqSoftII.dvdRental.dao.RentalDao{

    @Override
    public List<Rental> findByRentalDate(Date rentalDate) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Rental> criteria = builder.createQuery(Rental.class);
        Root<Rental> entity = criteria.from(Rental.class);

        criteria.select(entity).where(builder.equal(entity.get("rentalDate"), rentalDate));
        return em.createQuery(criteria).getResultList();
    }
}
