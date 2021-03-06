package org.specialtripsagency;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Hotel implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Breakfast Included")
	private java.lang.Boolean breakfastIncluded;
	@org.kie.api.definition.type.Label("Duration")
	private java.lang.Integer duration;
	@org.kie.api.definition.type.Label("Hotel Id")
	private java.lang.String hotelId;
	@org.kie.api.definition.type.Label("Hotel Name")
	private java.lang.String hotelName;
	@org.kie.api.definition.type.Label("Location")
	private java.lang.String location;
	@org.kie.api.definition.type.Label("Price Discount")
	private java.lang.Integer priceDiscount;
	@org.kie.api.definition.type.Label("Room Price")
	private java.lang.String roomPrice;
	@org.kie.api.definition.type.Label("Room Type")
	private java.lang.String roomType;
	@org.kie.api.definition.type.Label("Check In Date")
	private java.lang.String checkInDate;
	@org.kie.api.definition.type.Label("Check Out Date")
	private java.lang.String checkOutDate;
	@org.kie.api.definition.type.Label("Booking Id")
	private java.lang.String bookingId;

	@org.kie.api.definition.type.Label(value = "Booking Status")
	private java.lang.String bookingStatus;

	public Hotel() {
	}

	public java.lang.Boolean getBreakfastIncluded() {
		return this.breakfastIncluded;
	}

	public void setBreakfastIncluded(java.lang.Boolean breakfastIncluded) {
		this.breakfastIncluded = breakfastIncluded;
	}

	public java.lang.Integer getDuration() {
		return this.duration;
	}

	public void setDuration(java.lang.Integer duration) {
		this.duration = duration;
	}

	public java.lang.String getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(java.lang.String hotelId) {
		this.hotelId = hotelId;
	}

	public java.lang.String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(java.lang.String hotelName) {
		this.hotelName = hotelName;
	}

	public java.lang.String getLocation() {
		return this.location;
	}

	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	public java.lang.Integer getPriceDiscount() {
		return this.priceDiscount;
	}

	public void setPriceDiscount(java.lang.Integer priceDiscount) {
		this.priceDiscount = priceDiscount;
	}

	public java.lang.String getRoomPrice() {
		return this.roomPrice;
	}

	public void setRoomPrice(java.lang.String roomPrice) {
		this.roomPrice = roomPrice;
	}

	public java.lang.String getRoomType() {
		return this.roomType;
	}

	public void setRoomType(java.lang.String roomType) {
		this.roomType = roomType;
	}

	public java.lang.String getCheckInDate() {
		return this.checkInDate;
	}

	public void setCheckInDate(java.lang.String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public java.lang.String getCheckOutDate() {
		return this.checkOutDate;
	}

	public void setCheckOutDate(java.lang.String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public java.lang.String getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(java.lang.String bookingId) {
		this.bookingId = bookingId;
	}

	public java.lang.String getBookingStatus() {
		return this.bookingStatus;
	}

	public void setBookingStatus(java.lang.String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Hotel(java.lang.Boolean breakfastIncluded,
			java.lang.Integer duration, java.lang.String hotelId,
			java.lang.String hotelName, java.lang.String location,
			java.lang.Integer priceDiscount, java.lang.String roomPrice,
			java.lang.String roomType, java.lang.String checkInDate,
			java.lang.String checkOutDate, java.lang.String bookingId,
			java.lang.String bookingStatus) {
		this.breakfastIncluded = breakfastIncluded;
		this.duration = duration;
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.location = location;
		this.priceDiscount = priceDiscount;
		this.roomPrice = roomPrice;
		this.roomType = roomType;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingId = bookingId;
		this.bookingStatus = bookingStatus;
	}

}