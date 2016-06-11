package attackforce.shareplan.domain.vo;

import java.io.Serializable;

public class PersonVO implements Serializable {
    private static final long serialVersionUID = 5658716793957904104L;
    private int id;
    private String name;
    private String tellPhone;
    private String emailAdress;
    
    public PersonVO() {
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTellphone() {
		return tellPhone;
	}

	public void setTellphone(String tellphone) {
		this.tellPhone = tellphone;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
