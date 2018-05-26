package com.busbook.model.aag_bus;

import java.io.Serializable;
import java.util.Date;

public class Bus implements Serializable {
/*	aag_bus_id (PK)	varchar (10)
	aag_bus_registration_no	varchar (30)
	aag_bus_service_no	varchar (20)
	aag_is_trackable	char
	aag_agency_id (FK with aae_agencies table)	varchar (10)
	aag_bus_type_id (FK with aae_bus_types table)	varchar (10)
	aag_bus_start_city_id (FK with aah_cities)	int
	aag_bus_end_city_id (FK with aah_cities)	int
	aag_status	char
	aag_created_by (FK with aad_users table)	varchar (15)
	aag_created_date 	date
	aag_modified_by (FK with aad_users table)	varchar (15)
	aag_modified_date 	date
*/
	
	protected String busId;
	protected String busRegistrationNo;
	protected String busServiceNo;
	protected String isTrackable;
	protected String status;
	protected Date createdDate;
	protected Date modifiedDate;
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getBusRegistrationNo() {
		return busRegistrationNo;
	}
	public void setBusRegistrationNo(String busRegistrationNo) {
		this.busRegistrationNo = busRegistrationNo;
	}
	public String getBusServiceNo() {
		return busServiceNo;
	}
	public void setBusServiceNo(String busServiceNo) {
		this.busServiceNo = busServiceNo;
	}
	public String getIsTrackable() {
		return isTrackable;
	}
	public void setIsTrackable(String isTrackable) {
		this.isTrackable = isTrackable;
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
		result = prime * result + ((busId == null) ? 0 : busId.hashCode());
		result = prime * result + ((busRegistrationNo == null) ? 0 : busRegistrationNo.hashCode());
		result = prime * result + ((busServiceNo == null) ? 0 : busServiceNo.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((isTrackable == null) ? 0 : isTrackable.hashCode());
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
		Bus other = (Bus) obj;
		if (busId == null) {
			if (other.busId != null)
				return false;
		} else if (!busId.equals(other.busId))
			return false;
		if (busRegistrationNo == null) {
			if (other.busRegistrationNo != null)
				return false;
		} else if (!busRegistrationNo.equals(other.busRegistrationNo))
			return false;
		if (busServiceNo == null) {
			if (other.busServiceNo != null)
				return false;
		} else if (!busServiceNo.equals(other.busServiceNo))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (isTrackable == null) {
			if (other.isTrackable != null)
				return false;
		} else if (!isTrackable.equals(other.isTrackable))
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
