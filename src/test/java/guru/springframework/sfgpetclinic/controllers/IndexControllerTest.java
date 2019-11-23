package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import guru.springframework.sfgpetclinic.model.OwnerType;


class IndexControllerTest implements IndexControllerTestInterface {
	
	IndexController controller;
	@BeforeEach
	void setUp() throws Exception {
		
		controller=new IndexController();
	}
	
	@DisplayName("validate Index Output")
	@Test
	void testIndex() {
		assertEquals("index",controller.index());
		assertTrue("index".equals(controller.index()),"validation failed");
	}
	
	
	@DisplayName("Testing valueNotFoundException")
	@Test
	void testOupsHandler() {
		
		assertThrows(ValueNotFoundException.class,()->{
			controller.oupsHandler();
		},"exception not thrown");
		//assertEquals("notimplemented",controller.oupsHandler());
	}
	@Disabled
	@Test
	void testTimeout() {
		assertTimeout(Duration.ofMillis(100),()->{Thread.sleep(5000);},"action took too long");
		System.out.println("final statement 1");
	}
	
	@Disabled
	@Test
	void testTimeoutPrempt() {
		assertTimeoutPreemptively(Duration.ofMillis(100),()->{
			Thread.sleep(5000);
			System.out.println("final statement 2");
		}
		
		,"action took too long");
		
	}
	
	@DisplayName("Testing if assumption not true")
	@Test
	void testAssumption() {
		assumeTrue("guru".equalsIgnoreCase("gurulahima"));
	}
	
	@DisplayName("Testing if assumption true")
	@Test
	void testAssumptionTrue() {
		assumeTrue("guru".equalsIgnoreCase("guru"));
		
	}
	
	@Disabled
	@EnabledOnOs(OS.WINDOWS)
	@RepeatedTest(10)
	void testOnWindows(TestInfo testinfo,RepetitionInfo repetitioninfo) {
		System.out.println(testinfo.getDisplayName()+" : "+repetitioninfo.getCurrentRepetition()+" of "+repetitioninfo.getTotalRepetitions());
		
		
		
	}
	
	@EnabledOnOs(OS.MAC)
	@Test
	void testOnMac() {
		
	}
	
	@RepeatedTest(value= 5, name= "{displayName} : iteration {currentRepettion} of {totalRepetitions}")
	@DisplayName("repeated test for person")
	void personTest() {
		
	}
	
	@ParameterizedTest(name= "{displayName} ( {arguments} )")
	@ValueSource(strings= {"java","junit","testing"})
	@DisplayName("Use parameters")
	void testValueSource(String val) {
		
		System.out.println(val);
		
	}
	
	@ParameterizedTest(name="{displayName} ({arguments})")
	@EnumSource(OwnerType.class)
	@DisplayName("Enum Test for owner type")
	void testEnumType(OwnerType ownerType) {
		System.out.println(ownerType);
	}
	
	@DisplayName("just for example")
	@Test
	void simpleTest() {
		
	}

}
