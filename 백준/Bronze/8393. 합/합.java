import java.util.Scanner;

public class Main{
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a = 1;
            int sum = 0;
            int arr[] = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = a;
                a++;
                sum += arr[i];
            }
            sc.close();
            System.out.print(sum);
        }
}