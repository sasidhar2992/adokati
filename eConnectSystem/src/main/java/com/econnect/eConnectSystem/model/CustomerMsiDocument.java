package com.econnect.eConnectSystem.model;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="customer_msi_doc")
public class CustomerMsiDocument implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CUST_DOC_ID")
	private int customerMsiDocumentId;
	
	@Column(name="MSI_DOC_NAME")
    private String customerMsiDocumentName;//MSI_DOC_NAME varchar(200) not null,
    

	@Column(name="MSI_DOC_TYPE")
    private String customerMsiDocumentType;//MSI_DOC_TYPE varchar(200) not null,
    
	@Column(name="MSI_DOC_PATH")
    private String customerMsiDocumentPath;//MSI_DOC_PATH varchar(500) not null,
    
    @ManyToOne
	@JoinColumn(name="customerId")
    private Customer customer;
    
	@Column(name="CREATED_DATE")
    //@JsonFormat(pattern = "YYYY-MM-DD")
    private Date createdDate; //CREATED_DATE datetime not null,
    
	@Column(name="UPDATED_DATE")
    //@JsonFormat(pattern = "YYYY-MM-DD")
    private Date updatedDate;//UPDATED_DATE datetime not null
    

	public int getCustomerMsiDocumentId() {
		return customerMsiDocumentId;
	}

	public void setCustomerMsiDocumentId(int customerMsiDocumentId) {
		this.customerMsiDocumentId = customerMsiDocumentId;
	}
	
	public String getCustomerMsiDocumentName() {
		return customerMsiDocumentName;
	}
	
	public void setCustomerMsiDocumentName(String customerMsiDocumentName) {
		this.customerMsiDocumentName = customerMsiDocumentName;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCustomerMsiDocumentType() {
		return customerMsiDocumentType;
	}

	public void setCustomerMsiDocumentType(String customerMsiDocumentType) {
		this.customerMsiDocumentType = customerMsiDocumentType;
	}
	
	public String getCustomerMsiDocumentPath() {
		return customerMsiDocumentPath;
	}

	public void setCustomerMsiDocumentPath(String customerMsiDocumentPath) {
		this.customerMsiDocumentPath = customerMsiDocumentPath;
	}
	
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
}
