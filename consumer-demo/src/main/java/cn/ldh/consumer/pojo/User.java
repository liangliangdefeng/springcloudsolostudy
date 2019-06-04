package cn.ldh.consumer.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @date 2019/6/2 9:08
 */
@Data
public class User {

    private Long id;

    //姓名
    private String name;

    //密码
    private String password;

    //年龄
    private Integer age;

    //性别1男，2女
    private Integer sex;

    //出生日期
    private Date birthday;

    //创建日期
    private Date created;

    //更新日期
    private Date updated;

    private String remark;
}