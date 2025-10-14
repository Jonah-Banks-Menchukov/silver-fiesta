import java.util.Scanner;
public class code{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int colorChoice=0;
        String season=null;
        String name=null;
        String best=null;
        System.out.println("Chose your favorite color among red, blue, and green. Press 1 for red, 2 for blue, and 3 for green.");   
    while (colorChoice==0){
    if (colorChoice!=1&&colorChoice!=2&&colorChoice!=3){
        colorChoice=s.nextInt();
    }
    if (!(colorChoice>0)||colorChoice>3){
            System.out.println("Please choose 1, 2 or 3");
            colorChoice=0;
    } else{
        System.out.println("Good choice");
    }
    }
    System.out.println("Enter your favorite season");
    while (season==null){
        season=s.nextLine();
        season=season.toLowerCase();
    if(!(season.equals("fall")||season.equals("winter")||season.equals("summer")||season.equals("spring")||season.equals("autumn"))){
            System.out.println("Please enter a valid season");
            season=null;
        }else{
            System.out.println("Good choice");
        }
    }
    System.out.println("Enter your name");
    while (name==null){
        name=s.nextLine();
    }
    s.close();
    name=name.toLowerCase();
    if (colorChoice==2){
        if (season.equals("fall")||season.equals("autumn")){
            best="alligator";
        } else if (season.equals("spring")){
            best="ostrich";
        } else if(!(name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u')&&best==null){
            best="axolotl";
        }
    } else if (colorChoice==3){
        if(!(name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u')&&season=="winter"){
            best="giraffe";
        } else if (best==null&&!(season.equals("fall"))||!(season.equals("autumn"))){
            best="giraffe";
        }
    } else if (colorChoice==1){
        if (name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u'){
            System.out.println("You got a porcupine");
        }else{
            System.out.println("You got a panda");
        }
    }else if(season.equals("summer")&&best==null){
        best="pony";
    }else if (best==null){
        best="pet rock";
    }
    System.out.println("You've been given a "+best);
}}