package Java2;

public class Java_method_bmi {

	public static void main(String[] args) {
		//���O�̕ϐ���`
		String name ="Java";
		//BMI�̖߂�l
		double bmi = bmi(65.1,1.8);
		//����̖߂�l
		String kekka = hantei(bmi);
		
		//���O���o��
		System.out.println("���O:"+name);
		//BMI���o��
		System.out.println("BMI:"+bmi);
		//BMI�̔��茋�ʂ��o��
		System.out.println("BMI����̔���:"+kekka);
	}
	
	public static double bmi(double weight, double height) {
		//BMI���v�Z���ĕԂ�
		return weight/(height*2);
	}
	
	public static String hantei(double bmi) {
		//BMI�̔��茋�ʂ�Ԃ�
		if(bmi>25) {
			return "�얞";	
		}else if(bmi>=18.5 && bmi<=25){
			return "�W��";
		}else {
			return "��̏d";
		}
		
	}
	
}
