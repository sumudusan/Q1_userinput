
import java.util.Scanner;
public class Employee
{
    public static void main(String[] args)
    {
        String name;
        String department;
        double salary;
        int days;
        double salary_per_day;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        name=s.nextLine();
        System.out.println("Enter department:");
        department=s.nextLine();
        System.out.println("Enter Days:");
        days=s.nextInt();
        System.out.println("salary par day:");
        salary_per_day=s.nextDouble();

        salary=salary_per_day*days;

        System.out.println("name="+name);
        System.out.println("Department="+department);
        System.out.println("Salary="+salary);

    }

}
