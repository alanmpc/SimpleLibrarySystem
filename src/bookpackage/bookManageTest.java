package bookpackage;

import java.util.ArrayList;

public class bookManageTest {
    public static void main(String[] args) {
        bookManage obj = new bookManage();

        book b1 = new book();
        b1.setName("Java�������");
        obj.addBooks(b1);

        book b2 = new book("C�������");
        obj.addBooks(b2);

        System.out.println("��һ�������Ϣ");
        obj.show();

        book b3 = new book("Java���������");
        book b4 = new book("Java���������");
        book b5 = new book("Java���������");
        book b6 = new book("Java���������");
        book b7 = new book("DataBase");
        book b8 = new book("����ϵͳ");

        ArrayList<book> list = new ArrayList<book>();

        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);

        obj.addBooks(list);

        System.out.println("�ڶ��������Ϣ��");
        obj.show();
    }
}
