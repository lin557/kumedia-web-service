package com.lin.kumedia.web.controller.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.lin.kumedia.web.constant.ErrorCode;
import com.lin.kumedia.web.constant.HttpAttributeConsts;
import com.lin.kumedia.web.pojo.codedata.HttpCodeData;


/**
 * 鉴权切面 判断用户身份是否合法
 * @author zhen.lin
 * @date 2019年8月14日
 */
@Aspect
@Order(1)
@Component
public class ApiAspect {

    @Autowired
    HttpServletRequest httpRequest;
    
    /**
     * com.honghua.controller.authorization层切点
     * 拦截所有public
     */
    @Pointcut("execution(public * com.lin.kumedia.web.controller.api..*.*(..))")
    public void apiAspect() {}
    
    @Around("apiAspect()")
    public Object aroundAuthorization(ProceedingJoinPoint pjp) throws Throwable {
        HttpCodeData ret = new HttpCodeData();
        ret.setErrorCode(ErrorCode.ERROR_NONE.getErrorCode());
        ret.setErrorMessage(ErrorCode.ERROR_NONE.getErrorMessage());
        ret.setStatusCode(java.net.HttpURLConnection.HTTP_OK);
        // 将HttpCodeData写入request头中方便后面使用者调用
        httpRequest.setAttribute(HttpAttributeConsts.ATTR_CODEDATA, ret);
        return pjp.proceed();
    }
}
