package ar.ucc.edu.arqSoftII.dvdRental.dao;

import ar.ucc.edu.arqSoftII.dvdRental.model.Member;
import ar.ucc.edu.arqSoftII.common.dao.GenericDao;

import java.util.List;


public interface MemberDao extends GenericDao<Member, Long> {
    
    public List<Member> findByName(String name);
}
