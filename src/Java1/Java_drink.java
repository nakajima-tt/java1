package Java1;

public class Java_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int drink=160;
		
		if(drink==160) {
			System.out.println("ドリンクを購入できました【お釣りなし】");
		}else if(drink>160) {
			System.out.println("ドリンクが購入できました【お釣りあり】");
		}else {
			System.out.println("金額が足りません");
		}

	}

}
