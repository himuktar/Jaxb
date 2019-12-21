package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) {

		marshall();
		//unMarshall();
	}
	
	private static void marshall() {
		
		Employee employee = new Employee(1,"Halil İbrahim","MUKTAR", new Department(22081993, "Java Core", "Jr.Java Developer", "Sovos Foriba"));
		
		File output = new File("src/employee.xml");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(employee, output);
			
		}catch(JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void unMarshall() {
		
		Root rootObject = null;
		File file = new File("src\\employee.xml");
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			rootObject = (Root) unmarshaller.unmarshal(file);
			
		}catch(JAXBException e) {
			e.printStackTrace();
		}
		
	    System.out.println(rootObject);
	}
}
