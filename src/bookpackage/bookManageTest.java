package bookpackage;

import java.util.ArrayList;

public class bookManageTest {
    public static void main(String[] args) {
        bookManage obj = new bookManage();

        book b1 = new book();
        b1.setName("Java程序设计");
        obj.addBooks(b1);

        book b2 = new book("C程序设计");
        obj.addBooks(b2);

        System.out.println("第一次输出信息");
        obj.show();

        book b3 = new book("Java面向对象技术");
        book b4 = new book("Java面向对象技术");
        book b5 = new book("Java面向对象技术");
        book b6 = new book("Java面向对象技术");
        book b7 = new book("DataBase");
        book b8 = new book("操作系统");

        ArrayList<book> list = new ArrayList<book>();

        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);

        obj.addBooks(list);

        System.out.println("第二次输出信息：");
        obj.show();
    }
}
