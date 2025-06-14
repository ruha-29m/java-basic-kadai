package kadai_021;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary_Chapter21 {
   public static void main(String[] args) {
	   
	  
	   HashMap<String,String> Dictionary = new HashMap<String,String>();
	  // 辞書に単語を追加
      Dictionary.put("apple","りんご");
      Dictionary.put("peach","桃");
      Dictionary.put("banana","バナナ");
      Dictionary.put("lemon","レモン");
      Dictionary.put("pear","梨");
      Dictionary.put("kiwi","キウィ");
      Dictionary.put("strawberry","いちご");
      Dictionary.put("grape","ぶどう");
      Dictionary.put("muscat","マスカット");
      Dictionary.put("cherry","さくらんぼ");
	   }
      
      Scanner scanner = new Scanner(System.in);{
      
      while (true) {
    	  System.out.println("調べる英単語を入力してください(終了するには'quit'を入力)：");
      String input = scanner.nextLine();
      
      if (input.equalsIgnoreCase("quit")) {
    	  break;
      }
      
      if (Dictionary.containsKey(input)) {
      System.out.println(input + "は「" +  Dictionary.get(input) + "」です。");
      } else {
    	  System.out.println(input +  "は辞書に存在しません。");
      }
   }
      scanner.close();
      
      }
}

