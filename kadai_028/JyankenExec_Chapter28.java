package kadai_028;



public class JyankenExec_Chapter28 {
	

	public static void main(String[] args) {// ゲームのインスタンスを作成
		Jyanken_Chapter28 game = new Jyanken_Chapter28();//メインメソッド内に変数名を入れる
		

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		String playerHand = game.getMyChoice();
		game.playGame(playerHand);
	}
}
