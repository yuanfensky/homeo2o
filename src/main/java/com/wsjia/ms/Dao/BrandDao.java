package com.wsjia.ms.Dao;

import com.wsjia.ms.entity.Brand;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pc on 2016/7/18.
 */
@Transactional
public interface BrandDao extends Repository<Brand,String> {

    Brand findById(String id);

    Brand save(Brand brand);


    Brand findBySerial(String serial);


    int deleteById(String id);


    Brand findByProductId(String prroductId);
}
