package in.rushikesh.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import in.rushikesh.bindings.Person;

public class ConvertXMLToJava {
 
	public static void main(String[] args) throws Exception {
		
		File xmlFile = new File("Person.xml");
		
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = instance.createUnmarshaller();
		Object object = unmarshaller.unmarshal(xmlFile);
		Person person = (Person) object;
		System.out.println(person);
	}
}
