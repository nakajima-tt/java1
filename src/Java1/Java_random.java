package Java1;

import java.util.Random;

public class Java_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hands= {"グー","チョキ","パー"};
		Random r = new Random();
		String hand = hands[r.nextInt(3)];
		System.out.println(hand);
		
	}

}
