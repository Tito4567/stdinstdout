package stdinstdout;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        //s += " ";
        
        do
        {
            
            s += scan.nextLine();
            s += " ";
            
        }while(scan.hasNext());
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
