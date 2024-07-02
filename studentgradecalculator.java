import java.util.Scanner;
public class studentgradecalculator{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of Grades");
        int numgrades=scanner.nextInt();
        int[]grades = new int[numgrades];
        for(int i=0;i<numgrades;i++){
        System.out.println("Enter the Grades:"+(i+1)+":");
        grades[i]=scanner.nextInt();

        } 
        scanner.close();
        int total = 0;
        for(int i=0;i<numgrades;i++){
        total += grades[i];
    }
    double average=(double)total/numgrades;
    System.out.println("Average Grade is:"+average);
}
}
