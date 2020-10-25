package ar.edu.ucc.arqSoftII.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.arqSoftII.rental.dto.RentalRequestDto;
import ar.edu.ucc.arqSoftII.rental.dto.RentalResponseDto;
import ar.edu.ucc.arqSoftII.rental.service.RentalService;

@Controller
@RequestMapping("/rental")
public class RentalController {

	@Autowired
	private RentalService rentalService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody RentalResponseDto registrar(@RequestBody RentalRequestDto request) {
		return rentalService.registerRental(request);
	}
}