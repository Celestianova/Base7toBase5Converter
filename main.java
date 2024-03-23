import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Info: Base 7 numbers can only consist of digits 0 to 6.");
        System.out.print("Please enter the number you want to convert from base 7 to base 5. Entered number is ");
        int num7 = scan.nextInt(), count=0, dec= 0;
        int temp = num7;
        
        while(temp>0)
        {
            temp/=10;
            count+=1;
        }
        
        temp = num7; 
        
        for(int i=0; i<count; i++){
            dec += (temp%10)*Math.pow(7, i);
            temp/=10;
        }
        
        System.out.println("Base 10 form of the entered number: "+ dec);
        
        int temp2 = dec, count2 = 0;
        
        while(temp2>0)
        {
            temp2/=5;
            count2+=1;
        }       
        
        temp2 = dec;
        
        System.out.print("Base 5 form of the entered number: ");
        
        for(int i = count2 ; i >= 1 ; i--){
            for(int j = i; j > 1 ; j--){
                temp2/=5;
            }
            System.out.print(temp2%5);
            temp2 = dec;
            
        }
        System.out.println();
    }
}