/*
Date: 23/04/22
Made by: Lord Saiyan
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    
    String frase;
    
    System.out.println("Insira alguma frase: ");
    frase=reader.nextLine();

    for(int i = 0; i <= frase.length(); i++)
    {
        
        System.out.println(frase.substring(0,i));
        
        
    }
		
	}
}
