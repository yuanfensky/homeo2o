package com.wsjia.ms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by pc on 2016/7/14.
 */
@Entity
@Table(name = "brand")
public class Brand {


    private String id;
    private String serial;
    private String pictureUrl;
    private Product product;
    private Set<BrandPicture> brandPictures;

    @Id
    @GenericGenerator(name = "id", strategy = "com.wsjia.crm.homeo2o.utils.M8idGenerator")
    @GeneratedValue(generator = "id")
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

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "brand",fetch = FetchType.EAGER)
    public Set<BrandPicture> getBrandPictures() {
        return brandPictures;
    }

    public void setBrandPictures(Set<BrandPicture> brandPictures) {
        this.brandPictures = brandPictures;
    }

    @JsonIgnore
    @OneToOne(mappedBy = "brand",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Brand() {
    }

   /* public Brand(String id, String serial, String pictureUrl, Product product, Set<BrandPicture> brandPictures) {
        this.id = id;
        this.serial = serial;
        this.pictureUrl = pictureUrl;
        this.product = product;
        this.brandPictures = brandPictures;
    }*/
}
