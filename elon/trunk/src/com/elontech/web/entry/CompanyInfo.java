package com.elontech.web.entry;

import com.elontech.web.vo.SimpleMessage;

public class CompanyInfo {
	private SimpleMessage companyName = null;
	private SimpleMessage owner = null;
	private SimpleMessage foundationDate = null;
	private SimpleMessage category = null;
	private SimpleMessage address = null;
	private SimpleMessage companyId = null;
	private SimpleMessage telephon = null;
	private SimpleMessage fax = null;
	public SimpleMessage getCompanyName() {
		return companyName;
	}
	public void setCompanyName(SimpleMessage companyName) {
		this.companyName = companyName;
	}
	public SimpleMessage getOwner() {
		return owner;
	}
	public void setOwner(SimpleMessage owner) {
		this.owner = owner;
	}
	public SimpleMessage getFoundationDate() {
		return foundationDate;
	}
	public void setFoundationDate(SimpleMessage foundationDate) {
		this.foundationDate = foundationDate;
	}
	public SimpleMessage getCategory() {
		return category;
	}
	public void setCategory(SimpleMessage category) {
		this.category = category;
	}
	public SimpleMessage getAddress() {
		return address;
	}
	public void setAddress(SimpleMessage address) {
		this.address = address;
	}
	
	public SimpleMessage getCompanyId() {
		return companyId;
	}
	public void setCompanyId(SimpleMessage companyId) {
		this.companyId = companyId;
	}
	
	public SimpleMessage getTelephon() {
		return telephon;
	}
	public void setTelephon(SimpleMessage telephon) {
		this.telephon = telephon;
	}
	public SimpleMessage getFax() {
		return fax;
	}
	public void setFax(SimpleMessage fax) {
		this.fax = fax;
	}
	@Override
	public String toString() {
		return "CompanyInfo [companyName=" + companyName + ", owner=" + owner + ", foundationDate=" + foundationDate
				+ ", category=" + category + ", address=" + address + ", companyId=" + companyId + ", telephon="
				+ telephon + ", fax=" + fax + "]";
	}

}
