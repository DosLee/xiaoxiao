package lil.lambda.action;

import lil.lambda.bean.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 描述:
 * 能不能都交给JDK来进行操作呢
 * 使用聚合操作
 *
 * @author lil
 * @create 2018-07-29 下午6:33
 */
public class MethodTen {

    /**
     * stream: 参数 Collection source 作为数据源，返回一个有序流
     *         能够自动遍历source的元素, 并对元素执行各种操作
     *
     * filter: 对有序流的元素(资源对象)使用断言进行筛选，返回一个新的有序流
     *
     * map: 对已筛选元素（已筛选对象）执行转化操作，返回一个新的有序流，
     *      新有序流中的元素是经过转化的元素（已映射对象）
     *
     * forEach: 对已转化的元素（已映射对象）执行一个操作，
     *      该方法没有返回值，不再有新的有序流产生，流结束了，方法 foreach 是个终止操作。
     *
     * 比如 filter -> map -> forEach ，你会发现他们一环扣一环，
     *      就像是一条流水线，故称为管道，即流操作序列。
     */

    public static <X, Y> void processWithAggregate(
            Collection<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block) {

     source.stream().filter(tester).map(mapper).forEach(block);

    }

    public static void PrintPersons() {
        List<Person> roster = new ArrayList<>();
        processWithAggregate(roster,
                person -> person.getGender() == Person.Sex.MALE &&
                person.getAge() >= 18 && person.getAge() <= 25,
                person -> person.getEmail(),
                email -> System.out.print(email));
    }
}
