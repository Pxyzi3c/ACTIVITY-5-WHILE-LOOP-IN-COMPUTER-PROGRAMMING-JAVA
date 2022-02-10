import java.util.Scanner;
public class act5Num1 {
    // PROGRAMMER: HARVY JONES PONTILLAS DICT 2-2
    public static void main(String[]args){
        // Variables declaration and initialization
        double salesInDollar, salary, totalSalWeek;
        salesInDollar = 0;
        totalSalWeek = 0;
        salary = 0;

        Scanner keyboard = new Scanner(System.in);

        // Take sales in dollar input (salesInDollar)
        System.out.print("\n\tENTER SALES IN DOLLAR (-1 TO END) : ");
        salesInDollar = keyboard.nextDouble();

        // While loop statement for process iteration
        while(salesInDollar != -1){
            salary = (salesInDollar * .09) + 200; // Salary computation
            System.out.println("\tSALARY\t\t\t\t  : $ " + salary + "\n\n");

            totalSalWeek = totalSalWeek + salary; // Total salary per week computation

            // Take sales in dollar input (for iteration checking)
            System.out.print("\tENTER SALES IN DOLLAR (-1 TO END) : ");
            salesInDollar = keyboard.nextDouble();
        }

        // Display total salary for the week
        System.out.println("\n\tTHE TOTAL SALARY FOR THE WEEK\t  : $ " + totalSalWeek);
        
        System.out.println("\n\t\t* * * * * * * * * * * * * * * * * * * * * * * *\n\t\t*\t\t\t\t\t      *");
        System.out.println("\t\t*  GOOD DAY! THANK YOU FOR USING THE SYSTEM!  *");
        System.out.println("\t\t*\t\t\t\t\t      *\n\t\t* * * * * * * * * * * * * * * * * * * * * * * *");
    }  
}