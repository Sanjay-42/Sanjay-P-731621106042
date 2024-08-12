import java.util.Scanner;
public class Palindrome{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Name:");
String str=s.nextLine();
int len=str.length();
String str1="";
for(int i=len-1;i>=0;i--){
str1=str1+str.charAt(i);
}
if(str.equals(str1)){
System.out.println("Palindrome");
}
else{
System.out.println("Not Palindrome");
}
}
}


