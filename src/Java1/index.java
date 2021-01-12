package Java1;

public class index {

	public static void main(String[] args) {
		// Javaの変数定義と出力の練習
		System.out.println("はじめまして！Javaです！");
		String name = "Java";
		int age = 26;
		double height =1.8;
		double weight =65.1;
		double bmi =weight/(height*2);
		
		System.out.println("名前は"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"mです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("bmiは"+bmi+"です");
		
		if(bmi>25) {
			System.out.println("肥満");
		}else if(bmi>=18.5 && bmi<=25){
			System.out.println("標準");
		}else {
			System.out.println("低体重");
		}
		
	}

}
