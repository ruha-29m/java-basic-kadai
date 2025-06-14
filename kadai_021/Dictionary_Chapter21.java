package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {//クラス


	// 辞書に単語を追加
		HashMap<String, String> dictionary = new HashMap<>();{

		//10通りの英単語と意味
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

		//調べる単語,配列
		String[] wordArray = { "apple", "banana", "grape", "orange" };

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
