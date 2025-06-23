package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {//クラス
	
	private HashMap<String, String> dictionary = new HashMap<>();

	
	public Dictionary_Chapter21() {
	
		//10通りの英単語と意味を追加
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
		//調べる単語,配列
		public void referer(String[] wordArray) {
		for (String word : wordArray) {
			if (dictionary.containsKey(word)) {
				String meaning = dictionary.get(word);
				System.out.println(word + "の意味は" + meaning);
			} else {
				// キーが存在しない場合
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}
