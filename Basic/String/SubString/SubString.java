import java.util.Scanner;

class SubStrings{
    public static void main(String[] args) {
        
        String sentence = "My name is Prateek";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
        
        name = sentence.substring(0,2);
        System.out.println(name);
    }
}