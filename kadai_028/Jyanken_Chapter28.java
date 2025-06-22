package kadai_028;

import java.util.HashMap;
import java.util.Random; // コンピュータの手のために追加
import java.util.Scanner; // ユーザー入力のために追加

public class Jyanken_Chapter28 {//class

	private HashMap<String, String> Jyanken = new HashMap<>();// 勝敗判定用のHashMapをクラスのフィールドとして定義
	private HashMap<String, String> handNames = new HashMap<>();
	private Scanner scanner; // Scannerをフィールドとして定義

	public Jyanken_Chapter28() {
		Jyanken.put("r", "s");// グーはチョキに勝つ
		Jyanken.put("s", "p");// チョキはパーに勝つ
		Jyanken.put("p", "r");// パーはグーに勝つ
		
		handNames.put("r", "グー");
		handNames.put("s", "チョキ");
		handNames.put("p", "パー");
		
		
		scanner = new Scanner(System.in);
	}

	

	public String getMyChoice() {//	自分のじゃんけんの手を入力する
		String playerInput = scanner.next();//入力した内容を取得する
		if (handNames.containsKey(playerInput)){
			return playerInput;
		} else {
			System.out.println("無効な入力です");
			return getMyChoice();
		}
	}

	public void playGame(String playerHand) { //じゃんけんを行う
		Random random = new Random();
		String[] handsForComputer = { "r", "s", "p" };// コンピュータがランダムに選ぶための手
		String computerHand = handsForComputer[random.nextInt(handsForComputer.length)];

		
		System.out.println("自分の手は" + handNames.get(playerHand) + "," + "対戦相手の手は" + handNames.get(computerHand));
		
		if (playerHand.equals(computerHand)) {
			System.out.println("あいこ！");
		} else if (Jyanken.get(playerHand) .equals(computerHand)) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("あなたの負けです");
		}
	}

}
