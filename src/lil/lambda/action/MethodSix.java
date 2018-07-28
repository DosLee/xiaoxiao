package lil.lambda.action;

import lil.lambda.bean.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/**
 * 描述:
 * Predicate方法
 *
 * @author lil
 * @create 2018-07-28 下午4:54
 */
public class MethodSix {
    /**
     * 使用JDK自带的predicate函数式接口, 替代自己定义的接口
     */
    public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }

    /**
     * 省略了自定义的函数式接口CheckPerson
     */
    public static void printPersonsTest() {
        List<Person> roster = new ArrayList<>();
        printPersonsWithPredicate(roster, person -> person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18 && person.getAge() <= 25);
    }
}
