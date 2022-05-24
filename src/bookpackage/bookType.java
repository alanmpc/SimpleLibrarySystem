package bookpackage;

import java.util.ArrayList;

public class bookType {
    private String catory;
    private ArrayList<book> member;

    public bookType(book b) {
        catory = b.getName();
        if (member == null) {
            member = new ArrayList<book>();
            member.add(b);
        }
    }

    public String getCatory() {
        return catory;
    }

    public void setCatory(String catory) {
        this.catory = catory;
    }

    public void add(book b) {
        member.add(b);
    }

    public String toString() {
        int num = member.size();
        StringBuffer sb = new StringBuffer();
        sb.append("书名：" + catory + ";共" + num + "个元素，分别是：\n");
        for (int i = 0; i < num; i++) {
            sb.append(member.get(i).getNo() + " ");
        }
        return sb.toString();
    }
}
