package com.lin.kumedia.sql.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.kumedia.sql.entity.common.BaseEntity;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<M extends BaseMapper<T>, T extends BaseEntity> {

    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());
    
    /**
     * Mapper对象
     */
    @Autowired
    protected M mapper;
    
    
    /**
     * 插入前执行的方法 用于数据校验
     * @param entity
     */
    protected void beforeInsert(T entity) {
        // empty
    }
    
    protected int insert(T entity) {
        beforeInsert(entity);
        return mapper.insert(entity);
    }
    
}
