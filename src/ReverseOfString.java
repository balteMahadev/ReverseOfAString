import java.util.Scanner;

public class ReverseOfString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.next();
        String rev = "";
        for (int i = name.length()-1; i>=0; i--)
        {
            rev +=name.charAt(i);
        }
        System.out.println(name+"  reverse is  "+rev);
    }
}
