package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Model")
class PersonTest {
	
	Person person=new Person((long)56,"joe","poe");

	@Test
	void groupedAssertions() {
		assertAll("test props set",
				()->assertEquals("joe",person.getFirstName()),
				()->assertEquals("poe",person.getLastName())
				);
	}
	
	@Test
	void groupedAssertionsMsgs() {
		assertAll("test props set",
				()->assertEquals("joe",person.getFirstName(),"first name failed"),
				()->assertEquals("poe",person.getLastName(),"last name failed")
				);
	}

}
