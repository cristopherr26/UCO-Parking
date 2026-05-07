package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerJpaEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@ManyToOne
	@JoinColumn(name = "idType")
	private IdTypeJpaEntity idType;
	
	@ManyToOne
	@JoinColumn(name = "organization")
	private OrganizationJpaEntity organization;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "middleName")
	private String middleName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "secondLastName")
	private String secondLastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "idNumber")
	private String idNumber;
	
	

	public CustomerJpaEntity(UUID id, IdTypeJpaEntity idType, OrganizationJpaEntity organization, String firstName,
			String middleName, String lastName, String secondLastName, String email, String phoneNumber,
			String idNumber) {
		super();
		setId(id);
		setIdType(idType);
		setOrganization(organization);
		setFirstName(firstName);
		setMiddleName(middleName);
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

	public IdTypeJpaEntity getIdType() {
		return idType;
	}

	private void setIdType(IdTypeJpaEntity idType) {
		this.idType = idType;
	}

	public OrganizationJpaEntity getOrganization() {
		return organization;
	}

	private void setOrganization(OrganizationJpaEntity organization) {
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
