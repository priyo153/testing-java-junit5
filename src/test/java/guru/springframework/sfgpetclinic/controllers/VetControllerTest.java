package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.fauxspringTest.DemoModel;
import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;


class VetControllerTest implements IndexControllerTestInterface{
	
	VetController vet;
	Model model;
	
	@DisplayName("test listVets method")
	@Test
	void testListVets() {
		
		VetController vet=new VetController(new VetMapService(new SpecialityMapService()));
		Model model=new DemoModel();
		
		assertEquals("vets/index",vet.listVets(model));
	}
	
	@DisplayName("verify if values properly added")
	@Test
	void testSaveVet() {
		Speciality s1=new Speciality();
		Speciality s2=new Speciality();
		Set<Speciality> s= new HashSet<>();
		s.add(s1);
		s.add(s2);
		
		Vet v1=new Vet(1L,"john","doe",s);
		Vet v2=new Vet(2L,"billy","bob",s);
		
		VetMapService v=new VetMapService(new SpecialityMapService());
		v.save(v1);
		v.save(v2);
		
		vet=new VetController(v);
		DemoModel m=new DemoModel();
		vet.listVets(m);
		
		Set<Vet> vets=new HashSet<>();
		vets.add(v1);
		vets.add(v2);
		
		assertEquals(vets,m.getAttributes().get("vets"));
		

		
	}



}
