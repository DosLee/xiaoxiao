package lil.lambda.action;

import lil.lambda.bean.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 描述:
 * 让所有功能都使用Lambda表达式
 *
 * @author lil
 * @create 2018-07-28 下午10:38
 */
public class MethodSeven {
    /**
     * 该函数式接口的抽象方法需要一个参数并且没有返回值, Consumer正好符合条件
     */
    public static void processPerson(List<Person> roster, Predicate<Person> tester,
                                     Consumer<Person> block) {
        for (Person person : roster) {
            if (tester.test(person)) {
                block.accept(person);
            }
        }
    }

    /**
     * 调用方法, 实现方法. 注意第三个参数∑
     */
    public static void printPersons() {
        List<Person> roster = new ArrayList<>();
        processPerson(roster, person -> person.getGender() == Person.Sex.MALE &&
                person.getAge() >= 18 && person.getAge() <= 25, new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                person.printPerson();
            }
        });
    }
}
