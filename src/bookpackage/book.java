package bookpackage;

public class book {
    private String no;
    private String name;
    private String author;
    private String publication;
    private float price;
    private static int initNnm;

    static {
        initNnm = 0;
    }

    public book(String name) {
        initNnm++;
        no = "" + initNnm;
        this.name = name;
    }

    public book() {
        this(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getNo() {
        return no;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString(){
        return no+"-"+name+"-"+author+"-"+publication+"-"+price;
    }
}
