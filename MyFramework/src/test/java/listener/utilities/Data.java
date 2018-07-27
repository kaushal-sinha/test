package listener.utilities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "data")
public class Data {
	private String firstName;
	private String lastName;

	
	public String getFirstName() {
		return firstName;
	}


	@XmlElement(name = "FirstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	@XmlElement(name = "LastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




}
