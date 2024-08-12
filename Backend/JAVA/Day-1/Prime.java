import java.util.Scanner;
public class Prime{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int n=s.nextInt();
if(n%2==0 && n%1==0){
System.out.println("The Given Number is Prime");
}
else{
System.out.println("The Given Number is Not Prime");
}
}
}