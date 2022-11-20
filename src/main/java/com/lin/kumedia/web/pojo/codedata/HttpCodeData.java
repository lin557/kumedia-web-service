package com.lin.kumedia.web.pojo.codedata;

/**
 * http的返回值
 * @author zhen.lin
 * @date 2021/07/22
 */
public class HttpCodeData extends CodeData {
    /**
     * 根据阿里手册增加http状态码字段
     */
    private Integer statusCode;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    
}
