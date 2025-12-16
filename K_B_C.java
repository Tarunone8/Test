package K_B_C;
import java.util.Scanner;
public  class K_B_C {
    public static void main(String[] args) {
        int l1=0;
        int l2=0;
        int l3=0;

        String lifeline1="press 1 to use 50/50";
        String lifeline2="press 2 to use flip the question";
        String lifeline3="press 3 to use hint";



        Scanner sc=new Scanner(System.in);

        System.out.println("welcome to KBC {KON BANEGA CODER!!!!}");
        System.out.println("Press Enter to continue...");
        sc.nextLine();  // waits until you press Enter
        System.out.println("enter your name= ");
        String name= sc.nextLine();
        System.out.println("Press Enter to continue...");
        sc.nextLine();  // waits until you press Enter

        System.out.println("read instructions carefully!!!!");
        System.out.println("1. total no. of Ques = 5");
        System.out.println("2. for each Ques there will be 4 options");
        System.out.println("3. three life line will be given");
        System.out.println("4. one wrong answer and your game will be quit !!! ");
        System.out.println("5. kindly enter valid inputs---");
        System.out.println("6. you can use 1 lifeline in one question");
        System.out.println("7. give answer in alphabet- A,B,C,D");
        System.out.println("8. press enter after giving answer-");

        System.out.println("Press Enter to continue...");
        sc.nextLine(); //for taking enter as input

//ques1
        System.out.println("Question-1 : what is pointer in java ?");
        System.out.println("options are--");
        System.out.println("A. addrrss");
        System.out.println("B. keyword");
        System.out.println("C. storage ");
        System.out.println("D. nothing");
        System.out.println();

        System.out.println("life lines- " );
        System.out.println(lifeline1);
        System.out.println(lifeline2);
        System.out.println(lifeline3);

       char  input= sc.next().charAt(0);
        input=Character.toUpperCase(input);

        if(input=='A'){
            System.out.println("||correct answer||");
                    }
        else if (input=='1' || input=='2' || input=='3') {
            if(input=='1')
            {
                System.out.println("A. address");
                System.out.println("B. keyword");
                char ip=sc.next().charAt(0);
                ip=Character.toUpperCase(ip);
                

               if(ip=='A')
               {
                    System.out.println("correct Answer");
                    l1=1;

               }
               else {
                   System.out.print("wrong answer!!!!!");
                   System.out.print("your game has been quit!!!!!");
                   System.out.println("thankyou Mr./Mrs."+name+" for playing");
                   System.out.println("your score= 1000");

                   return;
               }

               }

               else if (input=='2'){
                    System.out.println("ques: what is jit ?");
                    System.out.println("A. compiler");
                    System.out.println("B. keyword");
                    System.out.println("C. jdk version");
                    System.out.println("D. method");
                    char ans1=sc.next().charAt(0);
                   ans1=Character.toUpperCase(ans1);

                    if(ans1=='A'){
                        System.out.println("correct answer");
                        l2=1;
                    }
                    else{
                        System.out.println("wrong answer!!");
                        System.out.print("your game has been quit!!");
                        System.out.println("thankyou Mr./Mrs."+name+" for playing");
                        System.out.println("your score= 1000");

                        return;
                    }}


                 if (input=='3') {
                    System.out.println("Hint: word which shows location");
                     System.out.println("options are--");
                     System.out.println("A. addrrss");
                     System.out.println("B. keyword");
                     System.out.println("C. storage ");
                     System.out.println("D. nothing");
                    char ans2=sc.next().charAt(0);
                     ans2=Character.toUpperCase(ans2);

                    if(ans2=='A'){
                        System.out.println("correct answer");
                        l3=1;
                    }
                    else{
                        System.out.println("wrong answer!!!");
                        System.out.print("your game has been quit!!");
                        System.out.println("thankyou Mr./Mrs."+name+" for playing");
                        System.out.println("your score= 1000");

                        return;
                    }

                   }

        }
        else
        {
            System.out.println("wrong answer");
            System.out.print("your game has been quit!!");
            System.out.println("thankyou Mr./Mrs."+name+" for playing");
            System.out.println("your score= 1000");
            return;
        }

        //ques 2
        System.out.println();
        System.out.println("Question 2 : which keyword makes the java not fully object oriented language ?");
        System.out.println("options are--");
        System.out.println("A. private");
        System.out.println("B. final");
        System.out.println("C. static ");
        System.out.println("D. none of them");
        System.out.println();
        System.out.println("life lines- " );
        if (l1==0){
             System.out.println(lifeline1);
        }
        if (l2==0){
            System.out.println(lifeline2);
        }
        if (l3==0){
            System.out.println(lifeline3);
        }

        char input2=sc.next().charAt(0);
        input2=Character.toUpperCase(input2);

        if(input2=='C'){
            System.out.println("correct answer");
        }

        else if (input2=='1' || input2=='2' || input2=='3') {
            if(input2=='1' || l1==0)
            {
                System.out.println("B. final");
                System.out.println("C. Static");
                char ip=sc.next().charAt(0);

                if(ip=='C')
                {
                    System.out.println("correct Answer");

                }

                else
                {
                    System.out.println("wrong answer");
                    System.out.print("your game has been quit!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 2000");

                    return;
                }

            }

            else if (input2=='2' || l2<=0){
                System.out.println("ques : how many specifier in java ?");
                System.out.println("A. 1");
                System.out.println("B. 2");
                System.out.println("C. 3");
                System.out.println("D. 4");
                char ans1=sc.next().charAt(0);
                ans1=Character.toUpperCase(ans1);
                if(ans1=='D'){
                    System.out.println("correct answer");
                }else{
                    System.out.println("wrong answer!!");
                    System.out.print("your game has been quit!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 2000");

                    return;
                }


            }
            else if (input2=='3' || l3==0) {
                System.out.println("Hint: not an access specifier and sometimes used in main method-");
                System.out.println("A. private");
                System.out.println("B. final");
                System.out.println("C. static ");
                System.out.println("D. none of them");
                char ans1 = sc.next().charAt(0);
                ans1=Character.toUpperCase(ans1);
                if (ans1 == 'C') {
                    System.out.println("correct answer");
                    l3=1;
                } else {
                    System.out.println("wrong answer!!!");
                    System.out.print("your game has been quit!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 2000");

                    return;
                }
            }



        }else {
            System.out.print("wrong answer!!!");
            System.out.print("your game has been quit!!");
            System.out.println("thankyou Mr./Mrs."+name+" for playing");
            System.out.println("your score= 2000");

            return;
        }


//ques3
        System.out.println();
        System.out.println("Question 3 :system.out.print(6 + ''5'')  ?");
        System.out.println("options are--");
        System.out.println("A. 65");
        System.out.println("B. 11");
        System.out.println("C. A ");
        System.out.println("D. 30");
        System.out.println();
        System.out.println("life lines- " );
        if (l1==0){
            System.out.println(lifeline1);
        }
        if (l2==0){
            System.out.println(lifeline2);
        }
        if (l3==0){
            System.out.println(lifeline3);
        }

        char input3=sc.next().charAt(0);
        input3=Character.toUpperCase(input3);

        if(input3=='A' ){
            System.out.println("correct answer");
        }

        else if (input3=='1' || input3=='2' || input3=='3') {
            if(input3=='1' || l1==0)
            {
                System.out.println("A. 65");
                System.out.println("C. A");
                char ip=sc.next().charAt(0);
                ip=Character.toUpperCase(ip);

                if(ip=='A')
                {
                    System.out.println("correct Answer");
                    l1=1;
                }

                else
                {
                    System.out.println("wrong answer");
                    System.out.print("your game has been quit!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 3000");

                    return;
                }

            }

            else if (input3=='2' || l2==0){
                System.out.println("Ques: for initialization of loop which type of data is used ?");
                System.out.println("A. int");
                System.out.println("B. float");
                System.out.println("C. char");
                System.out.println("D. double");
                char ans1=sc.next().charAt(0);
                ans1=Character.toUpperCase(ans1);
                if(ans1=='A'){
                    System.out.println("correct answer");
                    l2=1;
                }else{
                    System.out.println("wrong answer!!");
                    System.out.print("your game has been quit!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 3000");

                    return;
                }


            }
            else if (input3=='3'||l3<=0) {
                System.out.println("Hint: Concartination -");
                System.out.println("A. 65");
                System.out.println("B. 11");
                System.out.println("C. A ");
                System.out.println("D. 30");
                char ans1=sc.next().charAt(0);
                ans1=Character.toUpperCase(ans1);
                if(ans1=='A'){
                    System.out.println("correct answer");
                    l3=1;
                }else{
                    System.out.println("wrong answer!!!");
                    System.out.print("your game has been quit!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 3000");

                    return;
                }


            }


        }
        else {
            System.out.print("wrong answer!!!");
            System.out.print("your game has been quit!!");
            System.out.println("thankyou Mr./Mrs."+name+" for playing");
            System.out.println("your score= 3000");


            return;
        }


//ques 4

        System.out.println();
        System.out.println("Question 4 : what is the purpose of volatile keyword in java ?");
        System.out.println("options are--");
        System.out.println("A. visiblity");
        System.out.println("B. voltality");
        System.out.println("C. for declaring variable");
        System.out.println("D. none of them");
        System.out.println();
        System.out.println("life lines- " );
        if (l1==0){
            System.out.println(lifeline1);
        }
        if (l2==0){
            System.out.println(lifeline2);
        }
        if (l3==0){
            System.out.println(lifeline3);
        }
        char input_3=sc.next().charAt(0);
        input_3=Character.toUpperCase(input_3);

        if(input_3=='A'){
            System.out.println("correct answer");
        }

        else if (input_3=='1' || input_3=='2' || input_3=='3') {
            if(input_3=='1' || l1<=0)
            {
                System.out.println("A. Visiblity");
                System.out.println("C. for declaring variable");
                char ip=sc.next().charAt(0);

                if(ip=='A')
                {
                    System.out.println("correct Answer");
                    l1=1;
                }

                else
                {
                    System.out.println("wrong answer");
                    System.out.print("your game has been quit!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 4000");

                    return;
                }

            }

            else if (input_3=='2'){
                System.out.println("Ques= loop control statement that exits loop ?");
                System.out.println("A. break");
                System.out.println("B. stop");
                System.out.println("C. exit");
                System.out.println("D. quit");
                char ans1=sc.next().charAt(0);
                ans1=Character.toUpperCase(ans1);
                if(ans1=='A'){
                    System.out.println("correct answer");
                    l2=1;
                }else{
                    System.out.println("wrong answer!!");
                    System.out.println("your game have been quit!!!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 4000");

                    return;
                }

            }
            else if (input_3=='3') {
                System.out.println("Hint: something which is not transparent");
                System.out.println("A. visiblity");
                System.out.println("B. voltality");
                System.out.println("C. for declaring variable");
                System.out.println("D. none of them");
                char ans1=sc.next().charAt(0);
                ans1=Character.toUpperCase(ans1);
                if(ans1=='A'){
                    System.out.println("correct answer");
                    l3=1;

                }
                else{
                    System.out.println("wrong answer!!!");
                    System.out.println("your game have been quit!!!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 4000");
                    return;
                }


            }


        }
        else{
            System.out.print("wrong answer!!!");
            System.out.println("your game have been quit!!!!");
            System.out.println("thankyou Mr./Mrs."+name+" for playing");
            System.out.println("your score= 4000");

            return;
        }

        //ques 5
        System.out.println();
        System.out.println("Question 5 : which enviroment variable is used to set java path?");
        System.out.println("A. MAVEN_Path");
        System.out.println("B. javaPATH");
        System.out.println("C. java");
        System.out.println("D. JAVA_HOME");
        System.out.println();
        System.out.println("life lines- " );
        if (l1==0){
            System.out.println(lifeline1);
        }
        if (l2==0){
            System.out.println(lifeline2);
        }
        if (l3==0){
            System.out.println(lifeline3);
        }
        char input_5=sc.next().charAt(0);
        input_5=Character.toUpperCase(input_5);

        if(input_3=='D'){
            System.out.println("correct answer");
        }

        else if (input_5=='1' || input_5=='2' || input_5=='3') {
            if(input_5=='1' || l1<=0)
            {
                System.out.println("B. javaPATH");
                System.out.println("D. JAVA_HOME");
                char ip=sc.next().charAt(0);
                ip=Character.toUpperCase(ip);

                if(ip=='D')
                {
                    System.out.println("correct Answer");
                    l1=1;
                }

                else
                {
                    System.out.println("wrong answer");
                    System.out.print("your game has been quit!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 5000");

                    return;
                }

            }

            else if (input_5=='2'){
                System.out.println("Question : which of the following is not a java feature ?");
                System.out.println("options are--");
                System.out.println("A. Object-Oriented");
                System.out.println("B. uses of pointer");
                System.out.println("C. Portable");
                System.out.println("D. Dynamic and Extensible");
                char ans1=sc.next().charAt(0);
                ans1=Character.toUpperCase(ans1);
                if(ans1=='B'){
                    System.out.println("correct answer");
                    l2=1;
                }else{
                    System.out.println("wrong answer!!");
                    System.out.println("your game have been quit!!!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 5000");

                    return;
                }

            }
            else if (input_5=='3') {
                System.out.println("Hint: The variable is used to specify the location of the JAVA DEVELOPMENT KIT (jdk)");
                System.out.println("A. MAVEN_Path");
                System.out.println("B. javaPATH");
                System.out.println("C. java");
                System.out.println("D. JAVA_HOME");
                char ans1=sc.next().charAt(0);
                ans1=Character.toUpperCase(ans1);
                if(ans1=='D'){
                    System.out.println("correct answer");
                    l3=1;

                }
                else{
                    System.out.println("wrong answer!!!");
                    System.out.println("your game have been quit!!!!");
                    System.out.println("thankyou Mr./Mrs."+name+" for playing");
                    System.out.println("your score= 5000");
                    return;
                }


            }


        }
        else{
            System.out.print("wrong answer!!!");
            System.out.println("your game have been quit!!!!");
            System.out.println("thankyou Mr./Mrs."+name+" for playing");
            System.out.println("your score= 5000");

            return;
        }

}}

