package Java1;

import java.util.Random;
import java.util.Scanner;

public class Java_ran {

	public static void main(String[] args) {
		//ランダムクラスとスキャナークラスの新規作成
		Random o=new Random();
		Scanner name= new Scanner(System.in);
		//配列の定義
		String[] tennki= {"晴れ","雨","くもり","雪"};
		//都市を入力してくださいを出力
		System.out.println("お住いの都市を入力してください");
		//コンソールに都市入力でスキャナーする
		String input_city_name=name.nextLine();
		//配列をランダムで選ぶ
		String weather =tennki[o.nextInt(4)];
		//結果を出力
		System.out.println(input_city_name+"の今日の天気は"+weather);
	}

}
