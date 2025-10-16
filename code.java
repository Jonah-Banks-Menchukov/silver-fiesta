/*Jonah Banks
 *10/15/25
 *This program will tell you what pet you need in order to identify yourself
 *in the United States of Vermin Supreme using his pet criteria.
*/
import java.util.Scanner;
public class code{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String colorChoice=null;
        String season=null;
        String name=null;
        String best=null;
        //uses a variable best to chose best candidate.
        System.out.println("Chose your favorite color among red, blue, and green.");   
    while (colorChoice==null){
        colorChoice=s.nextLine();
        colorChoice=colorChoice.toLowerCase();
    if (!(colorChoice.equals("red"))&&!(colorChoice.equals("green"))&&!(colorChoice.equals("blue"))){
            System.out.println("Please choose red, blue, or green.");
            colorChoice=null;
    } else{
        System.out.println("Good choice");
    }
}
    /*This asks users to chose a color: red, blue, or green*/
    System.out.println("Enter your favorite season.");
    while (season==null){
        season=s.nextLine();
        season=season.toLowerCase();
    if(!(season.equals("fall")||season.equals("winter")||season.equals("summer")||season.equals("spring")||season.equals("autumn"))){
            System.out.println("Please enter a valid season.");
            season=null;
        }else{
            System.out.println("Good choice");
        }
    }
    /*Asks users to enter favorite season, tells them no if it's not one*/
    System.out.println("Enter your name");
    while (name==null){
        name=s.nextLine();
    }
    /*If you enter your name wrong, that's on you*/
    s.close();
    /*Decision tree starts by asking about favorite colors*/
    if (colorChoice.equals("blue")){
        if (season.equals("fall")||season.equals("autumn")){
            best="alligator";
        } else if (season.equals("spring")){
            best="ostrich";
        } else if(!(name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u'
        ||name.charAt(0)=='A'||name.charAt(0)=='E'||name.charAt(0)=='I'||name.charAt(0)=='O'||name.charAt(0)=='U')&&best==null){
            best="axolotl";
        }else{
        best="pet rock";
    }
    /*Assumed to be pet rock if someone doesn't qualify*/
    } else if (colorChoice.equals("green")){
        if(!(name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u'
        ||name.charAt(0)=='A'||name.charAt(0)=='E'||name.charAt(0)=='I'||name.charAt(0)=='O'||name.charAt(0)=='U')&&season.equals("winter")){
            best="giraffe";
        } else if (best==null&&!(season.equals("fall"))||!(season.equals("autumn"))){
            best="dog";
        }else{
        best="pet rock";
    }
    } else if (colorChoice.equals("red")){
        if (name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u'
        ||name.charAt(0)=='A'||name.charAt(0)=='E'||name.charAt(0)=='I'||name.charAt(0)=='O'||name.charAt(0)=='U'){
            best="porcupine";
        }else{
            best="panda";
    }}
    /*Anyone who's been given a rock by mistake should get a pony if they like summer*/
    if(season.equals("summer")&&best.equals("pet rock")){
        best="pony";
    }
    System.out.println("You've been given a "+best);
}}