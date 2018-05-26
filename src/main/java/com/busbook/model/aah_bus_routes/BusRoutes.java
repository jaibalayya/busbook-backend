package com.busbook.model.aah_bus_routes;

import java.io.Serializable;
import java.util.Date;

public class BusRoutes implements Serializable {
/*	aah_bus_route_id (PK)	varchar (15)
	aah_bus_id (FK with aac_bus table)	varchar (10)
	aah_point_id (FK with aab_boarding_dropping_points)	varchar (13)
	aah_time	varchar (10)
	aah_boarding_or_dropping	char
	aah_status	char
	aah_created_by (FK with aad_users table)	varchar (15)
	aah_created_date	date
	aah_modified_by (FK with aad_users table)	varchar (15)
	aah_modified_date	date
	aah_order_by	char (4)
*/
	
	protected String busRouteId;
	protected String time;
	protected String boardingOrDroppingTime;
	protected String status;
	protected Date createdDate;
	protected Date modifiedDate;
	protected String orderBy;
	public String getBusRouteId() {
		return busRouteId;
	}
	public void setBusRouteId(String busRouteId) {
		this.busRouteId = busRouteId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBoardingOrDroppingTime() {
		return boardingOrDroppingTime;
	}
	public void setBoardingOrDroppingTime(String boardingOrDroppingTime) {
		this.boardingOrDroppingTime = boardingOrDroppingTime;
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
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardingOrDroppingTime == null) ? 0 : boardingOrDroppingTime.hashCode());
		result = prime * result + ((busRouteId == null) ? 0 : busRouteId.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((orderBy == null) ? 0 : orderBy.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		BusRoutes other = (BusRoutes) obj;
		if (boardingOrDroppingTime == null) {
			if (other.boardingOrDroppingTime != null)
				return false;
		} else if (!boardingOrDroppingTime.equals(other.boardingOrDroppingTime))
			return false;
		if (busRouteId == null) {
			if (other.busRouteId != null)
				return false;
		} else if (!busRouteId.equals(other.busRouteId))
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
		if (orderBy == null) {
			if (other.orderBy != null)
				return false;
		} else if (!orderBy.equals(other.orderBy))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	
	
}
