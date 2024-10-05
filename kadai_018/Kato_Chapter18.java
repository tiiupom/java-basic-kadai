// 親クラス

package text.kadai_018;

// 抽象メソッドを含むため先頭に「abstract」を付ける
abstract public class Kato_Chapter18 {

	// フィールドの作成
	String familyName;
	String givenName;
	String address;
	
	public void setGivenName() {
	}
	
	// 共通の紹介を出力するメソッド
	public void commonlntroduce() {
		familyName = "加藤";
		address = "東京都中野区〇×";
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	/* 個別の紹介を出力するメソッド
	 * 抽象メソッドにするため、先頭に「abstract」を付ける　*/
	abstract public void eachlntroduce();
	
	// 各紹介メソッドを実行
	public void execlntroduce() {
		commonlntroduce();
		eachlntroduce();
	}

}
