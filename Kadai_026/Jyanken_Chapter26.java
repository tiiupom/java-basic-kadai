// じゃんけんクラス
package Kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	// 自分のじゃんけんの手を入力するメソッドの宣言
	public String getMyChoice() {

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockの r を入力しましょう");
		System.out.println("チョキはscissorsの s を入力しましょう");
		System.out.println("パーはpaperの p を入力しましょう");
		
		// Scannerクラスのオブジェクトを作成
		Scanner scanner = new Scanner(System.in);
		// 入力した内容を改行までを区切りとして取得
		String choice = scanner.nextLine();
		// 入力した内容が正しいじゃんけんの手であるか判定
		if( choice.equals("r") || choice.equals("s") || choice.equals("p") ) {
			System.out.println(choice);
		} else {
			System.out.println("正しく入力してください");
		}
		// Scannerクラスのオブジェクトをクローズせず、他のメソッドでも使えるようにする
		//scanner.close();いらない
		
		// String型の変数「input」の値を返す
		return choice;
	}

	// 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		// Randomクラスのインスタンスを生成
		Random random = new Random();
		// String型の配列「otherChoice」を作成し、箱に「r,s,p」を入れる
		String[] otherChoice = { "r", "s", "p" };
		// int型変数名「i」に、0から指定値未満の範囲の整数をランダムで生成するメソッドを代入
		int i = random.nextInt(3);
		// ランダムに生成された値から配列「otherChoice」の中の要素を参照し戻り値を返す
		return otherChoice[i];
		
	}

	// じゃんけんを行うメソッド
	public void playGame() {
		
		// 自分と対戦相手のじゃんけんの手を出力する値をHashMapで作成
		// HashMap　変数名「choice」を作成
		HashMap<String,String> choice = new HashMap<>();
		// choiceに要素を追加：キー、値
		choice.put("r","グー");
		choice.put("s", "チョキ");
		choice.put("p", "パー");
		
		// 自分のじゃんけんの手を入力するメソッドと、対戦相手のじゃんけんの手をランダムに出力するメソッドのフィールドの作成
		String my = getMyChoice();
		String random = getRandom();
		
		// 自分と対戦相手のじゃんけんの手を出力
		// それぞれのメソッドで出力された「r,s,p」いずれかをHashMapの変数名「choice」から取得して出力
		System.out.println("自分の手は" + choice.get(my) +"、対戦相手の手は" + choice.get(random));
		
		// 自分と対戦相手のじゃんけんの手を比較して結果を出力
		
		/* 自分のじゃんけんの手と対戦相手のじゃんけんの手を比較して等しければ「あいこ」を出力 
		 * 等しくない場合、3つの条件のいずれかに該当すれば「自分の勝ち」を出力
		   どの条件にも該当しなかった場合は「自分の負け」を出力 */
		if ( my.equals(getRandom())) {
			System.out.println("あいこです");
		}  else if ( (my.equals("r")) && (random.equals("s")) ||
					 (my.equals("s")) && (random.equals("p")) ||
					 (my.equals("p")) && (random.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
