package practice;

import javax.swing.*;

public class ConditionalStatementExample {
    public void whileLoop()
    {
        int x = 0;
        while (x < 20){
            System.out.println("value of x: " + x);
            x++;
        }

    }

    public void ForLoop() {
        for(int x = 10; x < 20; x = x + 1){
            System.out.println("value of x: " + x);
        }
    }
    public void DoWhileLoop() {
        int x = 10;
        do {
            System.out.println("Value of x: " + x);
            x++;
        }while (x < 20);
    }
    public void IfStatement() {
        int x = 30;
        //If x value less then 20 then print the value
        if (x < 20) {
            System.out.println("This is If statement");
        } else {
            System.out.println("This is else statement");}
    }
    //One if statement in another if statement that is called NestedStement
    public void NestedStatement() {
        int x = 30;
        int y = 10;
        if (x < 40) {
            if (y < 12) {
                System.out.println("X = " + x+" and Y = " + y  );
            }
        }
    }

    public void SwitchStatement() {
        char position = 'D';
        {
        switch (position) {
            case 'A':
                System.out.println("Salary over 100000");
                break;
            case 'B':
            case 'C':
                System.out.println("Salary under 100000");
                break;
            case 'D':
                System.out.println("Salary is 50000");
                break;
            case 'E':
                System.out.println("Salary is 2000");
                break;
            default:
                System.out.println("Invalid grade salary");
        }

        }
    }
    public void IfWithoutSwitch() {
        char grade = 'B';

        if (grade == 'A')
            System.out.println("Excellent");
        if (grade == 'B')
            System.out.println("Well Done");
        if (grade == 'C')
            System.out.println("You passed");
        if (grade == 'D')
            System.out.println("You passed");
        if (grade == 'F')
            System.out.println("Better try again");
        System.out.println("My grade is: " + grade);

    }
        public void learnIfElse(char grade) {
         if (grade == 'A') {
             System.out.println("You did excellent in the exam");
         }
         else if (grade == 'B') {
             System.out.println("You did well in the exam");
         }
         else if (grade == 'C') {
             System.out.println("You failed in the exam");
         } else if (grade == 'D') {
             System.out.println("You failed in the exam");

         }else {
             System.out.println();
         }

     }
     public void IfOperator() {
        int a, b;
        a = 10;
        if (a == 1) {
            b = 20;
        } else {
            b = 30;
        }


    }
    public void ConditionalOperator() {
        int a, b;
        a = 10;
        b = (a == 1) ? 20:30;
    }


    }











