package com.econnect.eConnectSystem.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "customer_details")
public class Customer implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private Integer customerId; //int primary key auto_increment,

	@Column(name="CUSTOMER_NAME")
	private String customerName;//CUSTOMER_NAME varchar(250) not null,
	
	@Column(name="APARTMENT_SUITE_ADDR1")
	private String apartmentorSuiteNumber;
	
	@Column(name="STREET_ADDRESS")
	private String streetAddress; //varchar(500),

	@Column(name="CITY")
	private String city; //varchar(100) not null,
	
	@Column(name="ZIP_CODE")
	private int zipCode; //int not null,
    
	@Column(name="STATE")
    private String state; //varchar(100) not null,
    

	@Column(name="COUNTRY")
    private String country; //varchar(100) not null,
    

	@Column(name="CONTACT_NO")
    private String contactNumber; //varchar(20) not null,
    

	@Column(name="EMAIL_ID")
    private String emailId; //varchar(100) not null,
    
    @OneToMany(mappedBy="customer")
    private Set<CustomerMsiDocument> customerMsiDocument;
    

	@Column(name="CREATED_DATE")
    //@JsonFormat(pattern = "YYYY-MM-DD")
    private Date createdDate; //datetime not null,
    
	@Column(name="UPDATED_DATE")
    //@JsonFormat(pattern = "YYYY-MM-DD")
    private Date updatedDate; //datetime not null,

	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getApartmentorSuiteNumber() {
		return apartmentorSuiteNumber;
	}

	public void setApartmentorSuiteNumber(String apartmentorSuiteNumber) {
		this.apartmentorSuiteNumber = apartmentorSuiteNumber;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}   
    
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	/*@OneToMany(mappedBy = "customer")
	public Set<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(Set<Contract> contracts) {
		this.contracts = contracts;
	}
*/
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
    
    public Set<CustomerMsiDocument> getCustomerMsiDocument() {
		return customerMsiDocument;
	}

	public void setCustomerMsiDocument(Set<CustomerMsiDocument> customerMsiDocument) {
		this.customerMsiDocument = customerMsiDocument;
	}
}