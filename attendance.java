//author:K.Aafreen Benazir
package attendance;
  //importing 
import java.util.Scanner;
//checking attendance percentage of students

class student{
    float AP;
    String name="";
    int reg;
    int total;
    int s;
    void attendance(){
        Scanner obj = new Scanner(System.in);
         //getting student's name ,roll no ,total number of workingdays,total number of days the student was present
        System.out.println("Enter the student name");
        name=obj.nextLine();
        System.out.println("Enter the registration number");
        reg=obj.nextInt();
        System.out.println("Enter the total number of working days");
        total=obj.nextInt();
        System.out.println("Enter the total number of days the student was present");
        s=obj.nextInt();
        //calculating attendance percentage
        AP=(s/total)*100;
        System.out.println("Attendance percentage of this student is"+AP);
        if(AP>=90)
            System.out.println("5 marks");
        else if(AP>=80 && AP<90)
            System.out.println("4 marks");
        else if(AP>=75 && AP<80)
            System.out.println("3 marks");
        else if (AP<75)
            System.out.println("0 marks");
    
    
}
}
//main class
public class test {

    
    public static void main(String[] args) {
        // scanner for getting input from the user
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=obj.nextInt();
        student obj3 [] = new student[100];
        int a=0;
        //printing attendance percentage of students
        //creating object array
        for(a=0;a<n;a++)
        {
            obj3[a] = new student();
            obj3[a].attendance();
        }   
    }
    
}