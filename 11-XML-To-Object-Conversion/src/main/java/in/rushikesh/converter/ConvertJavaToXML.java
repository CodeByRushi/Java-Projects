package in.rushikesh.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.rushikesh.bindings.Address;
import in.rushikesh.bindings.Person;

public class ConvertJavaToXML {

	public static void main(String[] args) throws Exception {
		
		Person person = new Person(12,"Rushikesh", 46, new Address(123,78));
		
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = instance.createMarshaller();
		marshaller.marshal(person, new File("Person.xml"));
		System.out.println("Marshalling Completed.");
		
	}

}
