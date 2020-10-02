package com.boot.dev.ops.test.TestApl.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dev.ops.test.TestApl.model.Shipwreck;
import com.boot.dev.ops.test.TestApl.repository.ShipwreckRepository;

@RestController
@RequestMapping("api/v1")
public class ShipwreckController {
	
	@Autowired 
	ShipwreckRepository shipwreckRepository;
	
	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list(){
		return shipwreckRepository.findAll();
	}

	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck){
		return shipwreckRepository.saveAndFlush(shipwreck);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable long id){
		return shipwreckRepository.getShipwreckById(id);
	}

		/*@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable long id ,@RequestBody Shipwreck shipwreck){
			Shipwreck existingBook = shipwreckRepository.getShipwreckById(id);
		BeanUtils.copyProperties(shipwreck, existingBook);
		return shipwreckRepository.saveAndFlush(shipwreck);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable long id){
		Shipwreck existingBook = shipwreckRepository.getShipwreckById(id);
		shipwreckRepository.delete(existingBook);
		return existingBook;
	}*/


}
