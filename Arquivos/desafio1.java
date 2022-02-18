import java.util.Scanner;
public class Main {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int q = 0;
		
		System.out.print("n = ");
		q = s.nextInt();

		for(int i=0, k=1; i < q; ++i, ++k){
			for(int j=0; j < k; ++j)
				System.out.print("*");
			System.out.println("");
		}
	}
}
