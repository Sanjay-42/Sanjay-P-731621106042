import java.util.Scanner;
public class Armstrong{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the Number:");
int n=s.nextInt();
int sum=0,temp,last;
temp=n;
while(temp!=0){
last=temp%10;
sum=sum+(last*last*last);
temp=temp/10;
}
if(n==sum){
System.out.println("The Given number is Armstrong");
}
else{
System.out.println("The Given number is Not Armstrong");
}
}
}
