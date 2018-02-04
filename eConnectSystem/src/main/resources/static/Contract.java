package com.econnect.eConnectSystem.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name="contract_details")
public class Contract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contractId;//CONTRACT_ID int primary key auto_increment,
    private String consultantFirstName;//CONSUL_FIRST_NAME varchar(200) not null,
    private String consultantMiddleName;//CONSUL_MIDDLE_NAME varchar(200),
    private String consultantLastName;//CONSUL_LAST_NAME varchar(200) not null,
	private LocalDate contractStartDate;//CONT_START_DATE date not null,
    private LocalDate contractEndDate;//CONT_END_DATE date not null,
    private String contractType;//CONTRACT_TYPE varchar(200) not null,
    private double billingRate; //BILL_RATE double not null,
    private String billingCurrency;//BILL_CURR varchar(200) not null,
    private String netPaymentTerm;//NET_PAY_TERM varchar(200) not null,
    private String endClientName;//END_CLIENT_NAME varchar(200) not null,
    private String apartmentorSuiteNumber;
	private String streetAddress; //varchar(500),
    private String city;//CITY varchar(200) not null,
    private int zipCode;//ZIP_CODE int not null,
    private String state; //STATE varchar(200) not null,
    private String country;//COUNTRY varchar(200) not null,
    
    private Customer customer;
    
    private Set<ContractPoDocument> contractPoDocument;
    
    private LocalDate createdDate;// CREATED_DATE datetime not null,
    private LocalDate updatedDate;//UPDATED_DATE datetime not null,
	
    
    
    public Contract() {
		super();
	}
    
    @Column (name="CONTRACT_ID")
	public int getContractId() {
		return contractId;
	}
	public void setContractId(int contractId) {
		this.contractId = contractId;
	}
	
	@Column (name="CONSUL_FIRST_NAME")
	public String getConsultantFirstName() {
		return consultantFirstName;
	}

	public void setConsultantFirstName(String consultantFirstName) {
		this.consultantFirstName = consultantFirstName;
	}
	
	@Column (name="CONSUL_MIDDLE_NAME")
	public String getConsultantMiddleName() {
		return consultantMiddleName;
	}

	public void setConsultantMiddleName(String consultantMiddleName) {
		this.consultantMiddleName = consultantMiddleName;
	}
	
	@Column (name="CONSUL_LAST_NAME")
	public String getConsultantLastName() {
		return consultantLastName;
	}

	public void setConsultantLastName(String consultantLastName) {
		this.consultantLastName = consultantLastName;
	}
	
	@OneToMany(mappedBy="contract")
	public Set<ContractPoDocument> getContractPoDocument() {
		return contractPoDocument;
	}

	public void setContractPoDocument(Set<ContractPoDocument> contractPoDocument) {
		this.contractPoDocument = contractPoDocument;
	}

	@Column(name="CONT_START_DATE")
	public LocalDate getContractStartDate() {
		return contractStartDate;
	}
	public void setContractStartDate(LocalDate contractStartDate) {
		this.contractStartDate = contractStartDate;
	}
	
	@Column(name="CONT_END_DATE")
	public LocalDate getContractEndDate() {
		return contractEndDate;
	}
	public void setContractEndDate(LocalDate contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	
	@Column(name="CONTRACT_TYPE")
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	
	@Column(name="BILL_RATE")
	public double getBillingRate() {
		return billingRate;
	}
	public void setBillingRate(double billingRate) {
		this.billingRate = billingRate;
	}
	
	@Column(name="BILL_CURR")
	public String getBillingCurrency() {
		return billingCurrency;
	}
	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}
	
	@Column(name="NET_PAY_TERM")
	public String getNetPaymentTerm() {
		return netPaymentTerm;
	}
	public void setNetPaymentTerm(String netPaymentTerm) {
		this.netPaymentTerm = netPaymentTerm;
	}
	
	@Column(name="END_CLIENT_NAME")
	public String getEndClientName() {
		return endClientName;
	}
	public void setEndClientName(String endClientName) {
		this.endClientName = endClientName;
	}
	
	@Column(name="END_CLIENT_APARTMENT_SUITE_ADDRESS")
	public String getApartmentorSuiteNumber() {
		return apartmentorSuiteNumber;
	}
	public void setApartmentorSuiteNumber(String apartmentorSuiteNumber) {
		this.apartmentorSuiteNumber = apartmentorSuiteNumber;
	}
	
	@Column(name="END_CLIENT_STREET_ADDRESS")
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	@Column(name="END_CLIENT_CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name="END_CLIENT_ZIP_CODE")
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	@Column(name="END_CLIENT_STATE")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Column(name="END_CLIENT_COUNTRY")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID")
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Column(name="CREATED_DATE")
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	@Column(name="UPDATED_DATE")
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
    
    
    
}
