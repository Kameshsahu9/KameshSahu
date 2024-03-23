import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        int m, n, opt, add, sub, mul;
        double div;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a nummbers");
        m = s.nextInt();
        n = s.nextInt();
        while(true) {
            opt = s.nextInt();
            switch (opt) {
                case 1:
                    add = m+n;
                    System.out.println(add);
                    break;
                case 2:
                sub = m-n;
                System.out.println(sub);
                break;
                case 3:
                mul = m*n;
                System.out.println(mul);
                break;
                case 4:
                div = (double)m/n;
                System.out.println(div); 
                break; 
            
                default:
                s.close();
                    break;
            }
        }
    }
}
