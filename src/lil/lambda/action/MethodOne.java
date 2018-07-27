package lil.lambda.action;

import lil.lambda.bean.Person;

import java.util.List;

/**
 * 描述:
 * 方法一
 * 创建方法, 寻找符合条件的会员, 但方法指定条件是硬编码
 *
 * @author lil
 * @create 2018-07-27 下午10:28
 */
public class MethodOne {

    /**
     * 只能匹配一种条件, 如果需求变了, 需要再写一个方法
     * @param roster
     *      全部会员
     * @param age
     *      年龄
     */
    public static void printPersonOldrThan(List<Person> roster, int age) {
        for (Person person : roster) {
            if (person.getAge() >= age) {
                person.printPerson();
            }
        }
    }
}
