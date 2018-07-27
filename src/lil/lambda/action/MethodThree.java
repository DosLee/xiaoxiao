package lil.lambda.action;

import lil.lambda.bean.Person;
import lil.lambda.inteface.CheckPerson;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 在独立的类中定义条件
 *
 * @author lil
 * @create 2018-07-27 下午11:05
 */
public class MethodThree {

    /**
     * 方法参数里用了一个接口类型作为参数之一
     * @param roster
     *      全部会员
     * @param tests
     *      接口类型
     */
    public static void printPersons(List<Person> roster, CheckPerson tests) {
        for (Person person : roster) {
            if (tests.test(person)) {
                person.printPerson();
            }
        }
    }

    /**
     * 看起来不是那么易碎了, 但是后期还得多维护一个接口, 一个实现类
     */
    public static void byImpl() {
        List<Person> roster = new ArrayList<>();
        printPersons(roster, new MehtodThreeManage());
    }
}
