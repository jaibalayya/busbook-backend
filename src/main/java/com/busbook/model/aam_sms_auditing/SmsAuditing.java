package com.busbook.model.aam_sms_auditing;

import java.io.Serializable;
import java.util.Date;

public class SmsAuditing implements Serializable {
/*	aam_sms_template_id	varchar (20)
	aam_sms	varchar (1000)
	aam_sms_sent_date	date
	aam_user_id	varchar (15)
*/
	protected String smsTemplateId;
	protected String sms;
	protected Date smsSentDate;
	protected String userId;
	public String getSmsTemplateId() {
		return smsTemplateId;
	}
	public void setSmsTemplateId(String smsTemplateId) {
		this.smsTemplateId = smsTemplateId;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public Date getSmsSentDate() {
		return smsSentDate;
	}
	public void setSmsSentDate(Date smsSentDate) {
		this.smsSentDate = smsSentDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sms == null) ? 0 : sms.hashCode());
		result = prime * result + ((smsSentDate == null) ? 0 : smsSentDate.hashCode());
		result = prime * result + ((smsTemplateId == null) ? 0 : smsTemplateId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		SmsAuditing other = (SmsAuditing) obj;
		if (sms == null) {
			if (other.sms != null)
				return false;
		} else if (!sms.equals(other.sms))
			return false;
		if (smsSentDate == null) {
			if (other.smsSentDate != null)
				return false;
		} else if (!smsSentDate.equals(other.smsSentDate))
			return false;
		if (smsTemplateId == null) {
			if (other.smsTemplateId != null)
				return false;
		} else if (!smsTemplateId.equals(other.smsTemplateId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	
}
