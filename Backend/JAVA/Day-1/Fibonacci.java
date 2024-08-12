import java.util.Scanner;
public class Fibonacci{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number:");
int n=s.nextInt();
int a=0;
int b=1;
System.out.println(a);
System.out.println(b);
for (int i=2;i<=n;i++){
int c=a+b;
a=b;
b=c;
System.out.println(c);
}
}
}

