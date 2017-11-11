package cn.ibilidi.controller;

import cn.ibilidi.exception.UpdataWxUserInfoException;
import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.User;
import cn.ibilidi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anthony on 2017/10/28.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/getUserByOpenid/{openid}")
    @ResponseBody
    public Map<String, Object> getUserByOpenid(@PathVariable String openid){
        System.out.print(openid);
        Map<String,Object> map=new HashMap<String, Object>();

        User user=userService.getUserByOpenid(openid);

        map.put(GlobalConstants.STATE,200);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.DATA,user);
        return map;
    }

    @RequestMapping(value="/getUserById/{id}")
    @ResponseBody
    public Map<String, Object> getUserById(@PathVariable String id){
        Map<String,Object> map=new HashMap<String, Object>();

        User user=userService.getUserById(id);
        map.put(GlobalConstants.STATE,200);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.DATA,user);
        return map;
    }

    @RequestMapping(value="/getAllUsers")
    @ResponseBody
    public Map<String, Object> getAllUsers(){
        Map<String,Object> map=new HashMap<String, Object>();

        ArrayList<User> users=userService.getAllUsers();
        map.put(GlobalConstants.STATE,200);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.DATA,users);
        return map;
    }
    @RequestMapping(value = "/updateWXUser")
    @ResponseBody
    public Map<String,Object> updateWXUser(String id,String name,String headurl,String openid,String gender){
        Map<String,Object> map=new HashMap<String, Object>();

        try {
            userService.updateWXUser(id,name,headurl,openid,gender);
            map.put(GlobalConstants.STATE,200);
            map.put(GlobalConstants.MESSAGE,"更新用户信息成功");
        } catch (UpdataWxUserInfoException e) {
            map.put(GlobalConstants.STATE,201);
            map.put(GlobalConstants.MESSAGE,e.getMessage());
        }
        return map;

    }

}
