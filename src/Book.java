public class Book {
    //フィールド
    private String title;
    private String genre;
    private String author;
    private int id;
    private boolean borrow = false;

    //コンストラクタ
    public Book(
    String title, String genre, String author, int id) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.id = id;
    }

    //ゲットメソッド
    public String gettitle(){
        return this.title;
    }

    public String getgenre(){
        return this.genre;
    }

    public String getauthor(){
        return this.author;
    }

    public int getid(){
        return this.id;
    }

    public boolean getborrow(){
        return this.borrow;
    }

    public void setborrow(boolean borrow){
        this.borrow = borrow;
    }
}
