import java.util.Scanner;
public class code{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int colorChoice=0;
        String season=null;
        String name=null;
        System.out.println("Chose your favorite color. Press 1 for red, 2 for blue and 3 for green");
        System.out.println("Enter your favorite season");
        System.out.println("Enter your name");
    while (colorChoice==0||name==null||season==null){
    if (colorChoice!=1&&colorChoice!=2&&colorChoice!=3){
        colorChoice=s.nextInt();
    }
    if (name==null&&season==null){        
        season=s.nextLine();
        season=season.toLowerCase();}
    if (name==null&&(season=="fall"||season=="spring"||season=="winter"||season=="summer"||season=="autumn")){      name=s.nextLine();}
        if (!(colorChoice>0)||colorChoice>3){
            System.out.println("Please choose 1, 2 or 3");
            colorChoice=0;
        } 
        if(!(season=="fall"||season=="winter"||season=="summer"||season=="spring"||season=="autumn")){
            System.out.println("Please enter a valid season");
            season=null;
        }
    }
    s.close();
    System.out.println("name="+name+"\n"+"season="+season+"\n"+"color="+colorChoice);
    name=name.toLowerCase();
    if (colorChoice==2){
        if (season=="fall"||season=="autumn"){
            System.out.println("You got an alligator");
        } else if (season=="spring"){
            System.out.println("You got a giraffe");
        }
    } else if (colorChoice==3){
        if(!(name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u')&&season=="winter"){
            System.out.println("You got a giraffe");
        } else if (season!="fall"||season!="autumn"){
            System.out.println("You got a dog");
        }
    }
}}