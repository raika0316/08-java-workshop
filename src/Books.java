import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<Book> bookList;

    //コンストラクタ
    public Books() {

        //レコードリストの初期化
        this.bookList = new ArrayList<Book>();
    }

    //記録を追加
    public void addBook(Book book) {

        //レコードの追加
        this.bookList.add(book);
    }

    //全記録の取得
    public List<Book> getBooks() {

        //コードリストを返却
        return this.bookList;
    }


}

