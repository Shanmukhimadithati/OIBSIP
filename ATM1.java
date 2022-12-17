import java.util.Scanner;
import java.time.LocalDate;
public class ATM1
{
public static void main(String args[])
{
int bal_amount=10000,withdraw,deposit;
Scanner sc=new Scanner(System.in);
System.out.println("Insert your card");
while(true)
{
System.out.println("ATM operations");
System.out.println("1.Withdraw");
System.out.println("2.Deposit");
System.out.println("3.balance");
System.out.println("4.Transaction details");
System.out.println("5.Quit");
System.out.println("choose the operation to be perform");
int ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter  the money you want to withdraw");
withdraw=sc.nextInt();
if(bal_amount>=withdraw)
{
bal_amount=bal_amount-withdraw;
System.out.println("Please collect your money");
}
else
{
System.out.println("Does not have enough balance to withdraw");
}
break;
case 2:
System.out.println("Enter the money you want to deposit");
deposit=sc.nextInt();
bal_amount=bal_amount+deposit;
System.out.println("money is deposited successully");
break;
case 3:
System.out.println("Balance=" +bal_amount);
break;
case 4:
System.out.println("Transactional details are:");
LocalDate date=LocalDate.now();
System.out.println("Date:" +date);
System.out.println("Time :"+java.time.LocalTime.now());
long R=(long)(Math.pow(10,10));
System.out.println("Transaction id is :"+R);
System.out.println("Available balance:"+bal_amount);
System.out.println("...Thank you for using our ATM services....");
break;
case 5:
System.exit(0);
default:
System.out.println("Invalid choice\n");
}
}
}
}