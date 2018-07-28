package lil.lambda.action;

import lil.lambda.bean.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 描述:
 * 若是想要对会员的某些属性直接进行操作, 需要做什么呢
 * 比如说，我想要直接操作会员的邮件地址，把会员的邮件地址打印出来
 * 需要用到的函数式接口: Function 有一个抽象方法: R apply(T t);
 * R: 返回值
 *
 * @author lil
 * @create 2018-07-28 下午10:55
 */
public class MethodEight {
    public static void processPersonsWithFunction(List<Person> roster,
                                                  Predicate<Person> tester,
                                                  Function<Person, String> mapper,
                                                  Consumer<String> block) {

        for (Person person : roster) {
            if (tester.test(person)) {
                String data = mapper.apply(person);
                block.accept(data);
            }
        }
    }

    /**
     * 这样就完成了对合格会员的邮件提取
     * 新需求: 把符合条件的应用会员转化为会员的邮件地址
     */
    public static void processPersons() {
        List<Person> roster = new ArrayList<>();
        processPersonsWithFunction(roster, person -> person.getGender() == Person.Sex.MALE &&
                        person.getAge() >= 18 && person.getAge() <= 25, person -> person.getEmail(),
                email -> System.out.println(email));
    }
}
