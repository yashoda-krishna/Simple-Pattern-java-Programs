package pack1;

public class R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=0;i--) {
			char c=(char)('A'+i);
			for(int j=0;j<=i;j++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}
	//FFFFFF
	//EEEEE
	//DDDD
	//CCC
	//BB
	//A

}
