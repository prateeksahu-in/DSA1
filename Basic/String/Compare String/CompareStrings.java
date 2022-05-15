import java.util.Scanner;

class CompareStrings {
    public static void main(String[] args) {
        
        String name1 = "Prateek";
        String name2 = "Prateek";
        
        //1 n1 > n2 : +ve value
        //2 n1 == n2: 0
        //3 n1 < n2 : -ve value
        
        if(name1.compareTo(name2) == 0){
            
            System.out.print("Strings are equal");
        }
    }
}