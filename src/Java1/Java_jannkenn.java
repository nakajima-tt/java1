package Java1;

import java.util.Random;
import java.util.Scanner;

public class Java_jannkenn {

	public static void main(String[] args) {
		// ランダムとスキャナーの準備
		Random ran  = new Random();
		Scanner sc = new Scanner(System.in);
		//宣言
		System.out.println("じゃん・けん・ぽん！");
		//じゃんけんの手
		String[] hands = {"グー", "チョキ", "パー"};
		int y = 0;
		int x = 0;
        //コンソールに入力してスキャナー
		System.out.println("何を出す？\n0：グー　1：チョキ　2：パー");
        
		//自分の手
		x= sc.nextInt();
		System.out.println("自分：" + hands[x]);
		//相手の手
		y= ran.nextInt(3);
		System.out.println("相手：" + hands[y]);
		
		//あいこの場合
		if(x==0 && y==0 || x==1 && y==1 || x==2 && y==2) {
			System.out.println("あいこ！");
		//勝ちの場合	
		}else if(x==0 && y==1 || x==1 && y==2 || x==2 && y==0) {
			System.out.println("貴方の勝ち！");
		//負けの場合
		}else if(x==0 && y==2 || x==1 && y==0 || x==2 && y==1){
			System.out.println("貴方の負け！");
        }
	  
	}
}
