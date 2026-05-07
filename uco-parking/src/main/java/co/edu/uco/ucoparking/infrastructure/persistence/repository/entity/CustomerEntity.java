package co.edu.uco.ucoparking.infrastructure.persistence.repository.entity;

import java.util.UUID;

public class CustomerEntity {
	

	private UUID id;
	
	private IdTypeEntity idType;
	
	private OrganizationEntity organization;

	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String secondLastName;
	
	private String email;
	
	private String phoneNumber;
	
	private String idNumber;


	public CustomerEntity(UUID id, IdTypeEntity idType, OrganizationEntity organization, String firstName,
			String middleName, String lastName, String secondLastName, String email, String phoneNumber,
			String idNumber) {
		super();
		setId(id);
		setIdType(idType);
		setOrganization(organization);
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setLastName(secondLastName);
		setSecondLastName(secondLastName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
		setIdNumber(idNumber);
	}

	public UUID getId() {
		return id;
	}

	private void setId(UUID id) {
		this.id = id;
	}

	public IdTypeEntity getIdType() {
		return idType;
	}

	private void setIdType(IdTypeEntity idType) {
		this.idType = idType;
	}

	public OrganizationEntity getOrganization() {
		return organization;
	}

	private void setOrganization(OrganizationEntity organization) {
		this.organization = organization;
	}

	public String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	private void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	private void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	private void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	

}

