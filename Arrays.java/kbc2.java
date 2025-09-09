import java.util.*;
public class kbc2 {
    public static void main(String args[]){

        System.out.println("Welcome ...... to Kaun Banega Crorepati...{kbc}");

int score=0;
Scanner sc=new Scanner(System.in);

//list of questions...
String[] questions={"1.what is the first nickname you gave to me?",
                    "2.Which one of these date is our 1st 'ILOVEYOU' confession to each other?", 
                    "3.who is more clingy between 2 of us?", 
                    "4.which one of these is my all time fav?",
                    "5.which is my first dream place to travel with you?",
                   };

//list of options...
String[][] options={ {"A.Chomu","B.duffer","C.piddi","D.motii"},
                     {"A.19 Nov","B.22 Nov","C.28 Nov","D.30 Nov"},
                     {"A.YOU","B.ME","C.BothUs","D.NoneOfUS"},
                     {"A.maggie","B.french fries","C.Babycorn","D.Momos"},
                     {"A.Shimla","B.VaishnoDEVI","C.Amritsar","D.KARNATAKA"},
                     
                   };

//CORRECT option...
char[] option={'C','D','A','D','B'};         

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

if(choosenOpt==option[i]){
    System.out.println("CORRECT\t");
        score=score+50;
    System.out.println("for this ques,you scored:"+score);
}
else{
    System.out.println("INCORRECT ANSWER..... The Right answer is:"+option[i]);
}
}

System.out.println("\n\nGame Over! final score of yours is: " + score);
if(score>100){
    System.out.println("\n I LOVE YOU...\nCONGRATULATION...YOU WON A DINNER TREAT FROM ME IN THIS WEEK");
}

 }

}


 
    

