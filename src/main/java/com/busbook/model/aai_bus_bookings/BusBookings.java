package com.busbook.model.aai_bus_bookings;

import java.io.Serializable;
import java.util.Date;

public class BusBookings implements Serializable {
/*	aai_bus_booking_id (PK)	varchar (20)
	aai_bus_id (FK with aac_bus)	varchar (10)
	aai_user_id (FK with aad_users)	varchar (15)
	aaj_seat_no	varchar (10)
	aai_boarding_point_id (FK with aab_boarding_dropping_points)	varchar (13)
	aai_droping_point_id (FK with aab_boarding_dropping_points)	varchar (13)
	aai_boarding_time	varchar (10)
	aai_droping_time	varchar (10)
	aai_journey_date	date
	aai_status	char
	aai_is_cancelled	char   [ default 0  ]
	aai_cancelled_date	date
	aai_created_by (FK with aad_users table)	varchar (15)
	aai_created_date 	date
	aai_modified_by (FK with aad_users table)	varchar (15)
	aai_modified_date	date
*/
	protected String bookingId;
	protected String seatNo;
	protected String boardingTime;
	protected String droppingTime;
	protected Date   journeyDate;
	protected String status;
	protected String isCancelled;
	protected Date   cancelledDate;
	protected Date   createdDate;
	protected Date   modifiedDate;
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getBoardingTime() {
		return boardingTime;
	}
	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}
	public String getDroppingTime() {
		return droppingTime;
	}
	public void setDroppingTime(String droppingTime) {
		this.droppingTime = droppingTime;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIsCancelled() {
		return isCancelled;
	}
	public void setIsCancelled(String isCancelled) {
		this.isCancelled = isCancelled;
	}
	public Date getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(Date cancelledDate) {
		this.cancelledDate = cancelledDate;
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
		result = prime * result + ((boardingTime == null) ? 0 : boardingTime.hashCode());
		result = prime * result + ((bookingId == null) ? 0 : bookingId.hashCode());
		result = prime * result + ((cancelledDate == null) ? 0 : cancelledDate.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((droppingTime == null) ? 0 : droppingTime.hashCode());
		result = prime * result + ((isCancelled == null) ? 0 : isCancelled.hashCode());
		result = prime * result + ((journeyDate == null) ? 0 : journeyDate.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((seatNo == null) ? 0 : seatNo.hashCode());
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
		BusBookings other = (BusBookings) obj;
		if (boardingTime == null) {
			if (other.boardingTime != null)
				return false;
		} else if (!boardingTime.equals(other.boardingTime))
			return false;
		if (bookingId == null) {
			if (other.bookingId != null)
				return false;
		} else if (!bookingId.equals(other.bookingId))
			return false;
		if (cancelledDate == null) {
			if (other.cancelledDate != null)
				return false;
		} else if (!cancelledDate.equals(other.cancelledDate))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (droppingTime == null) {
			if (other.droppingTime != null)
				return false;
		} else if (!droppingTime.equals(other.droppingTime))
			return false;
		if (isCancelled == null) {
			if (other.isCancelled != null)
				return false;
		} else if (!isCancelled.equals(other.isCancelled))
			return false;
		if (journeyDate == null) {
			if (other.journeyDate != null)
				return false;
		} else if (!journeyDate.equals(other.journeyDate))
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
			return false;
		if (seatNo == null) {
			if (other.seatNo != null)
				return false;
		} else if (!seatNo.equals(other.seatNo))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	
	
}
