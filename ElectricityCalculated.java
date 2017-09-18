import java.text.DecimalFormat;
/****************************************************
 //February 16, 2016
 //A program to show an electricity companies
 //method of charging a customer for
 //electricity usage.
 ****************************************************/
 public class ElectricityCalculated
 {

 public static void main (String [] args)
 {
 DecimalFormat mine = new DecimalFormat("$#,##0.00");
 String name = "";
 int kilowatt = 0;
 int grid ;//= 0
 double calculatedUsage = 0.00;
 double calculatedTotal = 0.00;
 char choice; //delared variables


 do
 {


 System.out.print("Please enter your name -> "); //customer enters name
 name = GetInput.readLine();


 System.out.print("Hello " + name + ", " + "Please enter how many kilowatts you used -> ");
 kilowatt = GetInput.readInt();//customer enters kilowatts used

 System.out.print(name + ", " + "Please enter your grid number (0-2) -> ");
 grid = GetInput.readInt();//customer enters grid number

 if (kilowatt <= 100)
 calculatedUsage = kilowatt * .50;//usage up to 100 kilowatts

 else
 if (kilowatt <= 200)
 calculatedUsage = (kilowatt - 100) * .75 + 50;//usage from 100 to 200 kilowatts
 else//(kilowatt >= 200)
 calculatedUsage = (kilowatt - 200) * .95 + 125;//usage over 200 kilowatts

if (grid == 0)
 calculatedTotal = 15 + calculatedUsage;//customer enters grid 0, 15 dollars
 else
 if (grid == 1)
 calculatedTotal = 30 + calculatedUsage;//customer enters grid 1, 30 dollars
 else
 if (grid == 2)
 calculatedTotal = 45 + calculatedUsage;//customer enters grid 2, 45 dollars
 else
 {
 System.out.println("Thank you, your total can not be calculated at this time!");
 System.exit(4);//if number other than 0-2 is entered
 }

 System.out.println("Your calculated usage is " + mine.format(calculatedUsage));
 //customer usage
 System.out.println("Your calculated total payment is " + mine.format(calculatedTotal));
 //total bill calculated
 System.out.println("\nDo you wish to calculate more elctricity bills? (Y/N)");
 //if more bills need to be calculated
 choice = GetInput.readLineNonwhiteChar();
 }while ((choice == 'y') || (choice == 'Y'));
 System.out.println("Thank you for using our company for your electricity!");
 //display calculated total at the end

 } //end of method
 } //end of class ElectricityCalculated
