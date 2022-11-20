package com.lin.kumedia.web.constant;

/**
 * 错误码
 * @author zhen.lin
 * @date 2020年5月19日
 */
public enum ErrorCode {

    /**
     * 正常 无错误
     */
    ERROR_NONE("00000", "OK"),
    
    ERROR_CLIENT("A0001", "用户端错误"),
    
    ERROR_CLIENT_USER("A0100", "用户注册错误"),
    // A0101 A0102
    ERROR_CLIENT_USER_NAME_VERIFICATION_FAILED("A0110", "用户名校验失败"),
    ERROR_CLIENT_USER_NAME_ALREADY_EXISTS("A0111", "用户名已存在"),
    // A0112 A0113
    ERROR_CLIENT_USER_PASSWORD_VERIFICATION_FAILED("A0120", "密码校验失败"),
    // A0121 A0122 A0130 A0131 A0132 A0133 A0140 A0141 A0142 A0143 A0144
    // A0150-153
    
    ERROR_CLIENT_LOGGIN("A0200", "用户登陆异常"),
    // A0201-203
    ERROR_CLIENT_LOGGIN_PASSWORD("A0210", "用户密码错误"),
    
    ERROR_CLIENT_ACCESS("A0300", "访问权限异常"),
    ERROR_CLIENT_ACCESS_UNAUTHORIZED("A0301", "访问未授权"),
    ERROR_CLIENT_ACCESS_EXPIRED("A0311", "授权已过期"),
    
    
    ERROR_CLIENT_ACCESS_ILLEGAL_IP("A0323", "非法IP地址"),
    
    ERROR_CLIENT_PARAM("A0400", "用户请求参数错误"),
    ERROR_CLIENT_PARAM_REQUIRED("A0410", "请求必填参数为空"),
    ERROR_CLIENT_PARAM_TIMESTAMP("A0414", "非法的时间戳参数"),
    // 自定义
    ERROR_CLIENT_PARAM_URLSIGN("A0419", "URL签名错误"),
    
    ERROR_CLIENT_PARAM_FORMAT("A0421", "参数格式不匹配"),
    
    ERROR_CLIENT_SERVICE("A0500", "用户请求服务异常"),
    
    
    ERROR_CLIENT_DEVICE("A1000", "用户设备异常"),
    ERROR_CLIENT_DEVICE_CAMERA_ERROR("A1001", "用户相机异常"),
    
    
    ERROR_SYSTEM("B0001", "系统执行出错"),
    
    ERROR_SYSTEM_TIMEOUT("B0100", "系统执行超时"),
    
    ERROR_SYSTEM_RESOURCE("B0300", "系统资源异常"),
    
    
    ERROR_SERVICE("C0001", "调用第三方服务出错"),
    
    ERROR_SERVICE_MIDDLEWARE("C0100", "中间件服务出错"),
    ERROR_SERVICE_MIDDLEWARE_RPC("C0110", "RPC服务出错"),
    ERROR_SERVICE_MIDDLEWARE_RPC_NOT_FOUND("C0111", "RPC服务未找到"),
    ERROR_SERVICE_MIDDLEWARE_RPC_UNREGISTERED("C0112", "RPC服务未注册"),
    ERROR_SERVICE_MIDDLEWARE_INTERFACE_NOT_EXIST("C0113", "接口不存在"),
    
    
    ERROR_SERVICE_TIMEOUT("C0200", "第三方系统执行超时"),
    ERROR_SERVICE_TIMEOUT_RPC("C0210", "RPC执行超时"),
    ERROR_SERVICE_TIMEOUT_MESSAGE("C0220", "消息投递超时"),
    ERROR_SERVICE_TIMEOUT_CACHE("C0230", "缓存服务超时"),
    ERROR_SERVICE_TIMEOUT_CONFIG("C0240", "配置服务超时"),
    ERROR_SERVICE_TIMEOUT_DB("C0250", "数据库服务超时"),
    
    ERROR_SERVICE_DB("C0300", "数据库服务出错"),
    ERROR_SERVICE_DB_TABLE_NOT_EXIST("C0311", "表不存在"),
    ERROR_SERVICE_DB_LOCK("C0331", "数据库死锁"),
    
    ERROR_SERVICE_DB_DUPLICATEKEY("C0341", "主键冲突"),
    ;
    
    
    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 错误码对应消息
     */
    private String errorMessage;

    ErrorCode(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

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
   
}
