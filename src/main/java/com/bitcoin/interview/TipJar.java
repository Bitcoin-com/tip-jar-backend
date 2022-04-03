package com.bitcoin.interview;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TipJar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Long userId;
    @NotNull
    private Double totalAmount;
    @NotNull
    private Integer noOfPerson;
    @NotNull
    private Double tipPercentage;
    private Double totalTip;
    private Double tipPerPerson;
    private String imageUrl;
    private Date savedOn;

    public TipJar() {  }

    public TipJar(Long userId, Double totalAmount, Integer noOfPerson, Double tipPercentage) {
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.noOfPerson = noOfPerson;
        this.tipPercentage = tipPercentage;
        this.totalTip = totalAmount * (tipPercentage/100);
        this.tipPerPerson = this.totalTip/noOfPerson;
        this.imageUrl = "";
        this.savedOn = new Date();
    }

    public Long getUserId() {
        return userId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Integer getNoOfPerson() {
        return noOfPerson;
    }

    public Double getTipPercentage() {
        return tipPercentage;
    }

    public Double getTotalTip() {
        return totalTip;
    }

    public Double getTipPerPerson() {
        return tipPerPerson;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Date getSavedOn() {
        return savedOn;
    }

    @Override
    public String toString() {
        return "TipJar{" +
                "totalAmount=" + totalAmount +
                ", noOfPerson='" + noOfPerson + '\'' +
                ", tipPercentage='" + tipPercentage + '\'' +
                ", totalTip='" + totalTip + '\'' +
                ", tipPerPerson='" + tipPerPerson + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", savedOn='" + savedOn + '\'' +
                '}';
    }
}
