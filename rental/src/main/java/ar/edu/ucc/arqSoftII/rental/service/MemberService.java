package ar.edu.ucc.arqSoftII.rental.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoftII.common.dto.ModelDtoConverter;
import ar.edu.ucc.arqSoftII.rental.dao.FilmDao;
import ar.edu.ucc.arqSoftII.rental.dao.MemberDao;
import ar.edu.ucc.arqSoftII.rental.dto.FilmRequestDto;
import ar.edu.ucc.arqSoftII.rental.dto.FilmResponseDto;
import ar.edu.ucc.arqSoftII.rental.dto.MemberRequestDto;
import ar.edu.ucc.arqSoftII.rental.dto.MemberResponseDto;
import ar.edu.ucc.arqSoftII.rental.model.Film;
import ar.edu.ucc.arqSoftII.rental.model.Member;
import ar.edu.ucc.arqSoftII.rental.model.Rental;

@Service
@Transactional
public class MemberService {
	@Autowired
    private MemberDao memberDao;

    public MemberResponseDto getStateById(Long id) {
        Member member = memberDao.load(id);

        MemberResponseDto response = (MemberResponseDto) new ModelDtoConverter().convertToDto(member, new MemberResponseDto());
        return response;
    }

    public List<MemberResponseDto> getAllMembers() {
        List<Member> members = memberDao.getAll();

        List<MemberResponseDto> response = new ArrayList<MemberResponseDto>();

        for (Member member : members) {
            response.add((MemberResponseDto) new ModelDtoConverter().convertToDto(member, new MemberResponseDto()));
        }

        return response;
    }

    public MemberResponseDto registerMember (MemberRequestDto dto) {
		
		Member member = new Member();
		
		memberDao.insert(member);
		
		MemberResponseDto response = new MemberResponseDto();

        response.setName(member.getName());
        response.setLastName(member.getLastName());
        response.setDni(member.getDni());
        response.setEmail(member.getEmail());

        return response;
		
		
	}
}
