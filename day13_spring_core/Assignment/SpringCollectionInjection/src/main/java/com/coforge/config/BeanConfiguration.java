package com.coforge.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Address;
import com.coforge.model.Student;

@Configuration
public class BeanConfiguration {
	@Bean(name="student")
	public Student getstudent() {
		Student student = new Student();
		student.setsId(251);
		student.setsName("Trevor");
		student.setAddress(getaddress());
		student.setSubjects(Arrays.asList("DAA","DBMS","WT","URDU"));
		Set<String> set = new HashSet(Arrays.asList("Angular","Node","Springboot","BLAHBLAH"));
		student.setSkills(set);
		Map<String,Integer> map= new HashMap<String,Integer>();
		map.put("DAA", 98);
		map.put("DBMS", 91);
		map.put("WT", 67);
		map.put("URDU", 45);
		student.setMarks(map);
		return student;
	}
	
	
	
	@Bean(name = "address")
	public Address getaddress() {
		Address address = new Address();
		address.setCity("Vice City");
		address.setState("San Andreas");
		return address;
	}
}
