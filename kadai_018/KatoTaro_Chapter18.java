// 加藤太郎を表す子クラス

package text.kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	// 名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	// 抽象メソッドの実装
		public void eachlntroduce() {
			System.out.println("私はJavaが得意です");
	}
}
