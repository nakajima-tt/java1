package Java1;

public class Java_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNum=7;
		String[]week={"月","火","水","木","金","土","日"};
		String[]days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		for(int num=0;num<maxNum;num++)
			System.out.println(week[num]+"曜日は英語で"+days[num]+"です");
		
	}

}
