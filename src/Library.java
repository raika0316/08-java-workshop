import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Library {

    public void main(){

        Scanner scanner = new Scanner(new InputStreamReader(System.in,StandardCharsets.UTF_8));

        //ユーザー入力の画面表示
        System.out.println();
        System.out.println("====図書館管理システム====");
        System.out.println("1: 検索");
        System.out.println("2 貸出");
        System.out.println("3 返却");
        System.out.println("4 一覧表示");
        System.out.println("9 終了");
        System.out.println("========================");
        System.out.print("選択してください: ");
        String choice = scanner.nextLine();

        //入力確認
        if ("1".equals(choice)) {

        } else if ("2".equals(choice)) {

        }else if ("3".equals(choice)) {

        }else if ("4".equals(choice)) {

        }else if ("9".equals(choice)) {

        }else {
            System.out.println("1,2,3,4,9のいずれかを入力してください。");
        }

        scanner.close();
    }
}
