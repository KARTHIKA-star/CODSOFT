import java.util.*;
public class Guessthenumber{
     void guessnumber()
     {
        Scanner sc=new Scanner(System.in);
        int guess,number,score=0,attempt=5,i;
        number=1+(int)(100 * Math.random());
        System.out.println("Number of attempts:"+attempt);
        System.out.println("Your guessing the number between 1 to 100.....");
        System.out.println();
        for(i=0;i<5;i++)
        {
             System.out.println("Enter the your guessing number:");
             guess=sc.nextInt();
              if(number> guess)
              {
                System.out.println("Your guessing the number is too low..");
               
              }
              else if(number < guess)
              {
                System.out.println("Your guessing the number is too high...");
            
              }
              else{
                score+=10;
                System.out.println("Congrates!You guess the coreect number.");
                break;

              }
               attempt--;
               System.out.println("Attemps left:"+attempt);
        }
        System.out.println("Your Score is:"+score);
        }


 public static void main(String args[]){
        
        Guessthenumber g=new Guessthenumber();
       
        Scanner sc=new Scanner(System.in);
        int play;
        do{
          g.guessnumber();
          System.out.println("You Play again(1/0)");
           play=sc.nextInt();
        }while(play==1);
        System.out.println("Thank You for your Playing...");       
          
    }
    }
