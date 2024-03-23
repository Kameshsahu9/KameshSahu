import java.util.Scanner;
class GradeConverter {
    public static void main(String[] args) {
        int marks;
        char  gr;
        Scanner s = new Scanner(System.in);
        System.out.println("Emter score:");
        marks = s.nextInt();
        if (marks >= 90)
        {
            gr = 'A';
        }
        else if (marks >= 80)
        {
            gr = 'B';
        }
        else if (marks >= 70)
        {
            gr = 'C';
        }
        else 
        if (marks >= 50)
        {
            gr = 'D';
        }
        else
        {
            gr = 'F';
        }
       System.out.println("Grade:" + gr);
       s.close();
    }
   
}