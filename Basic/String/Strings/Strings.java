import java.util.Scanner;

class Strings {
    public static void main(String[] args) {
        
        String name = "Prateek";
        System.out.println(name);
        
        Scanner sc = new Scanner(System.in);
        
        name = sc.nextLine();
        System.out.print(name);
	
        System.out.print(name.length());
        System.out.print(name.charAt(0));
    }
}