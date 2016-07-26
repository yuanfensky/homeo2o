package com.wsjia.ms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by pc on 2016/7/14.
 */
@Entity
@Table(name = "brandpicture")
public class BrandPicture {

    private String id;

    private String serial;

    private String pictureUrl;


    private Brand brand;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="brand_id")
    @JsonIgnore
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

 /*   public BrandPicture(String id, String serial, String pictureUrl) {
        this.id = id;
        this.serial = serial;
        this.pictureUrl = pictureUrl;
    }*/

    public BrandPicture() {
    }
}
