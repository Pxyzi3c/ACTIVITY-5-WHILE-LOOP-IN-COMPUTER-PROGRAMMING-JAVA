import java.util.Scanner;
public class act5Num2 {
    // PROGRAMMER: HARVY JONES PONTILLAS DICT 2-2
    public static void main(String[]args) {
        // Variables declaration and initialization
        int hrsWorked;
        double hrlyRate, salary, totalSal;
        salary = 0;
        totalSal = 0;

        Scanner keyboard = new Scanner(System.in);

        // Take hours worked input (hrsWorked)
        System.out.print("\n\tENTER HOURS WORKED (-1 TO END)\t\t : ");
        hrsWorked = keyboard.nextInt();
        
        // While loop statement for iteration process
        while(hrsWorked != -1) {
            // Take hourly rate input (hrlyRate)
            System.out.print("\tENTER HOURLY RATE OF THE WORKER ($00.00) : ");
            hrlyRate = keyboard.nextDouble();

            // Conditions to check hourly rate input and salary computation
            if(hrsWorked <= 40) 
                salary = hrsWorked * hrlyRate;
            else
                salary = hrsWorked * hrlyRate + (hrlyRate/2);
            
            System.out.println("\tTHE SALARY IS\t\t\t\t : $ " + salary);
            
            totalSal = totalSal + salary;// Total Salary computation
        
            // Take hours worked input (for iteration checking)
            System.out.print("\n\tENTER HOURS WORKED (-1 TO END)\t\t : ");
            hrsWorked = keyboard.nextInt();
        }

        // Display total salary
        System.out.println("\n\tTHE TOTAL SALARY OF ALL EMPLOYEES\t : $ " + totalSal);
        
        System.out.println("\n\t\t* * * * * * * * * * * * * * * * * * * * \n\t\t*\t\t\t\t      *");
        System.out.println("\t\t*   THANK YOU FOR USING THE SYSTEM!   *");
        System.out.println("\t\t*\t\t\t\t      *\n\t\t* * * * * * * * * * * * * * * * * * * *");
    }
}