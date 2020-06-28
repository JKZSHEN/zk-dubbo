package com.jk.impl;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangZaiShen
 * @Description //TODO $
 * @Date $ $
 **/
@DubboService
public class UserServiceImpl implements UserService {

    private static Map<Integer,Object> map = new HashMap<>();

    @Override
    public int save(User user) {
        user.setAddress("浙江省杭州市");
        map.put(user.getId(),user);
        return 1;
    }

    @Override
    public User get(Integer id) {
        Object o = map.get(id);
        if(null == o){
            return null;
        }
        return (User)o;
    }
}
