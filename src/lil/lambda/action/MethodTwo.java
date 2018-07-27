package lil.lambda.action;

import lil.lambda.bean.Person;

import java.util.List;

/**
 * 描述:
 * 方法二
 * 创建一个适应性更好的方法
 *
 * @author lil
 * @create 2018-07-27 下午10:34
 */
public class MethodTwo {
    public static void printPersonsWithinAgeRange(List<Person> roster,
                                                  int low, int high) {
        /**
         * 缺点是如果把Bean类型改了, 这个方法就不满足了.
         */
        for (Person person : roster) {
            if (low <= person.getAge() && person.getAge() < high) {
                person.printPerson();
            }
        }
    }
}
