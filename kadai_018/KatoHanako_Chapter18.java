// 加藤花子を表す子クラス

package text.kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	// 名を表すフィールドの値をセットする
		public void setGivenName() {
			givenName = "花子";
		}
		
		// 抽象メソッドの実装
			public void eachlntroduce() {
				System.out.println("趣味は読書です");
		}
}
