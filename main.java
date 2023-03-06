import java.util.Locale;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name;
    int score = 0;
    //answer for those given questions//
    String answer1 = "Tokyo";
    String answer2 = "Pacific Ocean";
    String answer3 = "Asia";
    int answer4 = 169;
    float answer5 = 3.14f;

    //strings for user's answer input
    String user_answer1,user_answer2,user_answer3;
    int user_answer4;
    float user_answer5;

    //game started
    System.out.println("QUIZ GAME");
    System.out.println();
    System.out.println("Please enter your name: ");
    name = sc.nextLine();
    System.out.println("Hi "+name+"!");
    System.out.println("Please answer those 5 questions.");
    System.out.println();
    System.out.println();

    //question no.1
    System.out.println("1.What is the capital city of JAPAN?");
    System.out.println("Answer: ");
    user_answer1 = sc.nextLine();
    if (answer1.equalsIgnoreCase(user_answer1)){
        System.out.println("You got it right "+name+"!");
        score++;
    }else
    {
        System.out.println("Wrong! The correct answer is "+answer1+".");
    }

    //question no.2
    System.out.println();
    System.out.println("2.What is the largest ocean?");
    System.out.println("Answer: ");
    user_answer2 = sc.nextLine();
    if (answer2.equalsIgnoreCase(user_answer2) || user_answer2.equalsIgnoreCase("pacific")){
        System.out.println("Correct!");
        score++;
    }else {
        System.out.println("Wrong! The correct answer is "+answer2+".");
    }

    //question no.3
    System.out.println();
    System.out.println("3.What is the largest continent?");
    System.out.println("Answer: ");
    user_answer3 = sc.nextLine();
    if (answer3.equalsIgnoreCase(user_answer3)){
        System.out.println("You got it right "+name+"!");
        score++;
    }else{
        System.out.println("Wrong! The correct answer is "+answer3+".");
    }

    //question no.4
    System.out.println();
    System.out.println("What is 13 multiplied by 13? ");
    System.out.println("Answer: ");
    user_answer4 = sc.nextInt();
    if (answer4 == answer4 ){
        System.out.println("You got it right "+name+"!");
        score++;
    }else {
        System.out.println("Wrong! The correct answer is "+answer4+".");
    }
    //question no.5
    System.out.println();
    System.out.println("What is the value of PI?");
    System.out.println("Answer: ");
    user_answer5 = sc.nextFloat();
    if (answer5 == user_answer5){
        System.out.println("You got it right "+name+"!");
        score++;
    }else {
        System.out.println("Wrong! The correct answer is "+answer5+".");
    }


    System.out.println();
    System.out.println("Score: "+score+"/"+"5");
    System.out.println("Thank you for playing the game "+name+"!");
    }
}