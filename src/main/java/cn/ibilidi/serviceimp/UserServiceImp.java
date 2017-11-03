package cn.ibilidi.serviceimp;

import cn.ibilidi.dao.UserDao;
import cn.ibilidi.model.User;
import cn.ibilidi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Anthony on 2017/10/28.
 */

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;


    public User getUserByOpenid(String openid) {
        return userDao.getUser(openid,0);
    }

    public User getUserById(String id) {
        return userDao.getUser(id,1);
    }

    public ArrayList<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
