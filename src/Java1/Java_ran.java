package Java1;

import java.util.Random;
import java.util.Scanner;

public class Java_ran {

	public static void main(String[] args) {
		//�����_���N���X�ƃX�L���i�[�N���X�̐V�K�쐬
		Random o=new Random();
		Scanner name= new Scanner(System.in);
		//�z��̒�`
		String[] tennki= {"����","�J","������","��"};
		//�s�s����͂��Ă����������o��
		System.out.println("���Z���̓s�s����͂��Ă�������");
		//�R���\�[���ɓs�s���͂ŃX�L���i�[����
		String input_city_name=name.nextLine();
		//�z��������_���őI��
		String weather =tennki[o.nextInt(4)];
		//���ʂ��o��
		System.out.println(input_city_name+"�̍����̓V�C��"+weather);
	}

}
