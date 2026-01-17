package K_B_C;
import java.util.Scanner;

public class play extends Question  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        play p=new play();
        System.out.println("welcome to KBC {KON BANEGA CODER!!!!}");
        System.out.println("Press Enter to continue...");
        sc.nextLine();  // waits until you press Enter
        System.out.print("enter your name= ");
        String name= sc.nextLine();
        System.out.println("read instructions carefully!!!!");
        System.out.println("1. total no. of Ques = 5");
        System.out.println("2. for each Ques there will be 4 options");
        System.out.println("3. three life line will be given");
        System.out.println("4. one wrong answer and your game will be quit !!! ");
        System.out.println("5. kindly enter valid inputs---");
        System.out.println("6. you can use 1 lifeline in one question");
        System.out.println("7. give answer in alphabet- a , b , c , d");
        System.out.println("8. press enter after giving answer-");
        System.out.println("Press Enter to continue...");
        sc.nextLine(); //for taking enter as input

        //Example Q-1
        Question.question("Question-1 : what is pointer in java ?", new String[]{"a. addrrss", "b.storage", "c.keyword","d.nothing"},'a',new String[]{"a.address","b.storage"},"ques: what is jit ?",new String[]{"a. compiler","b. keyword","c. jdk version","d. method"},'a',"which word shows location-");
       //Example Q-2
        Question.question("Question 2 : which keyword makes the java not fully object oriented language ?", new String[]{"a. private", "b. final", "c. static","d.none of them"},'c',new String[]{"b final","c. static"},"ques : how many access modifier in java ?",new String[]{"a. 1","b. 2","c. 3","d. 4"},'d',"Hint: not an access specifier and sometimes used in main method-");
        //Examole Q-3
        Question.question("Question 3 : what is the purpose of volatile keyword in java ?", new String[]{"a. visiblity", "b. voltality", "c. for declaring variable","d. none of them"},'a',new String[]{"a, visiblity","c. for declaring variable"},"Ques: for initialization of loop which type of data is used ?",new String[]{"a. int","b. float","c. double","d. both a and c"},'a',"Hint: to make code clear and transparent");

        System.out.println("your score: "+Question.score);
        System.out.println("||Thankyour for playing MR./MRS. "+name+" ||");
    }
}
