package cn.ibilidi.dao;

import cn.ibilidi.model.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.ArrayList;

/**
 * Created by Anthony on 2017/10/28.
 */

public interface UserDao {
    User getUser(@Param("id_or_openid")String id_or_openid,@Param("flag")int flag);

    ArrayList<User> getAllUsers();
}
