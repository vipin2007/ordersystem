package com.paytack.ordersystem.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "paytack_user")
public class PaytackUser {

    private int user_id;
    private String first_name;
    private String last_name;
    private String email;
    private Date lastactivity_date;
    private String password;
    private Date registration_date;
    private int email_status;
    private String phone_number;
    private String language_perfence;
    private String latitude;
    private String longitude;
    private String referral_code;
    private String country_code;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getUser_id() {
        return user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public Date getLastactivity_date() {
        return lastactivity_date;
    }

    public String getPassword() {
        return password;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public int getEmail_status() {
        return email_status;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getLanguage_perfence() {
        return language_perfence;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getReferral_code() {
        return referral_code;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastactivity_date(Date lastactivity_date) {
        this.lastactivity_date = lastactivity_date;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public void setEmail_status(int email_status) {
        this.email_status = email_status;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setLanguage_perfence(String language_perfence) {
        this.language_perfence = language_perfence;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setReferral_code(String referral_code) {
        this.referral_code = referral_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
}
