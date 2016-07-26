package com.wsjia.ms.Controller;

import com.wsjia.ms.Dao.BrandDao;
import com.wsjia.ms.Dao.ProductDao;
import com.wsjia.ms.entity.Product;
import com.wsjia.ms.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by pc on 2016/7/14.
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductDao productDao;

    @Autowired
    private BrandDao brandDao;




    @RequestMapping("/getProductById/{data}")
    public Product findById(@PathVariable("id") String id){
        Product p = productDao.findById(id);
        return p;
    }

    @RequestMapping("/getProductBySerial/{serial}")
    public Product findBySerial(@PathVariable("serial") String serial){
        Product p = productDao.findBySerial(serial);
        return p;
    }

    @RequestMapping("/save")
    public int saveProduct(){
        Product p = new Product();
        p.setId(StringUtil.removeChar(UUID.randomUUID().toString(),'_'));
        p.setMainPictureUrl("/sdf/sdf/sdg");
        p.setName("桌子");
        p.setSerial("5561321323");
        p.setType("1234");
        p.setBrand(brandDao.findById("b1"));
        productDao.save(p);
        return 1;
    }

    @RequestMapping("/delete/{id}")
    public int deleteProductById(@PathVariable("id") String id){
        return productDao.deleteById(id);
    }

    @RequestMapping("/update")
    public int  updateProduct(){
        Product product = productDao.findById("2");
        product.setType("5566");
        productDao.save(product);
        return 0;
    }

    @RequestMapping("/findByNameAndSerial")
    public Product findBSerial(){
        return productDao.findByNameAndSerial("1","1");
    }

    @RequestMapping("/findByBrandId/{brandId}")
    public Product findByBrandId(@PathVariable("brandId")String brandId){
        return productDao.findByBrandId(brandId);
    }


}
