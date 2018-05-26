package com.busbook.model.aae_bus_types;

import java.io.Serializable;
import java.util.Date;

public class BusType implements Serializable {
/*	aae_bus_type_id (PK)	varchar (10)
	aae_bus_type	varchar (30)
	aae_status	char
	aae_created_by (FK with aad_users table)	varchar (15)
	aae_created_date 	date
	aae_modified_by (FK with aad_users table)	varchar (15)
	aae_modified_date 	date
*/
	protected String busTypeId;
	protected String status;
	protected Date createdDate;
	protected Date modifiedDate;
	public String getBusTypeId() {
		return busTypeId;
	}
	public void setBusTypeId(String busTypeId) {
		this.busTypeId = busTypeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busTypeId == null) ? 0 : busTypeId.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
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
		BusType other = (BusType) obj;
		if (busTypeId == null) {
			if (other.busTypeId != null)
				return false;
		} else if (!busTypeId.equals(other.busTypeId))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	
}
