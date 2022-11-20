package com.lin.kumedia.web.controller.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lin.kumedia.sql.service.media.MediaListService;
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
public class MovieController extends BaseController {
    
    @Autowired
    private MediaListService mediaListService;
    
    /**
     * 列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/movie")
    public @ResponseBody HttpCodeData getMovieList(HttpServletRequest request) throws Exception {
        HttpCodeData response = (HttpCodeData) request.getAttribute(HttpAttributeConsts.ATTR_CODEDATA);
        response.setResult(mediaListService.getMediaList("movie"));
        return response;
    }

    @RequestMapping("/movie/{mediaId}")
    public @ResponseBody HttpCodeData getMovieById(HttpServletRequest request,
            @PathVariable(value = "mediaId", required = true) String mediaId) throws Exception {
        HttpCodeData response = (HttpCodeData) request.getAttribute(HttpAttributeConsts.ATTR_CODEDATA);
        response.setResult(mediaListService.getMediaById(mediaId));
        return response;
    }
}
