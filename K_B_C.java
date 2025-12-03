package K_B_C;
import java.util.Scanner;
public class K_B_C {
    public static void main(String[] args) {

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
        System.out.println("press 1 to use 50/50");
        System.out.println("press 2 to use flip the ques");
        System.out.println("press 3 to use hint ");

        char input= sc.next().charAt(0);

        if(input=='A'){
            System.out.println("||correct answer||");
                    }
        else if (input=='1' || input=='2' || input=='3') {
            if(input=='1')
            {
                System.out.println("A. address");
                System.out.println("B. keyword");
                char ip=sc.next().charAt(0);

               if(ip=='A')
               {
                    System.out.println("correct Answer");

               }
               else {
                   System.out.print("wrong answer!!!!!");
                   System.out.print("your game has been quit!!!!!");
                   System.out.println(name);
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
                    if(ans1=='A'){
                        System.out.println("correct answer");
                    }else{
                        System.out.println("wrong answer!!");
                        System.out.print("your game has been quit!!");

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
                    if(ans2=='A'){
                        System.out.println("correct answer");
                    }
                    else{
                        System.out.println("wrong answer!!!");
                        System.out.print("your game has been quit!!");

                        return;
                    }
                   }







        }
        else
        {
            System.out.println("wrong answer");
            System.out.print("your game has been quit!!");
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
        System.out.println("press 1 to use 50/50");
        System.out.println("press 2 to use flip the ques");
        System.out.println("press 3 to use hint ");

        char input2=sc.next().charAt(0);

        if(input2=='C'){
            System.out.println("correct answer");
        }

        else if (input2=='1' || input2=='2' || input2=='3') {
            if(input2=='1')
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

                    return;
                }

            }

            else if (input2=='2'){
                System.out.println("ques : how many specifier in java ?");
                System.out.println("A. 1");
                System.out.println("B. 2");
                System.out.println("C. 3");
                System.out.println("D. 4");
                char ans1=sc.next().charAt(0);
                if(ans1=='D'){
                    System.out.println("correct answer");
                }else{
                    System.out.println("wrong answer!!");
                    System.out.print("your game has been quit!!");

                    return;
                }


            }
            else if (input2=='3') {
                System.out.println("Hint: not an access specifier and sometimes used in main method-");
                System.out.println("A. private");
                System.out.println("B. final");
                System.out.println("C. static ");
                System.out.println("D. none of them");
                char ans1 = sc.next().charAt(0);
                if (ans1 == 'C') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer!!!");
                    System.out.print("your game has been quit!!");

                    return;
                }
            }



        }else {
            System.out.print("wrong answer!!!");
            System.out.print("your game has been quit!!");

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
        System.out.println("press 1 to use 50/50");
        System.out.println("press 2 to use flip the ques");
        System.out.println("press 3 to use hint ");

        char input3=sc.next().charAt(0);

        if(input3=='A'){
            System.out.println("correct answer");
        }

        else if (input3=='1' || input3=='2' || input3=='3') {
            if(input3=='1')
            {
                System.out.println("A. 65");
                System.out.println("C. A");
                char ip=sc.next().charAt(0);

                if(ip=='A')
                {
                    System.out.println("correct Answer");
                }

                else
                {
                    System.out.println("wrong answer");
                    System.out.print("your game has been quit!!");

                    return;
                }

            }

            else if (input3=='2'){
                System.out.println("Ques: for initialization of loop which type of data is used ?");
                System.out.println("A. int");
                System.out.println("B. float");
                System.out.println("C. char");
                System.out.println("D. double");
                char ans1=sc.next().charAt(0);
                if(ans1=='A'){
                    System.out.println("correct answer");
                }else{
                    System.out.println("wrong answer!!");
                    System.out.print("your game has been quit!!");

                    return;
                }


            }
            else if (input3=='3') {
                System.out.println("Hint: answer will be int value-");
                System.out.println("A. 65");
                System.out.println("B. 11");
                System.out.println("C. A ");
                System.out.println("D. 30");
                char ans1=sc.next().charAt(0);
                if(ans1=='A'){
                    System.out.println("correct answer");
                }else{
                    System.out.println("wrong answer!!!");
                    System.out.print("your game has been quit!!");

                    return;
                }


            }


        }
        else {
            System.out.print("wrong answer!!!");
            System.out.print("your game has been quit!!");

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
        System.out.println("press 1 to use 50/50");
        System.out.println("press 2 to use flip the ques");
        System.out.println("press 3 to use hint ");

        char input_3=sc.next().charAt(0);

        if(input_3=='C'){
            System.out.println("correct answer");
        }

        else if (input_3=='1' || input_3=='2' || input_3=='3') {
            if(input_3=='1')
            {
                System.out.println("A. Visiblity");
                System.out.println("C. for declaring variable");
                char ip=sc.next().charAt(0);

                if(ip=='A')
                {
                    System.out.println("correct Answer");
                }

                else
                {
                    System.out.println("wrong answer");
                    System.out.print("your game has been quit!!");

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
                if(ans1=='A'){
                    System.out.println("correct answer");
                }else{
                    System.out.println("wrong answer!!");
                    System.out.println("your game have been quit!!!!");

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
                if(ans1=='A'){
                    System.out.println("correct answer");
                }
                else{
                    System.out.println("wrong answer!!!");
                    System.out.println("your game have been quit!!!!");
                    return;
                }


            }


        }
        else{
            System.out.print("wrong answer!!!");
            System.out.println("your game have been quit!!!!");

            return;
        }


}}
