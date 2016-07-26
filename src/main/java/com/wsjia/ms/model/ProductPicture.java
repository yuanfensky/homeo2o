package com.wsjia.ms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by pc on 2016/7/14.
 */
@Entity
@Table(name = "productpicture")
public class ProductPicture {


    private String id;
    private String serial;
    private String pictureUrl;


    private Product product;

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

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public ProductPicture() {
    }
}
