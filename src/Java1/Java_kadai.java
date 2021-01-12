package Java1;

import java.util.Random;
import java.util.Scanner;

public class Java_kadai {

	public static void main(String[] args) {
		//大吉から凶までの配列
		String[]lucks= {"大吉","吉","中吉","小吉","末吉","凶"};
		//ランダムクラスとスキャナークラスの新規作成
		Random o=new Random();
		Scanner name= new Scanner(System.in);
		//あなたのお名前はと出力
		System.out.println("あなたのお名前は");
		//コンソールに名前を入力したらスキャナーする
		String input_name=name.nextLine();
		//おみくじの配列をランダムで選ぶ
		String luck =lucks[o.nextInt(6)];
		//ランダムの結果
		System.out.println(input_name+ "　今日のおみくじ"+luck);
	}

}
