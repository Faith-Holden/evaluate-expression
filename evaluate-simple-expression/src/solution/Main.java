package solution;

import resources.classes.Expr;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner userInputScanner = new Scanner(System.in);
        String userInput;
        Expr expression;

        expressionLoop:
        while (true){
            System.out.println("Type the expression you would like to evaluate, or type \"done\" to finish.");
            userInput = userInputScanner.nextLine().toLowerCase();
            if(userInput.equals("done")){
                break;
            }
            try{
                expression = new Expr(userInput);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                continue;
            }

            //xLoop
            while (true){
                System.out.println("Type a value of x to evaluate.");
                userInput = userInputScanner.nextLine();
                double xVal;
                try {
                    xVal = Double.parseDouble(userInput);
                }catch (NumberFormatException e){
                    System.out.println("Sorry, that was not a valid number.");
                    continue;
                }
                double result = expression.value(xVal);

                if(Double.isNaN(result)){
                    System.out.println("The expression " + expression.toString() + " is not defined for x = " + xVal);
                }else{
                    System.out.println("The expression " + expression.toString() + " has a value of " + result
                            + " when x = " + xVal);
                }

                System.out.println("Would you like to continue evaluating this expression, evaluate a new expression, or finish?");
                System.out.println("Type \"continue,\" \"new,\" or \"done.\"");
                userInput = userInputScanner.nextLine().toLowerCase();
                while (!userInput.equals("new")&&!userInput.equals("continue")&&!userInput.equals("done")){
                    System.out.println("Sorry, that was not a valid response");
                    System.out.println("Type \"continue,\" \"new,\" or \"done.\"");
                    userInput = userInputScanner.nextLine().toLowerCase();
                }
                if(userInput.equals("new")){
                    break;
                }else if(userInput.equals("done")){
                    break expressionLoop;
                }
            }
        }

        System.out.println("Alright. Goodbye!");
    }
}
