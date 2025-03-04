import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] sample = {1,1,2,2,2,8};
        int[] answer = new int[6];
        int[] chess = new int[6];
        for(int i=0; i<6; i++){
            chess[i] = sc.nextInt();
            if(sample[i]==chess[i]){
                answer[i] = 0;
            }
            else{
                answer[i]=sample[i]-chess[i];
            }
        }
        for(int i = 0; i<6; i++){
            System.out.print(answer[i]+" ");
        }
        sc.close();
    }
}