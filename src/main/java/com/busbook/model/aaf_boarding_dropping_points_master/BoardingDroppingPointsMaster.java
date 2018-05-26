package com.busbook.model.aaf_boarding_dropping_points_master;

import java.io.Serializable;
import java.util.Date;

public class BoardingDroppingPointsMaster implements Serializable {
/*	aaf_point_id (PK)	varchar (13)
	aaf_point_name	varchar (50)
	aaf_address	varchar (300)
	aaf_contact_number	varcbar (20)
	aaf_city_id (FK from aah_cities table)	int
	aaf_status	char
	aaf_created_by (FK with aad_users table)	varchar (15)
	aaf_created_date 	date
	aaf_modified_by (FK with aad_users table)	varchar (15)
	aaf_modified_date 	date
*/
	protected String pointId;
	protected String pointName;
	protected String address;
	protected String contactNumber;
	protected String status;
	protected Date createdDate;
	protected Date date;
	public String getPointId() {
		return pointId;
	}
	public void setPointId(String pointId) {
		this.pointId = pointId;
	}
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((pointId == null) ? 0 : pointId.hashCode());
		result = prime * result + ((pointName == null) ? 0 : pointName.hashCode());
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
		BoardingDroppingPointsMaster other = (BoardingDroppingPointsMaster) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (pointId == null) {
			if (other.pointId != null)
				return false;
		} else if (!pointId.equals(other.pointId))
			return false;
		if (pointName == null) {
			if (other.pointName != null)
				return false;
		} else if (!pointName.equals(other.pointName))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	
	
}
