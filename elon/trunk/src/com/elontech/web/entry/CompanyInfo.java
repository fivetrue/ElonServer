package com.elontech.web.entry;

import com.fivetrue.db.DatabaseObject;
import com.fivetrue.db.annotation.DisplayName;

public class CompanyInfo extends DatabaseObject{
	
	@DisplayName("법인명")
	private String companyName = null;
	@DisplayName("대표자")
	private String owner = null;
	@DisplayName("설립일")
	private String foundationDate = null;
	@DisplayName("사업분야")
	private String category = null;
	@DisplayName("사업장")
	private String address = null;
	@DisplayName("등록번호")
	private String companyId = null;
	@DisplayName("Tel.")
	private String telephon = null;
	@DisplayName("Fax.")
	private String fax = null;
	
	
	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getFoundationDate() {
		return foundationDate;
	}


	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCompanyId() {
		return companyId;
	}


	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}


	public String getTelephon() {
		return telephon;
	}


	public void setTelephon(String telephon) {
		this.telephon = telephon;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}
	

	@Override
	public String toString() {
		return "CompanyInfo [companyName=" + companyName + ", owner=" + owner + ", foundationDate=" + foundationDate
				+ ", category=" + category + ", address=" + address + ", companyId=" + companyId + ", telephon="
				+ telephon + ", fax=" + fax + "]";
	}

}
