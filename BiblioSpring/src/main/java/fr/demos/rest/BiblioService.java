package fr.demos.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ouvrages")
public class BiblioService {

	
	@GetMapping()
	@ResponseBody()
	public List<Ouvrage> getOuvrages() {
		List<Ouvrage> liste = new ArrayList<>();
		liste.add(new Ouvrage("Les misérables","Hugo",3));
		liste.add(new Ouvrage("La peste","Camus",1));
		return liste;
	}

	@PutMapping(value = "/{id}") 
	public void saveOuvrage(@RequestBody Ouvrage ouv, @PathVariable("id")  int id) {
			System.out.println(ouv);
	}
}
