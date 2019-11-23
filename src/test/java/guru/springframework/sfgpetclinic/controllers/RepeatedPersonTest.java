package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedPersonTest implements RepeatedPersonTestInterface {


	@RepeatedTest(value= 5, name= "{displayName} : iteration {currentRepetition} of {totalRepetitions}")
	@DisplayName("repeated test for person exercise")
	void personTest() {
		
	}

}