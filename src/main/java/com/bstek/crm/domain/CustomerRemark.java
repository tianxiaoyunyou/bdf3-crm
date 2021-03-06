package com.bstek.crm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bstek.bdf3.dorado.jpa.annotation.Generator;
import com.bstek.bdf3.dorado.jpa.policy.impl.CreatedDatePolicy;
import com.bstek.bdf3.dorado.jpa.policy.impl.UpdatedDatePolicy;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * 客户备注表
 * @author Handy
 *
 */
@Entity
@Table(name = "BDF3_CRM_CUSTOMERREMARK")
public class CustomerRemark implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3085534953705312326L;
	
	@Id
	@Column(name = "ID", length = 32)
	@PropertyDef(label = "标识")
	private String id;
	
	@Column(name = "NOTEPERSON", length = 50)
	@PropertyDef(label = "备注人")
	private String notePerson;
	
	@Column(name = "NOTECONTENT", length = 255)
	@PropertyDef(label = "备注内容")
	private String noteContent;
	
	@Column(name = "CONTACTSID", length = 50)
	@PropertyDef(label = "客户id")
	private String customerId;
	
	@Column(name = "EDITFLAG", length = 50)
	@PropertyDef(label = "修改标记")
	private Integer editFlag;
	
	@Column(name = "EDITPERSON", length = 50)
	@PropertyDef(label = "修改人")
	private String editPerson;
	
	@Column(name = "NOTETIME")
   	@PropertyDef(label = "备注时间")
    @Generator(policy = CreatedDatePolicy.class)
	private Date noteTime;
	
	@Column(name = "EDITTIME")
   	@PropertyDef(label = "修改时间")
    @Generator(policy = UpdatedDatePolicy.class)
	private Date editTime;

	public String getId() { 
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNotePerson() {
		return notePerson;
	}

	public void setNotePerson(String notePerson) {
		this.notePerson = notePerson;
	}

	public String getNoteContent() {
		return noteContent;
	}

	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Integer getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(Integer editFlag) {
		this.editFlag = editFlag;
	}

	public String getEditPerson() {
		return editPerson;
	}

	public void setEditPerson(String editPerson) {
		this.editPerson = editPerson;
	}

	public Date getNoteTime() {
		return noteTime;
	}

	public void setNoteTime(Date noteTime) {
		this.noteTime = noteTime;
	}

	public Date getEditTime() {
		return editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}
}
