package K_B_C;
import java.util.Scanner;
class Question {
    static Scanner sc=new Scanner(System.in);
static int l1=0,l2=0,l3=0;
   static String lifeline1="press 1 to use 50/50";
    static  String lifeline2="press 2 to use flip the question";
    static String lifeline3="press 3 to use hint";
    public static int score=0;

    public Question() {}
public static void question(String question,String []options,char answer,String []lifeline50,String flipQuestion,String [] op,char ans,String hint){
    System.out.println(question);
    for (int i = 0; i <4 ; i++) {
        System.out.println(options[i]);
    }
   if (l1==0){
        System.out.println(lifeline1);
    }
    if (l2==0){
        System.out.println(lifeline2);
    }
    if (l3==0){
        System.out.println(lifeline3);
    }
    System.out.print("your answer: ");
    char ip=sc.next().charAt(0);

    if(ip==answer){
        System.out.println("||correct answer||");
        score+=1000;
    }
    else if (ip=='1' || ip=='2' || ip=='3') {
        if(ip=='1')
        {
            for (int i = 0; i <2 ; i++) {
                System.out.println(lifeline50[i]);
            }
             ip=sc.next().charAt(0);

            if(ip==answer)
            {
                System.out.println("||correct Answer||");
                l1++;
                score+=1000;

            }
            else
            {
                System.out.println("wrong answer");
                System.out.println("your game has been quit!!");
                System.out.println("your score: "+score);
                System.exit(0);
            }

        }
        else if (ip=='2'){
            System.out.println(flipQuestion);
            for (int i = 0; i <4 ; i++) {
                System.out.println(op[i]);
            }
            char ans1=sc.next().charAt(0);
            if(ans1==ans){
                System.out.println("||correct answer||");
                score+=1000;
                l2++;
            }else{
                System.out.println("wrong answer!!");
                System.out.println("your game has been quit!!");
                System.out.println("your score: "+score);
                System.exit(0);
            }
        }
        else if(ip=='3') {
            System.out.println(hint);
            for (int i = 0; i <4 ; i++) {
                System.out.println(options[i]);
            }
            char ans1=sc.next().charAt(0);
            if(ans1==answer){
                System.out.println("||correct answer||");
                score+=1000;
                l3++;
            }else{
                System.out.println("wrong answer!!!");
                System.out.println("your game has been quit!!");
                System.out.println("your score: "+score);
                System.exit(0);
            }
        }
    }
    else{
        System.out.println("wrong answer");
        System.out.println("your game has been quit!!");
        System.out.println("your score: "+score);
        System.exit(0);
    }
}
}
