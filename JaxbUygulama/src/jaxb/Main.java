package jaxb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) {

		//marshall();
		unMarshall();
	}
	
	private static void marshall() {
		
		Employee employee = new Employee(1,"Halil İbrahim","Muktar", new Department(22081993, "Java Core", "Jr.Java Developer", "Sovos Foriba"));
		
		List<Employee> list = new ArrayList<>();
		
		list.add(employee);
		
		Root wrapper = new Root();
		wrapper.setEmployees(list);
		
		File output = new File("src\\employee.xml");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(wrapper, output);
			
		}catch(JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void unMarshall() {
		
		Root employee = null;
		File file = new File("src\\employee.xml");
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			employee = (Root) unmarshaller.unmarshal(file);
			
		}catch(JAXBException e) {
			e.printStackTrace();
		}
		
	    System.out.println(employee);
	}
}
