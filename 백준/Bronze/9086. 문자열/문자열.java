import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0; i<count; i++){
            String letter = sc.next();
            System.out.print(letter.charAt(0));
            System.out.println(letter.charAt(letter.length()-1));
        }
    }
}