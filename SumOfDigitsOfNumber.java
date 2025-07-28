import java.io.*;
public class SumOfDigitsOfNumber {
public static void main(String[] args) {
int num = 432;
int sum = 0;
while(num>0) {
sum = sum + num%10;
num = num/10;
}
System.out.println("Sum of digits of a number:" +sum);
}
}