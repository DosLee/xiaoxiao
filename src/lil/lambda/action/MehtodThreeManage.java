package lil.lambda.action;

import lil.lambda.bean.Person;
import lil.lambda.inteface.CheckPerson;

/**
 * 描述:
 * 接口实现类
 *
 * @author lil
 * @create 2018-07-27 下午11:07
 */
public class MehtodThreeManage implements CheckPerson {

    @Override
    public boolean test(Person person) {
        return person.getGender() == Person.Sex.MALE && person.getAge() >=18 &&
                person.getAge() <= 25;
    }
}
