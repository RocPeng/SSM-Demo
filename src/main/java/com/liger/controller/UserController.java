package com.liger.controller;

import com.liger.model.User;
import com.liger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by roc_peng on 2017/8/14.
 * Email 18817353729@163.com
 * Url https://github.com/RocPeng/
 * Description 这个世界每天都有太多遗憾,所以你好,再见!
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public String userList(Model model){
        List<User> users = userService.queryAll();
        model.addAttribute("userList",users);
        return "userList";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Integer id){
        userService.deleteById(id);
        return "redirect:/user/userList";
    }

    @RequestMapping("/editUser")
    public String editUser(Model model,@RequestParam("id") Integer id){
        User user = userService.queryById(id);
        model.addAttribute("user",user);
        return "editUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        userService.updateUserSelective(user);
        return "redirect:/user/userList";
    }

    @RequestMapping("/addUser")
    public String addUser(){
        return "addUser";
    }

    @RequestMapping("/insertUser")
    public String insertUser(User user){
        userService.insert(user);
        return "redirect:/user/userList";
    }

    /**
     * form表单提交 Date类型数据绑定
     * <功能详细描述>页面传递的形如"1994-05-25"的字符串自动转成date日期格式 并可支持传递null
     * @param binder
     * @see [类、类#方法、类#成员]
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
