package Java1;

public class Java_tesuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kokugo=40;
		int suugaku=40;
		//���ꂪ40�����܂��͐��w��40�_�����y��Ȗڂł�40�_����������Βǎ��z
		if(kokugo<40 || suugaku<40 ) {
			System.out.println("�ǎ�");
		//����Ɛ��w�����v��100�_�����ł���Βǎ�
		}else if(kokugo+suugaku<100){
			System.out.println("�ǎ�");
			//���v�_��139�_����100�_�܂ł���
		}else if(kokugo+suugaku>=100 && kokugo+suugaku<140){
			System.out.println("��");
			//���v�_��140�_����160�_��������
		}else if(kokugo+suugaku>=140 && kokugo+suugaku<160) {
			System.out.println("��");
			//���v�_��160�_�ȏオ�D
		}else if(kokugo+suugaku>=160){
			System.out.println("�D");
		}
		
		

	}

}
