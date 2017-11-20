package com.bstek.crm.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bstek.bdf3.dorado.jpa.annotation.Generator;
import com.bstek.bdf3.dorado.jpa.policy.impl.CreatedDatePolicy;
import com.bstek.bdf3.dorado.jpa.policy.impl.UpdatedDatePolicy;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * 客户表
 * @author Handy
 *
 */
@Entity
@Table(name = "BDF3_CRM_CUSTOMER")
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3781996936559874950L;

	@Id
	@Column(name = "ID", length = 32)
	@PropertyDef(label = "标识")
	private String id;
	
	@Column(name = "OWNER", length = 50)
	@PropertyDef(label = "所有者")
	private String owner;
	
	@Column(name = "GRADE", length = 50)
	@PropertyDef(label = "等级")
	private String grade;
	
	@Column(name = "WEBSITE", length = 50)
	@PropertyDef(label = "网站")
	private String website;
	
	@Column(name = "NAME", length = 50)
	@PropertyDef(label = "姓名")
	private String name;
	
	@Column(name = "ANNUALINCOME", length = 50)
	@PropertyDef(label = "年收入")
	private String annualIncome;
	
	@Column(name = "EMPNUMS", length = 50)
	@PropertyDef(label = "员工数")
	private Integer empNums;
	
	@Column(name = "PHONE", length = 50)
	@PropertyDef(label = "手机")
	private String phone;
	
	@Column(name = "INDUSTRY", length = 50)
	@PropertyDef(label = "行业")
	private String industry;
	
	@Column(name = "DESCRIPTION", length = 50)
	@PropertyDef(label = "描述")
	private String description;
	
	@Column(name = "COUNTRY", length = 50)
	@PropertyDef(label = "国家/地区")
	private String country;
	
	@Column(name = "PROVINCE", length = 50)
	@PropertyDef(label = "省/市")
	private String province;
	
	@Column(name = "CITY", length = 50)
	@PropertyDef(label = "城市")
	private String city;
	
	@Column(name = "STREET", length = 50)
	@PropertyDef(label = "街道")
	private String street;
	
	@Column(name = "ZIPCODE", length = 50)
	@PropertyDef(label = "邮编")
	private String zipcode;
	
	@Column(name = "BIRTH", length = 50)
	@PropertyDef(label = "生日")
	private Date birth;
	
	@Column(name = "CUSTOMERID", length = 50)
	@PropertyDef(label = "客户id")
	private String customerId;
	
	@Column(name = "CREATEBY", length = 50)
	@PropertyDef(label = "创建者")
	private String createBy;
	
	@Column(name = "EDITBY", length = 50)
	@PropertyDef(label = "修改者")
	private String editBy;
	
	@Column(name = "CREATETIME")
   	@PropertyDef(label = "创建时间")
    @Generator(policy = CreatedDatePolicy.class)
	private Date createTime;
	
	@Column(name = "EDITTIME")
   	@PropertyDef(label = "修改时间")
    @Generator(policy = UpdatedDatePolicy.class)
	private Date editTime;
	
	@Transient
	private List<Contacts> contacts;
	
	@Transient
	private List<CustomerRemark> customerRemark;
	
	@Transient
	private List<Transaction> transaction;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public Integer getEmpNums() {
		return empNums;
	}

	public void setEmpNums(Integer empNums) {
		this.empNums = empNums;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getEditBy() {
		return editBy;
	}

	public void setEditBy(String editBy) {
		this.editBy = editBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getEditTime() {
		return editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}

	public List<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}

	public List<CustomerRemark> getCustomerRemark() {
		return customerRemark;
	}

	public void setCustomerRemark(List<CustomerRemark> customerRemark) {
		this.customerRemark = customerRemark;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	
	
}
