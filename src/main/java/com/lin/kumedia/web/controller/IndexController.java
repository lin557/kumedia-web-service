package com.lin.kumedia.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主界面登录页
 * @author zhen.lin
 * @date 2019年8月16日
 */
@Controller
public class IndexController extends BaseController {

    /**
     * 这里只为引导用户调用html，其他所有业务都使用api接口完成
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
