package Java1;

public class Java_tesuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kokugo=40;
		int suugaku=40;
		//国語が40未満または数学が40点未満【一科目でも40点未満があれば追試】
		if(kokugo<40 || suugaku<40 ) {
			System.out.println("追試");
		//国語と数学が合計が100点未満であれば追試
		}else if(kokugo+suugaku<100){
			System.out.println("追試");
			//合計点が139点から100点までが可
		}else if(kokugo+suugaku>=100 && kokugo+suugaku<140){
			System.out.println("可");
			//合計点が140点から160点未満が良
		}else if(kokugo+suugaku>=140 && kokugo+suugaku<160) {
			System.out.println("良");
			//合計点が160点以上が優
		}else if(kokugo+suugaku>=160){
			System.out.println("優");
		}
		
		

	}

}
