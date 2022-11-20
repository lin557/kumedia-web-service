package com.lin.kumedia.sql.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lin.kumedia.sql.entity.common.BaseEntity;

/**
 * 编码规则表
 * 
 * @author zhen.lin
 * @date 2019年9月15日
 */
@TableName("system_rule")
public class SystemRule extends BaseEntity {

    /**
     * 前缀
     */
    private String prefix;
    /**
     * 后缀
     */
    private Integer suffix;
    /**
     * 备注
     */
    private String remark;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getSuffix() {
        return suffix;
    }

    public void setSuffix(Integer suffix) {
        this.suffix = suffix;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
