package com.lin.kumedia.web.pojo.codedata;

/**
 * 带错误码的数据类 用于返回给客户端
 * @author zhen.lin
 * @date 2019年8月16日
 */
public class CodeData {

    /**
     * 状态码  
     */
    private String errorCode;
    /**
     * 描述信息, 描述错误原因，如"success" 成功, "error" 错误
     */
    private String errorMessage;
    /**
     * 数据，json格式, 值可以是number/boolean/array/object/string, 不能为null，至少是{}
     * 根据不同的业务进行相应的解包
     */
    private Object result;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
