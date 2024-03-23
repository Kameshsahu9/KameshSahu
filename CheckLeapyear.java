import java.util.Scanner;

public class CheckLeapyear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int yr =s.nextInt();
        boolean flag = false;
        if (yr %400 ==0) {
            flag = true;

            
        }
        else if (yr % 100 ==0 ) {
             flag = false;
        }
        else if( yr % 4 == 0){
            flag = true;


        } 
        else
        {
            flag = false;

        }
        if (flag) {
            System.out.println("Leap year");
        }
        else{
            System.out.println("not a Leap year");
            s.close();
        }

    }
}
