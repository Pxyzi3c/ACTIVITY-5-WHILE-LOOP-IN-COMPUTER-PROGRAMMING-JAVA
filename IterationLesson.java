import java.util.Scanner;
public class IterationLesson {
    public static void main(String[] args) {
        //variable declaration and initialization
        int eno, tno;
        double salary, tax, netsal, totalnet; //GROSS SALARY = Total accumulated income without deductions   NET SALARY = Total accumulated income including deductions
        totalnet = 0;
        tno = 0;

        Scanner di = new Scanner(System.in);

        System.out.print("EMPLOYEE NO.:");
        eno = di.nextInt();
        while(eno!=0){
            System.out.print("SALARY: ");
            salary = di.nextDouble();

            if (salary < 7000.00)
                tax = .10 * salary;
            else if(salary <= 15000.00)
                tax = .20 * salary;
            else
                tax = .30 * salary;

                netsal = salary - tax;

            System.out.println("INCOME TAX:" + tax);
            System.out.print("NET SALARY:" + netsal);
            tno = tno + 1;
            totalnet = totalnet + netsal;

            System.out.print("\n\nEMPLOYEE NO.:");
            eno = di.nextInt();
        }

        System.out.println("\n\t***SUMMARY***");
        System.out.println("TOTAL NO OF EMPLOYEE:" + tno);
        System.out.println("TOTAL NET SALARY.:" + totalnet);
    }
}