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
 * 交易表
 * @author Handy
 *
 */
@Entity
@Table(name = "BDF3_CRM_TRANSACTION")
public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4702070987984322741L;

	@Id
	@Column(name = "ID", length = 32)
	@PropertyDef(label = "标识")
	private String id;
	
	@Column(name = "OWNER", length = 50)
	@PropertyDef(label = "所有者")
	private String owner;
	
	@Column(name = "AMOUNTOFMONEY", length = 50)
	@PropertyDef(label = "金额")
	private String amountOfMoney;
	
	@Column(name = "NAME", length = 50)
	@PropertyDef(label = "名称")
	private String name;
	
	@Column(name = "EXPECTEDCLOSINGDATE", length = 50)
	@PropertyDef(label = "预计成交日期")
	private Date expectedClosingDate;
	
	@Column(name = "CUSTOMERID", length = 50)
	@PropertyDef(label = "客户id")
	private String customerId;
	
	@Column(name = "STAGE", length = 50)
	@PropertyDef(label = "阶段")
	private String stage;
	
	@Column(name = "TYPE", length = 50)
	@PropertyDef(label = "类型")
	private String type;
	
	@Column(name = "SOURCE", length = 50)
	@PropertyDef(label = "来源")
	private String source;
	
	@Column(name = "ACTIVITYID", length = 50)
	@PropertyDef(label = "市场活动id")
	private String activityId;
	
	@Column(name = "CONTACTSID", length = 50)
	@PropertyDef(label = "联系人id")
	private String contactsId;
	
	@Column(name = "DESCRIPTION", length = 50)
	@PropertyDef(label = "描述")
	private String description;
	
	@Column(name = "CREATEBY", length = 50)
	@PropertyDef(label = "创建者")
	private String createBy;
	
	@Column(name = "CREATETIME")
   	@PropertyDef(label = "创建时间")
    @Generator(policy = CreatedDatePolicy.class)
	private Date createTime;
	
	@Column(name = "EDITBY", length = 50)
	@PropertyDef(label = "修改者")
	private String editBy;
	
	@Column(name = "EDITTIME")
   	@PropertyDef(label = "修改时间")
    @Generator(policy = UpdatedDatePolicy.class)
	private Date editTime;
	
	@Column(name = "CONTACTSUMMARY", length = 50)
	@PropertyDef(label = "联系纪要")
	private String contactSummary;
	
	@Column(name = "NEXTCONTACTTIME", length = 50)
	@PropertyDef(label = "下次联系时间")
	private Date nextContactTime;
	
	@Transient
	private List<TransactionRemark> transactionRemark;
	
	@Transient
	private List<TransactionHistory> transactionHistory;

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

	public String getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(String amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getExpectedClosingDate() {
		return expectedClosingDate;
	}

	public void setExpectedClosingDate(Date expectedClosingDate) {
		this.expectedClosingDate = expectedClosingDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getContactsId() {
		return contactsId;
	}

	public void setContactsId(String contactsId) {
		this.contactsId = contactsId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEditBy() {
		return editBy;
	}

	public void setEditBy(String editBy) {
		this.editBy = editBy;
	}

	public Date getEditTime() {
		return editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}

	public String getContactSummary() {
		return contactSummary;
	}

	public void setContactSummary(String contactSummary) {
		this.contactSummary = contactSummary;
	}

	public Date getNextContactTime() {
		return nextContactTime;
	}

	public void setNextContactTime(Date nextContactTime) {
		this.nextContactTime = nextContactTime;
	}

	public List<TransactionRemark> getTransactionRemark() {
		return transactionRemark;
	}

	public void setTransactionRemark(List<TransactionRemark> transactionRemark) {
		this.transactionRemark = transactionRemark;
	}

	public List<TransactionHistory> getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(List<TransactionHistory> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	
	
	
}

