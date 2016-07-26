package com.wsjia.ms.Controller;

import com.wsjia.ms.Dao.BrandDao;
import com.wsjia.ms.entity.Brand;
import com.wsjia.ms.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * Created by pc on 2016/7/18.
 */
@Controller
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandDao brandDao;



    @RequestMapping("/getBrandById/{id}")
    public Brand findById(@PathVariable("id") String id){
        return brandDao.findById(id);
    }

    @RequestMapping("/findByProductId")
    public Brand findByProductId(){
        return brandDao.findByProductId("2");
    }


    @RequestMapping("/save")
    @ResponseBody
    public int save(Model model, Brand brand, HttpServletRequest request, HttpServletResponse response){
        brand.setId(StringUtil.removeChar(UUID.randomUUID().toString(),'-'));
        System.out.print(brand.getSerial());
        brandDao.save(brand);
        return 0;
    }

    @RequestMapping("/saveUI")
    public String toSaveView(){
        return "brandForm";
    }

}
