import java.util.StringTokenizer;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Sentence = sc.nextLine();
        
        StringTokenizer Ans = new StringTokenizer(Sentence," ");
		System.out.println(Ans.countTokens());
    }
}