package attackforce.shareplan.domain;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 5658716793957904104L;
    private int id;
    private String name;
    private String tellPhone;
    private String emailAdress;
    
    public Person() {
    }

	public Person(String name, String tellPhone, String emailAdress) {
		super();
		this.name = name;
		this.tellPhone = tellPhone;
		this.emailAdress = emailAdress;
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", tellPhone=" + tellPhone + ", emailAdress=" + emailAdress
				+ "]";
	}
    
}
