import java.util.*;

public class Factorial{

	public static void printFactorial(int n){
		
		int result=1;	
		for(int i = n;i>=1;i--)
		{
			result = result * i;
		}
		System.out.print(result);	
		return;
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printFactorial(num);
			
	}

}