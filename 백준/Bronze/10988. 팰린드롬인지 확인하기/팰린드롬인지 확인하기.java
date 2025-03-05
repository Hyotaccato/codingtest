import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int len = word.length();
        boolean palin = true;
        for(int i=0; i<len/2; i++){
            if(word.charAt(i) != word.charAt(len - i - 1)){
                palin = false;
                break;
            }    
        }
        System.out.println(palin ? "1":"0");
        sc.close();
    }
}