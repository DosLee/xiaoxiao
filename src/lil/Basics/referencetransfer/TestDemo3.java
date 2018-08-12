package lil.Basics.referencetransfer;

/**
 * 描述:
 * 引用地址传递
 *
 * @author lil
 * @create 2018-08-12 17:25
 */
class Messages {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Messages msg = new Messages();
        msg.setNote("hello");
        fun(msg);
        System.out.println(msg.getNote());
    }

    private static void fun(Messages msg) {
        msg.setNote("world");
    }
}
