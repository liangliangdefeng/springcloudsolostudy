package cn.ldh.consumer.client;

import cn.ldh.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 * @date 2019/6/5 15:36
 */
@FeignClient(value = "user-service", fallback = UserClientFallBack.class)
public interface UserClient {

    @GetMapping("user/{id}")
    User queryById(@PathVariable("id") Long id);
}
