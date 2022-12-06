package org.example.Quiz;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import static org.example.Quiz.ColoredText.*;

public class QuizApp {

public static Scanner scan = new Scanner(System.in);
public static HashMap<String,String> questions = new HashMap<>();


    public static void main(String[] args) {
        try {
            do {
                displayPrompt();
                System.out.println(ANSI_BLUE + "Type 'no' to exit the game" + ANSI_RESET);
                System.out.println(ANSI_CYAN + "Type yes to play" + ANSI_RESET);
                System.out.println(":: ");
                String choice = scan.next();
                if (choice.equals("No") || choice.equals("no")) {
                    System.out.println("Thanks for playing");
                    break;
                }
                quiz();
                System.out.println();
                System.out.println();
                System.out.println();
            }
            while(true);

        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println("Error ::: " + e);
        }
    }

    private static void quiz() {

        final String BASE_STR = "What is the capital of ";

        // Added all the questions to the hashmap
        // Might move to a new file later
        questions.put("Andhra Pradesh","Hyderabad");
        questions.put("Arunachal Pradesh","Itanagar");
        questions.put("Assam","Dispur");
        questions.put("Bihar","Patna");
        questions.put("Chhattisgarh","Raipur");
        questions.put("Goa","Panaji");
        questions.put("Gujarat","Gandhinagar");
        questions.put("Haryana","Chandigarh");
        questions.put("Himachal Pradesh","Shimla");
        questions.put("Jammu and Kashmir","Srinagar");
        questions.put("Jharkhand","Ranchi");
        questions.put("Karnataka","Bengaluru");
        questions.put("Kerala","Thiruvananthapuram");
        questions.put("Madhya Pradesh","Bhopal");
        questions.put("Maharashtra","Mumbai");
        questions.put("Manipur","Imphal");
        questions.put("Meghalaya","Shillong");
        questions.put("Mizoram","Aizawl");
        questions.put("Nagaland","Kohima");
        questions.put("Orissa","Bhubaneswar");
        questions.put("Punjab","Chandigarh");
        questions.put("Rajasthan","Jaipur");
        questions.put("Sikkim","Gangtok");
        questions.put("Tamil Nadu","Chennai");
        questions.put("Telangana","Hyderabad");
        questions.put("Tripura","Agartala");
        questions.put("Uttar Pradesh","Lucknow");
        questions.put("Uttarakhand","Dehradun");
        questions.put("West Bengal","Kolkata");


        // show questions
//        System.out.println(questions.get("Assam"));



//        System.out.println(BASE_STR + questions.get());
        String answer = scan.nextLine();



//        questions();
//
//        Questions allQuestions = new Questions();
//        allQuestions.addQuestions(allQuestions);

//        System.out.println(allQuestions.get(1));

//        System.out.println(qsn instanceof Questions);

//        takeInputFromUser();
    }


    private static void displayPrompt() {
        System.out.println(ANSI_RED + "%%%%%%%%%%%%%%% Quizzz App %%%%%%%%%%%%%%%%%" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "********************************************");

    }

    private static void takeInputFromUser() {
        Scanner scan = new Scanner(System.in);

    }
}
