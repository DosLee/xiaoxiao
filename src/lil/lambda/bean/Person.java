package lil.lambda.bean;

import lombok.Data;

import java.time.LocalDate;

/**
 * 描述:
 * 会员实体类
 *
 * @author lil
 * @create 2018-07-27 下午10:24
 */

@Data
public class Person {
    /* 性别枚举 */
    public enum Sex {
        MALE, FEMAL
    }
    /* 姓名 */
    private String name;
    /* 生日 */
    private LocalDate birthday;
    /* 性别 */
    private Sex gender;
    /* 邮箱 */
    private String email;
    /* 年龄 */
    private int age;

    public void printPerson() {
        // 打印会员信息
    }
}
