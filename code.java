import java.util.Scanner;
public class Code{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int colorChoice=0;
    while (true){
        if (colorChoice==0) System.out.println("Chose your favorite color. Press 1 for red, 2 for blue and 3 for green");
        colorChoice=Scanner.nextInt();
        if (!(colorChoice>0)||colorChoice>3) System.out.println("Please choose 1, 2 or 3");
        
    }
    }
}