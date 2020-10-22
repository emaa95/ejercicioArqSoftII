package ar.edu.ucc.arqSoftII.rental.dao;

import ar.edu.ucc.arqSoftII.common.dao.GenericDao;
import ar.edu.ucc.arqSoftII.rental.model.Rental;

import java.util.Date;
import java.util.List;

public interface RentalDao extends GenericDao<Rental, Long> {
    public List<Rental> findByRentalDate(Date rentalDate);
}
