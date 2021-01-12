package Java2;

public class Java_method_bmi {

	public static void main(String[] args) {
		//名前の変数定義
		String name ="Java";
		//BMIの戻り値
		double bmi = bmi(65.1,1.8);
		//判定の戻り値
		String kekka = hantei(bmi);
		
		//名前を出力
		System.out.println("名前:"+name);
		//BMIを出力
		System.out.println("BMI:"+bmi);
		//BMIの判定結果を出力
		System.out.println("BMIからの判定:"+kekka);
	}
	
	public static double bmi(double weight, double height) {
		//BMIを計算して返す
		return weight/(height*2);
	}
	
	public static String hantei(double bmi) {
		//BMIの判定結果を返す
		if(bmi>25) {
			return "肥満";	
		}else if(bmi>=18.5 && bmi<=25){
			return "標準";
		}else {
			return "低体重";
		}
		
	}
	
}
