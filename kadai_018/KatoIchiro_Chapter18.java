// 加藤一郎を表す子クラス

package text.kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	// 名を表すフィールドの値をセットする
	public void setGivenName() {
		givenName = "一郎";
	}
	
	// 抽象メソッドの実装
		public void eachlntroduce() {
			System.out.println("好きな食べ物はリンゴです");
	}
}
