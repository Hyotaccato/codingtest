import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int score = 0;
        int answer = 0;
        int arr[] = new int [T];
        
        for(int i = 0; i<T; i++){
           int A = sc.nextInt();
           int B = sc.nextInt(); 
           arr[i] = A+B;
           score++;
            }
        sc.close();
        for(int i = 0; i<score; i++){
            answer = arr[i];
            System.out.println(answer);
            }
        }  
    }