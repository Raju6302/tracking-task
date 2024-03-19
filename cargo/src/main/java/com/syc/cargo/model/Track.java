package com.syc.cargo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Track {

    @Id
    private String trackingNumber;
    private String fromCity;
    private String toCity;
    private int numberOfItems;
    private double actualWeight;
    private String status;
    private String dateTime;
    private String remarks;
    private String in_transit_datetime;
    private String in_transit_status;
    private String  in_transit_remarks;
    private String delivered_datetime;
    private String delivered_status;
    private String delivered_remarks;

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(double actualWeight) {
        this.actualWeight = actualWeight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getIn_transit_datetime() {
        return in_transit_datetime;
    }

    public void setIn_transit_datetime(String in_transit_datetime) {
        this.in_transit_datetime = in_transit_datetime;
    }

    public String getIn_transit_remarks() {
        return in_transit_remarks;
    }

    public String getIn_transit_status() {
        return in_transit_status;
    }

    public void setIn_transit_status(String in_transit_status) {
        this.in_transit_status = in_transit_status;
    }

    public void setIn_transit_remarks(String in_transit_remarks) {
        this.in_transit_remarks = in_transit_remarks;
    }

    public String getDelivered_datetime() {
        return delivered_datetime;
    }

    public void setDelivered_datetime(String delivered_datetime) {
        this.delivered_datetime = delivered_datetime;
    }

    public String getDelivered_remarks() {
        return delivered_remarks;
    }

    public String getDelivered_status() {
        return delivered_status;
    }

    public void setDelivered_status(String delivered_status) {
        this.delivered_status = delivered_status;
    }

    public void setDelivered_remarks(String delivered_remarks) {
        this.delivered_remarks = delivered_remarks;
    }
}
