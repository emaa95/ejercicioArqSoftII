package ar.edu.ucc.arqSoftII.rental.dao;

import ar.edu.ucc.arqSoftII.rental.model.Member;
import ar.edu.ucc.arqSoftII.common.dao.GenericDaoImp;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.plaf.metal.MetalMenuBarUI;
import java.util.List;


@Repository
public class MemberImpDao extends GenericDaoImp<Member, Long> implements ar.edu.ucc.arqSoftII.rental.dao.MemberDao{

	@Override
	public List<Member> findByName(String name) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Member> criteria = builder.createQuery(Member.class);
        Root<Member> entity = criteria.from(Member.class);

        criteria.select(entity).where(builder.equal(entity.get("name"), name));
        return em.createQuery(criteria).getResultList();
	}
}
