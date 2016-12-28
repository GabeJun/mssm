package com.mssm.dbTable.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mssm.dbTable.pojo.User;
import com.mssm.dbTable.service.impl.TestCacheService;


@Controller
@RequestMapping("/test")
public class TestCacheController {

    @Resource
    private TestCacheService testCacheService;
    /***
     * 请求 http://127.0.0.1:8080/mssm/test/getTestCacheable.s?id=1
     * 注解配置，只允许GET提交到该方法
     * @param request  测试 缓存
     * @param model
     * @return  
     */
    @RequestMapping(value = "/getTestCacheable", method = RequestMethod.GET)
    public ModelAndView getTestCacheable(String id){  
        //验证传递过来的参数是否正确，否则返回到登陆页面。  
            //指定要返回的页面为/page/User.jsp
            ModelAndView mav = new ModelAndView("User");  
            Long userId = Long.valueOf(id);
            User users = this.testCacheService.getTestCacheable(userId);
            //将参数返回给页面  
            mav.addObject("user", users);  
            return mav;  
    }
    @RequestMapping(value = "/getTestCachePut", method = RequestMethod.GET)
    public ModelAndView getTestCachePut(String id){  
            ModelAndView mav = new ModelAndView("User");  
            Long userId = Long.valueOf(id);
            User users = this.testCacheService.getTestCachePut(userId);
            //将参数返回给页面  
            mav.addObject("user", users);  
            return mav;  
    }
    @RequestMapping(value = "/getTestCacheEvict", method = RequestMethod.GET)
    public ModelAndView getTestCacheEvict(String id){  
            ModelAndView mav = new ModelAndView("User");  
            Long userId = Long.valueOf(id);
            this.testCacheService.getTestCacheEvict(userId);
            //将参数返回给页面  
            mav.addObject("user", null);  
            return mav;  
    }
   
}