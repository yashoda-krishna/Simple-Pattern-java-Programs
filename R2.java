package pack1;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				char c=(char)('A'+j);
				System.out.print(c);
			}
			System.out.println();
		}
		//FEDCBA
		//FEDCB
		//FEDC
		//FED
		//FE
		//F	

	}

}
