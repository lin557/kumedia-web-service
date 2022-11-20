package com.lin.kumedia.web.controller.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lin.kumedia.sql.service.media.MediaTangService;
import com.lin.kumedia.web.constant.HttpAttributeConsts;
import com.lin.kumedia.web.controller.BaseController;
import com.lin.kumedia.web.pojo.codedata.HttpCodeData;

/**
 * 电影数据
 * @author zhen.lin
 * @date 2022年10月27日
 */
@RestController
@RequestMapping("/api")
public class TangController extends BaseController {
    
    @Autowired
    private MediaTangService mediaTangService;
    
    /**
     * 列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/tang")
    public @ResponseBody HttpCodeData getTangList(HttpServletRequest request) throws Exception {
        HttpCodeData response = (HttpCodeData) request.getAttribute(HttpAttributeConsts.ATTR_CODEDATA);
        response.setResult(mediaTangService.getTangList());
        return response;
    }

    @RequestMapping("/tang/{tangId}")
    public @ResponseBody HttpCodeData getMovieById(HttpServletRequest request,
            @PathVariable(value = "tangId", required = true) String tangId) throws Exception {
        HttpCodeData response = (HttpCodeData) request.getAttribute(HttpAttributeConsts.ATTR_CODEDATA);
        response.setResult(mediaTangService.getTangById(tangId));
        return response;
    }
}
