package com.mssm.dbTable.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mssm.dbTable.pojo.User;
import com.mssm.dbTable.service.IUserService;


@Controller
@RequestMapping("/users")
public class UserController {

    @Resource
    private IUserService userService;

    /***
     * 请求 http://127.0.0.1:8080/mssm/users/showUser.s?id=1
     * 注解配置，只允许GET提交到该方法
     * @param request
     * @param model
     * @return  
     */
    @RequestMapping(value = "/showUser", method = RequestMethod.GET)
    public String toIndex(HttpServletRequest request, Model model) {
    	Long userId = Long.valueOf(request.getParameter("id"));System.out.println(userId);
        User users = this.userService.getUsersById(userId);
      //将参数返回给页面
        model.addAttribute("user", users);
        //指定要返回的页面为/page/User.jsp
        return "User";
    }
    /***
     * 请求 http://127.0.0.1:8080/mssm/users/showUser2.s?id=1
     * 注解配置，只允许GET提交到该方法
     * @param request  测试 缓存
     * @param model
     * @return  
     */
    @RequestMapping(value = "/showUser2", method = RequestMethod.GET)
    public ModelAndView toIndex2(String id,String password){  
        //验证传递过来的参数是否正确，否则返回到登陆页面。  
        if(this.checkParams(new String[]{id})){
            //指定要返回的页面为/page/User.jsp
            ModelAndView mav = new ModelAndView("User");  
            Long userId = Long.valueOf(id);
            User users = this.userService.getUsernameByIdByCache(userId);
            //将参数返回给页面  
            mav.addObject("user", users);  
            return mav;  
        }
      //指定要返回的页面为/page/error.jsp 
        return new ModelAndView("error");  
    }
    
    /*** 
     * 验证参数是否为空 
     * @param params 
     * @return 
     */  
    private boolean checkParams(String[] params){  
        for(String param:params){  
            if(param==""||param==null||param.isEmpty()){  
                return false;  
            }  
        }  
        return true;  
    } 
    
    /***
     * 登录
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)  
    public String login() {  
        return "login";  
    }  
    @RequestMapping(value = "/login", method = RequestMethod.POST)  
    public String login2(HttpServletRequest request) {  
            String username = request.getParameter("username").trim();  
            System.out.println(username);  
          /*  防止重复提交数据，可以使用重定向视图
            return "redirect:/login2" */
        return "login2";  
    }  
}