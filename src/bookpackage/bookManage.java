package bookpackage;

import java.util.*;

public class bookManage {
    private ArrayList<bookType> booklist;

    public bookManage() {
        if (booklist == null) {
            booklist = new ArrayList<bookType>();
        }
    }

    public bookType searchByName(String name) {
        bookType find = null;
        if (booklist != null) {
            for (int i = 0; i < booklist.size(); i++) {
                bookType temp = booklist.get(i);
                if (temp.getCatory().equals(name)) {
                    find = temp;
                    break;
                }
            }
        }
        return find;
    }

    public void addBooks(book b) {
        if (booklist != null & booklist.size() != 0) {
            String name = b.getName();
            bookType temp = this.searchByName(name);
            if (temp != null) {
                temp.add(b);
            } else {
                bookType added = new bookType(b);
                booklist.add(added);
            }
        } else if (booklist==null) {
            System.out.println("列表为空添加失败");
        } else if (booklist.size()==0) {
            bookType added = new bookType(b);
            booklist.add(added);
        }
    }

    public void addBooks(ArrayList<book> b){
        Iterator<book> it =b.iterator();
        while(it.hasNext()){
            this.addBooks(it.next());
        }
    }

    public void show(){
        Object[] result=booklist.toArray();
        for (int i = 0; i < result.length; i++) {
            if(result[i] instanceof bookType){
                bookType bb=(bookType)result[i];
                System.out.println(bb);
            }
        }
    }
}
