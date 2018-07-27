package listener.utilities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "registartionData")
public class RegData {
	private List<Data> regdata;

	@XmlElement(name="data")
	public void setRegdata(List<Data> regdata) {
		this.regdata = regdata;
	}
	

	public List<Data> getRegdata() {
		return regdata;
	}

}
