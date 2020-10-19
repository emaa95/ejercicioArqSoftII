package ar.ucc.edu.arqSoftII.dvdRental.dao;

import ar.ucc.edu.arqSoftII.common.dao.GenericDao;
import ar.ucc.edu.arqSoftII.dvdRental.model.Film;
import ar.ucc.edu.arqSoftII.dvdRental.model.Rental;

import java.util.Date;
import java.util.List;

public interface RentalDao extends GenericDao<Rental, Long> {
    public List<Rental> findByRentalDate(Date rentalDate);
}
