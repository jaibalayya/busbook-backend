package com.busbook.model.aal_sms_template_master;

import java.io.Serializable;
import java.util.Date;

public class SmsTemplateMaster implements Serializable {
/*	aal_sms_template_id	varchar (20)
	aal_sms_template	varchar (1000)
	aal_created_by	varchar (15)
	aal_created_date	date
	aal_modified_by	varchar (15)
	aal_modified_date	date
	aal_status	char (1)
	aal_comments	varchar (1000)
*/
	protected String smsTemplateId;
	protected String smsTemplate;
	protected String createdBy;
	protected Date   createdDate;
	protected String modifiedBy;
	protected Date   modifiedDate;
	protected String status;
	protected String comments;
	public String getSmsTemplateId() {
		return smsTemplateId;
	}
	public void setSmsTemplateId(String smsTemplateId) {
		this.smsTemplateId = smsTemplateId;
	}
	public String getSmsTemplate() {
		return smsTemplate;
	}
	public void setSmsTemplate(String smsTemplate) {
		this.smsTemplate = smsTemplate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((modifiedBy == null) ? 0 : modifiedBy.hashCode());
		result = prime * result + ((smsTemplate == null) ? 0 : smsTemplate.hashCode());
		result = prime * result + ((smsTemplateId == null) ? 0 : smsTemplateId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmsTemplateMaster other = (SmsTemplateMaster) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (modifiedBy == null) {
			if (other.modifiedBy != null)
				return false;
		} else if (!modifiedBy.equals(other.modifiedBy))
			return false;
		if (smsTemplate == null) {
			if (other.smsTemplate != null)
				return false;
		} else if (!smsTemplate.equals(other.smsTemplate))
			return false;
		if (smsTemplateId == null) {
			if (other.smsTemplateId != null)
				return false;
		} else if (!smsTemplateId.equals(other.smsTemplateId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	
}
