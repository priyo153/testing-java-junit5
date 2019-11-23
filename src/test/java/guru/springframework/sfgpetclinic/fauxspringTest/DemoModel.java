package guru.springframework.sfgpetclinic.fauxspringTest;

import java.util.HashMap;
import java.util.Map;

import guru.springframework.sfgpetclinic.fauxspring.Model;

public class DemoModel implements Model{

	public Map<String,Object> attributes=new HashMap<>(); 
	public void addAttribute(String key, Object o) {
		attributes.put(key, o);
		
	}

	@Override
	public void addAttribute(Object o) {
		attributes.put(null, o);
		
	}

	public Map getAttributes() {
		return attributes;
	}
	
	
	
}