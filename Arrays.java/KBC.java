import java.util.*;
public class KBC {
    public static void main(String args[]){

        System.out.println("Welcome to Kaun Banega Crorepati...{kbc}");

int score=0;
Scanner sc=new Scanner(System.in);

//list of questions...
String[] questions={"1.what is my full name?", "2.Which one of these is my homestate?", 
    "3.which one of these is my dream city to travel?", "4.which subject in my college year,i love the most?",
     "5.which one of these is my all time fav?"};

//list of options...
String[][] options={ {"A.Khushi SAHU","B.Khushi SINGH","C.Khushi MISHRA","D.Khushi GUPTA"},
                     {"A.DELHI","B.BIHAR","C.HARYANA","D.MP"},
                     {"A.Shimla","B.Rajgir","C.Indore","D.Noida"},
                     {"A.phy","B.PPS","C.math","D.EE"},
                     {"A.Chowmein","B.french fries","C.Babycorn","D.Momos"},
                   };

//CORRECT option...
char[] corrOption={'A','B','C','B','D'};         

//GAME START

//QUES(loops)
for(int i=0;i<5;i++){
    System.out.println(questions[i]);

//OPT
    for(int j=0;j<4;j++){
    System.out.println(options[i][j]);
    }

//ENTER OPTION BY USER
System.out.println("enter the options:(A/B/C/D)");
char choosenOpt=sc.next().charAt(0);

if(choosenOpt==corrOption[i]){
    System.out.println("CORRECT\t");
        score=score+500;
    System.out.println("for this ques,you scored:"+score);
}
else{
    System.out.println("INCORRECT ANSWER..... The Right answer is:"+corrOption[i]);
}
}

System.out.println("\n\nGame Over! final score of yours is: " + score);

 }

}


