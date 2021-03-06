package cn.ibilidi.service;

import cn.ibilidi.exception.UpdataWxUserInfoException;
import cn.ibilidi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Anthony on 2017/10/28.
 */

@Service
public interface UserService {
    User getUserByOpenid(String openid);
    User getUserById(String id);
    ArrayList<User> getAllUsers();
    int updateWXUser(String id,String name,String headurl,String openid,String gender) throws UpdataWxUserInfoException;

}
