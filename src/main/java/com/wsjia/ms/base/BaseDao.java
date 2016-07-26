package com.wsjia.ms.base;


import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ming
 * Date: 12-10-15
 * Time: 下午2:01
 * To change this template use File | Settings | File Templates.
 */
@NoRepositoryBean
public interface BaseDao<T,String> extends PagingAndSortingRepository<T, ID> {


    T getObject(String id);

    void saveObject(T entity);

    void updateObject(T entity);

    void saveOrUpdateObject(T entity);

    void deleteObject(T entity);

    List<T> getObjectList(String hql, Object... params);

    T getUniqueObjectByConditions(String queryHql, LinkedHashMap<String, Object> queryParamMap);

    List<T> getObjectListByConditions(String queryHql, LinkedHashMap<String, Object> queryParamMap);

   /* PageInfo getPageByConditions(PageEntity pageEntity, String queryString, Object... params);

    PageInfo getPageByConditions(PageEntity pageEntity, String queryHql, LinkedHashMap<String, Object> queryParamMap);

    PageInfo getPage(Query listQuery, Query countQuery, PageEntity pageEntity);*/
}
