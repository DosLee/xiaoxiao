package lil.Basics.referencetransfer;

/**
 * 描述:
 * 引用传递
 *
 * @author lil
 * @create 2018-08-12 17:12
 */
public class TestDemo2 {
    public static void main(String[] args) {
        // 字符串常量一旦声明, 则不可改变,
        // 字符串对象的内容依靠的是地址的引用变更
        String str = "hello";
        fun(str);
    }

    private static void fun(String temp) {
        // 当赋予了temp新值,temp就会指向world,
        // 断开与hello的地址指向
        temp = "world";
    }
}
