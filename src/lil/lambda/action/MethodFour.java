package lil.lambda.action;

import lil.lambda.bean.Person;
import lil.lambda.inteface.CheckPerson;

import java.util.ArrayList;
import java.util.List;

import static lil.lambda.action.MethodThree.printPersons;

/**
 * 描述:
 * 使用匿名内部类实现需求
 * @author lil
 * @create 2018-07-27 下午11:32
 */
public class MethodFour {

    /**
     *使用了匿名内部类, 不用维护一个或多个实现类
     */
    public static void printPersonByAnonymity() {
        List<Person> roster = new ArrayList<>();
        printPersons(roster, new CheckPerson() {
            @Override
            public boolean test(Person person) {
                return person.getGender() == Person.Sex.FEMAL &&
                        person.getAge() >= 18 && person.getAge() <= 25;
            }
        });
    }
}
