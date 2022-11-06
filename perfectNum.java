import java.util.Scanner;

public class perfectNum{

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int num , total=0 ;
        
        System.out.println("Please enter a number");

        num=inp.nextInt();

        if(num > 0){
        
             for (int i = 1 ; i < num ; i++){

                    if(num % i == 0){

                        total+=i;
                    }

                }
                if(total == num){

                    System.out.println(num+" is a perfect number");
                }
                else{

                    System.out.println(num+" is not a perfect number");
                }

        }
        else{
            System.out.println("Number must be positive and integer");
        }   
    }
}