package ar.edu.ucc.arqSoftII.rental.dao;

import ar.edu.ucc.arqSoftII.rental.model.*;
import ar.edu.ucc.arqSoftII.common.dao.GenericDao;

import java.util.List;


public interface MemberDao extends GenericDao<Member, Long> {
    
    public List<Member> findByName(String name);
}
