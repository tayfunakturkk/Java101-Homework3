package Loops.Homework3;
import java.util.Scanner;

public class LoopsHomework3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the number of digits:");
            int numberOfDigts=input.nextInt();

            for(int i=1;i<=numberOfDigts;i++){
                for(int k=0;k<(i-1);k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*numberOfDigts-(2*i-1));j++){
                    System.out.print("*");
            
                }
                System.out.println(" ");
   }
    }
    }
}
