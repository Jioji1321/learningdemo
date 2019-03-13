package com.jerry.car.entity.user;

import java.io.Serializable;
import java.util.Date;

public class UserInformation implements Serializable{

    private Integer informationId;

    private String name;

    private int gender;

    private Integer cardId;

    private Date birthday;

    private String address;

    private String email;

    public UserInformation() {    }

    public UserInformation(Integer informationId, String name, int gender, Integer cardId, Date birthday, String address, String email) {
        this.informationId = informationId;
        this.name = name;
        this.gender = gender;
        this.cardId = cardId;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
    }

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
