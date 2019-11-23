package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("Model")
class OwnerTest {

	@Test
	void dependentAssertions() {
		Owner owner=new Owner((long)2,"john","smith");
		owner.setCity("haiti");
		owner.setTelephone("54642245");
		
		assertAll("properties test",
				()->assertAll(
						"person properties",
						()->assertEquals("john",owner.getFirstName(),"firstname didnt match"),
						()->assertEquals("smith",owner.getLastName(),"last name didnt match")
					),
				()->assertAll(
						"owner properties",
						()->assertEquals("haiti",owner.getCity(),"city didnt match"),
						()->assertEquals("54642245",owner.getTelephone(),"phone no didnt match")
						
					)
				
				);
		
	}

}
