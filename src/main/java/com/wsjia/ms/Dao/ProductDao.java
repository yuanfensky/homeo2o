package com.wsjia.ms.Dao;

import com.wsjia.ms.entity.Product;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pc on 2016/7/14.
 */
@Transactional
public interface ProductDao extends Repository<Product,String>{


    Product findById(String id);

    Product findBySerial(String serial);

    Product findByNameAndSerial(String name, String serial);

    Product save(Product product);

    int deleteById(String id);


    Product findByBrandId(String brandId);

};
