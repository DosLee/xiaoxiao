package lil.lambda.action;

import lil.lambda.bean.Person;

import java.util.ArrayList;
import java.util.List;

import static lil.lambda.action.MethodThree.printPersons;

/**
 * 描述:
 * 匿名内部类
 *
 * @author lil
 * @create 2018-07-27 下午11:14
 */
public class MethodFive {
    /**
     * 有效的减少了代码量
     * Lambda 表达式省略了“ new 接口, 一对小括号, 一对大括号”,
     * “抽象方法声明的前部分”的代码，
     * 即省略了“new CheckPerson(){...} ”,
     * “public boolean test ”，只剩下抽象方法声明的后部分，
     * 小括号以及小括号里面的方法参数类型和参数名字，即“(Person p) ”。
     */
    public static void printPersonsAnonymous() {
        List<Person> roster = new ArrayList<>();
        printPersons(roster, person -> person.getGender() == Person.Sex.MALE && person.getAge() >= 18 &&
                person.getAge() <= 25);
    }
}
