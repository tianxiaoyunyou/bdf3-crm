package com.bstek.crm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bstek.dorado.annotation.PropertyDef;

/**
 * 联系人市场活动关系表
 * @author Handy
 *
 */
@Entity
@Table(name = "BDF3_CRM_CONTACTSACTIVITYRELATION")
public class ContactsActivityRelation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8338495106363081743L;
	
	@Id
	@Column(name = "ID", length = 32)
	@PropertyDef(label = "标识")
	private String id;
	
	@Column(name = "ACTIVITYID", length = 50)
	@PropertyDef(label = "市场活动id")
	private String activityId;
	
	@Column(name = "CONTACTSID", length = 50)
	@PropertyDef(label = "联系人id")
	private String contactsId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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


}
