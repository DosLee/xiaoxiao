package lil.lambda.action;

import lil.lambda.bean.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 描述:
 * 使用泛型, 进一步提高方法的适应性
 *      使用Iterable代理List
 *
 * @author lil
 * @create 2018-07-29 下午4:02
 */
public class MethodNine {

    /**
     * 方法体的逻辑中，和参数的实际类型联系并都不密切
     * 我们知道集合 List 是集合大家庭的一员，集合都是直接或间接实现了接口 Iterable，
     * 所以，我们可以使用 Iterable 类替代 List
     */
    public static <X, Y> void processElements(Iterable<X> source,
                                             Predicate<X> tester,
                                             Function<X, Y> mapper,
                                             Consumer<Y> block) {
        for (X persons : source) {
            if (tester.test(persons)) {
                Y data = mapper.apply(persons);
                block.accept(data);
            }
        }
    }

    /**
     * 集合数据源->资源对象->已筛选对象->已映射对象->操作
     */
    public static void processElementsEnther() {
        List<Person> roster = new ArrayList<>();
        processElements(roster, person -> person.getGender() == Person.Sex.MALE &&
                person.getAge() >= 18 && person.getAge() <=25, person -> person.getEmail(),
                email -> System.out.print(email));
    }
}
