package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Customer implements IEntity{
	private int id;
	private String name;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	
    public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalIdentity) {
        super();
        this.id = id;
        this.name = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalIdentity;
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

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
}
