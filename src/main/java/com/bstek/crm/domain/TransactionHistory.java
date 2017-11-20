package com.bstek.crm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bstek.bdf3.dorado.jpa.annotation.Generator;
import com.bstek.bdf3.dorado.jpa.policy.impl.UpdatedDatePolicy;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * 交易历史实体类
 * @author Handy
 *
 */
@Entity
@Table(name = "BDF3_CRM_TRANSACTIONHISTORY")
public class TransactionHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6425644075874903495L;
	
	@Id
	@Column(name = "ID", length = 32)
	@PropertyDef(label = "标识")
	private String id;
	
	@Column(name = "STAGE", length = 50)
	@PropertyDef(label = "阶段")
	private String stage;
	
	@Column(name = "AMOUNTOFMONEY", length = 50)
	@PropertyDef(label = "金额")
	private String amountOfMoney;
	
	@Column(name = "EXPECTEDCLOSINGDATE", length = 50)
	@PropertyDef(label = "预计成交日期")
	private Date expectedClosingDate;
	
	@Column(name = "EDITBY", length = 50)
	@PropertyDef(label = "修改者")
	private String editBy;
	
	@Column(name = "EDITTIME")
   	@PropertyDef(label = "修改时间")
    @Generator(policy = UpdatedDatePolicy.class)
	private Date editTime;
	
	@Column(name = "TRANSACTIONID", length = 50)
	@PropertyDef(label = "交易id")
	private String transactionId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(String amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	public Date getExpectedClosingDate() {
		return expectedClosingDate;
	}

	public void setExpectedClosingDate(Date expectedClosingDate) {
		this.expectedClosingDate = expectedClosingDate;
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

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}
