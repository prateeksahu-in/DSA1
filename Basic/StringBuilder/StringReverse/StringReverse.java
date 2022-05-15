import java.util.*;


public class StringReverse{
	public static void main(String args[]){

		String s = new String("hello");
        char temp;
        StringBuilder string = new StringBuilder(s);
		for(int i =0 ;i<s.length()/2;i++)
		{
		    //System.out.println(s.length()-i-1);
            temp = s.charAt(s.length()-i-1);
            string.setCharAt((string.length())-i-1,string.charAt(i));
            string.setCharAt(i,temp);
		}
		
		System.out.println(string);

	}


}