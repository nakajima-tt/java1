package Java1;

public class index {

	public static void main(String[] args) {
		// Java�̕ϐ���`�Əo�̗͂��K
		System.out.println("�͂��߂܂��āIJava�ł��I");
		String name = "Java";
		int age = 26;
		double height =1.8;
		double weight =65.1;
		double bmi =weight/(height*2);
		
		System.out.println("���O��"+name+"�ł�");
		System.out.println("�N���"+age+"�΂ł�");
		System.out.println("�g����"+height+"m�ł�");
		System.out.println("�̏d��"+weight+"kg�ł�");
		System.out.println("bmi��"+bmi+"�ł�");
		
		if(bmi>25) {
			System.out.println("�얞");
		}else if(bmi>=18.5 && bmi<=25){
			System.out.println("�W��");
		}else {
			System.out.println("��̏d");
		}
		
	}

}
