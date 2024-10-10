package text.kadai_021;


public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
	
	// 辞書クラスのインスタンスを作成
	Dictionary_Chapter21 Dictionary = new Dictionary_Chapter21();
	
	// 辞書に単語を追加
	Dictionary.wordPut();
	
	// 調べる単語を配列にセット
	String[] wordArray = {"apple", "banana", "grape", "orange"};
	
		// 辞書を調べる
		for(String word:wordArray) {
			Dictionary.setSearchWord(word);
			Dictionary.search();
		
		}
	
	}
}
