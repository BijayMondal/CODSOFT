import java.util.*;
public class GradeCalc {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("How many Subjects do you have: ");
        int subCount = input.nextInt();
        input.nextLine();
        String[] subjectNames = new String[subCount];
        int[] subjectMarks = new int[subCount];
        int total=0;

        for(int i=0;i<subCount;i++){
            System.out.println("Enter the name of the Subject "+(i+1)+ " : ");
            subjectNames[i]=input.nextLine();
            int mark;
            while(true){
                System.out.println("Enter the marks for "+ subjectNames[i] + "(0-100): ");
                mark = input.nextInt();
                if(mark >=0 && mark <=100) 
                break;
                System.out.println("Invalid input.");

            }
            subjectMarks[i]=mark;
            total += mark;
            input.nextLine();
        }
        double percentage = (double) total/subCount;
        String grade = CalculateGerade(percentage);
        System.out.println("===== Geade Report =====");
        for(int i=0;i<subCount;i++){
            System.out.println(subjectNames[i] +" : "+ subjectMarks[i] + "marks");
        }
            System.out.println("----------------------------------------");
            System.out.println("Total Marks: "+ total);
            System.out.printf("Average percentage: %.2f%%\n", percentage);
            System.out.println("Final Grade: "+ grade);
        }
        private static String CalculateGerade(double percentage){
            if(percentage >= 90) return "O";
            else if(percentage >= 80) return "A";
            else if(percentage >= 70) return "B";
            else if(percentage >= 60) return "C";
            else if(percentage >= 50) return "D";
            else return "F";
    }
}
