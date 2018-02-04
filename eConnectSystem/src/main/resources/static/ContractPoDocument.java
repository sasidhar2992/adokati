package com.econnect.eConnectSystem.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contract_po_doc")
public class ContractPoDocument {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contractDocumentId;//CONT_DOC_ID int primary key auto_increment,
    private String contractDocumentName;//PO_DOC_NAME varchar(200) not null,
    private String contractDocumentType;//PO_DOC_TYPE varchar(200) not null,
    private String contractDocumentPath;//PO_DOC_PATH varchar(500) not null,
   
    private Contract contract;
    
    private LocalDate createdDate; //CREATED_DATE datetime not null,
    private LocalDate updatedDate;//UPDATED_DATE datetime not null
    
    
	public ContractPoDocument() {
		super();
	}
	
	@ManyToOne
	@JoinColumn(name="CONTRACT_ID")
	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	@Column(name="CONT_DOC_ID")
	public int getContractDocumentId() {
		return contractDocumentId;
	}
	public void setContractDocumentId(int contractDocumentId) {
		this.contractDocumentId = contractDocumentId;
	}
	
	@Column(name="PO_DOC_NAME")
	public String getContractDocumentName() {
		return contractDocumentName;
	}
	public void setContractDocumentName(String contractDocumentName) {
		this.contractDocumentName = contractDocumentName;
	}
	
	@Column(name="PO_DOC_TYPE")
	public String getContractDocumentType() {
		return contractDocumentType;
	}
	public void setContractDocumentType(String contractDocumentType) {
		this.contractDocumentType = contractDocumentType;
	}
	
	@Column(name="PO_DOC_PATH")
	public String getContractDocumentPath() {
		return contractDocumentPath;
	}
	public void setContractDocumentPath(String contractDocumentPath) {
		this.contractDocumentPath = contractDocumentPath;
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
