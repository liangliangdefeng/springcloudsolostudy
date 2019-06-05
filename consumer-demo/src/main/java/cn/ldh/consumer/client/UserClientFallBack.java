package cn.ldh.consumer.client;

import cn.ldh.consumer.pojo.User;
import lombok.var;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2019/6/5 17:10
 */
@Component
public class UserClientFallBack implements UserClient {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setName("未知用户！");
        return user;
    }
}
