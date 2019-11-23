package guru.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;


	
class OwnerSDJpaServiceTest {
	
	OwnerSDJpaService service;
	

	@BeforeEach
	void setUp() throws Exception {
		service=new OwnerSDJpaService(null,null,null);
	}

	@Test
	void testOwnerSDJpaService() {
		
	}

	@Disabled(value="disabled until properly implemented")
	@Test
	void testFindByLastName() {
		Owner owner=service.findByLastName("buck");
	}

	@Test
	void testFindAllByLastNameLike() {
		
	}

	@Test
	void testFindAll() {
		
	}

	@Test
	void testFindById() {
		
	}

	@Test
	void testSave() {
		
	}

	@Test
	void testDelete() {
		
	}

	@Test
	void testDeleteById() {
		
	}

}
