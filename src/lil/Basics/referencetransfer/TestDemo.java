package lil.Basics.referencetransfer;

/**
 * 描述:
 * 引用传递
 *
 * @author lil
 * @create 2018-08-12 16:15
 */
class Message {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Message msg = new Message();
        msg.setNum(100);
        fun(msg);
        System.out.println(msg.getNum());
    }

    public static void fun(Message temp) {
        temp.setNum(30);
    }
}
