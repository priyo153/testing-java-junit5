package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
@Tag("Controller")
public interface RepeatedPersonTestInterface {
	
	@BeforeEach
	default void beforeEach(TestInfo t,RepetitionInfo r) {
		System.out.println(t.getDisplayName()+" : "+"iteration"+r.getCurrentRepetition()+" of "+r.getTotalRepetitions());
	}

}
