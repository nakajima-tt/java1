package Java1;

import java.util.Random;
import java.util.Scanner;

public class Java_jannkenn {

	public static void main(String[] args) {
		// �����_���ƃX�L���i�[�̏���
		Random ran  = new Random();
		Scanner sc = new Scanner(System.in);
		//�錾
		System.out.println("�����E����E�ۂ�I");
		//����񂯂�̎�
		String[] hands = {"�O�[", "�`���L", "�p�["};
		int y = 0;
		int x = 0;
        //�R���\�[���ɓ��͂��ăX�L���i�[
		System.out.println("�����o���H\n0�F�O�[�@1�F�`���L�@2�F�p�[");
        
		//�����̎�
		x= sc.nextInt();
		System.out.println("�����F" + hands[x]);
		//����̎�
		y= ran.nextInt(3);
		System.out.println("����F" + hands[y]);
		
		//�������̏ꍇ
		if(x==0 && y==0 || x==1 && y==1 || x==2 && y==2) {
			System.out.println("�������I");
		//�����̏ꍇ	
		}else if(x==0 && y==1 || x==1 && y==2 || x==2 && y==0) {
			System.out.println("�M���̏����I");
		//�����̏ꍇ
		}else if(x==0 && y==2 || x==1 && y==0 || x==2 && y==1){
			System.out.println("�M���̕����I");
        }
	  
	}
}
