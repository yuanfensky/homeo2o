package com.wsjia.ms.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by pc on 2016/7/14.
 */
@Entity
@Table(name = "product")
public class Product {


    private String id;

    private String name;
    private String serial;
    private String type;

    private Brand brand;

    private String mainPictureUrl;


    private Set<ProductPicture> productPictures;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getMainPictureUrl() {
        return mainPictureUrl;
    }

    public void setMainPictureUrl(String mainPictureUrl) {
        this.mainPictureUrl = mainPictureUrl;
    }

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "product",cascade = CascadeType.ALL)
    public Set<ProductPicture> getProductPictures() {
        return productPictures;
    }

    public void setProductPictures(Set<ProductPicture> productPictures) {
        this.productPictures = productPictures;
    }



    public Product() {
    }
}
