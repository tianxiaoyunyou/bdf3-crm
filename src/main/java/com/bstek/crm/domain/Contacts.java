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
 * 联系人表
 * @author Handy
 *
 */

@Entity
@Table(name = "BDF3_CRM_CONTACTS")
public class Contacts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1974149027221932643L;
	
	@Id
	@Column(name = "ID", length = 32)
	@PropertyDef(label = "标识")
	private String id;
	
	@Column(name = "OWNER", length = 50)
	@PropertyDef(label = "所有者")
	private String owner;
	
	@Column(name = "SOURCE", length = 50)
	@PropertyDef(label = "来源")
	private String source;
	
	@Column(name = "APPELLATION", length = 50)
	@PropertyDef(label = "称呼")
	private String appellation;
	
	@Column(name = "FULLNAME", length = 50)
	@PropertyDef(label = "姓名")
	private String fullName;
	
	@Column(name = "EMAIL", length = 50)
	@PropertyDef(label = "电子邮件")
	private String email;
	
	@Column(name = "JOB", length = 50)
	@PropertyDef(label = "职位")
	private String job;
	
	@Column(name = "MPHONE", length = 50)
	@PropertyDef(label = "手机")
	private String mphone;
	
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
	
	@Column(name = "CONTACTSUMMARY", length = 50)
	@PropertyDef(label = "联系纪要")
	private String contactSummary;
	
	@Column(name = "CREATETIME")
   	@PropertyDef(label = "创建时间")
    @Generator(policy = CreatedDatePolicy.class)
	private Date createTime;
	
	@Column(name = "EDITTIME")
   	@PropertyDef(label = "修改时间")
    @Generator(policy = UpdatedDatePolicy.class)
	private Date editTime;
	
	@Column(name = "NEXTCONTACTTIME", length = 50)
	@PropertyDef(label = "下次联系时间")
	private Date nextContactTime;
	
	@Transient
	private List<Transaction> transaction;
	
	@Transient
	private List<ContactsRemark> contactsRemark;
	
	@Transient
	private List<ContactsActivityRelation> contactsActivityRelation;
	

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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
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

	public String getContactSummary() {
		return contactSummary;
	}

	public void setContactSummary(String contactSummary) {
		this.contactSummary = contactSummary;
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

	public Date getNextContactTime() {
		return nextContactTime;
	}

	public void setNextContactTime(Date nextContactTime) {
		this.nextContactTime = nextContactTime;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	public List<ContactsRemark> getContactsRemark() {
		return contactsRemark;
	}

	public void setContactsRemark(List<ContactsRemark> contactsRemark) {
		this.contactsRemark = contactsRemark;
	}

	public List<ContactsActivityRelation> getContactsActivityRelation() {
		return contactsActivityRelation;
	}

	public void setContactsActivityRelation(List<ContactsActivityRelation> contactsActivityRelation) {
		this.contactsActivityRelation = contactsActivityRelation;
	}

	
}
