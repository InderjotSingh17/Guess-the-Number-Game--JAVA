import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int myNumber=(int)(Math.random()*100);
            int userNumber=0;
            do{
                System.out.println("GUESS MY NUMBER");
                userNumber=sc.nextInt();
                if(userNumber==myNumber)
                {
                    System.out.println("WOHOOO ... CORRECT");
                    break;
                }
                else if(userNumber>myNumber)
                {
                    System.out.println("YOUR NUMBER IS TOO LARGE");
                }
                else 
                {
                    System.out.println("YOUR NUMBER IS TOO SMALL");
                }
            }while(userNumber>=0);
            System.out.println("MY NUMBER WAS :");
            System.out.println(myNumber);
        }
    }
}