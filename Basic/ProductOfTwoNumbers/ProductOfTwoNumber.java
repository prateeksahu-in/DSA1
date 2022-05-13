import java.util.*;

public class ProductOfTwoNumber{
	public static int calculateProduct(int num1,int num2){
	
		return num1*num2;
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int product = calculateProduct(num1,num2);

		System.out.print("Product = " + product);
	}

}