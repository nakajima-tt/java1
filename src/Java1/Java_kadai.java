package Java1;

import java.util.Random;
import java.util.Scanner;

public class Java_kadai {

	public static void main(String[] args) {
		//��g���狥�܂ł̔z��
		String[]lucks= {"��g","�g","���g","���g","���g","��"};
		//�����_���N���X�ƃX�L���i�[�N���X�̐V�K�쐬
		Random o=new Random();
		Scanner name= new Scanner(System.in);
		//���Ȃ��̂����O�͂Əo��
		System.out.println("���Ȃ��̂����O��");
		//�R���\�[���ɖ��O����͂�����X�L���i�[����
		String input_name=name.nextLine();
		//���݂����̔z��������_���őI��
		String luck =lucks[o.nextInt(6)];
		//�����_���̌���
		System.out.println(input_name+ "�@�����̂��݂���"+luck);
	}

}
