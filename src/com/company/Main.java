package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner system = new Scanner(System.in);

        System.out.println("Fallen from the Aether");
        Pause(1.75);
        System.out.println("Arisen from the void");
        Pause(1.5);
        System.out.print(".");
        Pause(0.5);
        System.out.print(".");
        Pause(0.5);
        System.out.print(".");
        Pause(1.5);
        System.out.println("A new soul awakens");
        Pause(1.75);
        String answer="";
        String Name ="Ridian";
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("What might their name be?");
            Name = system.nextLine();
            System.out.println("Are you sure this is their name?");
            answer = system.nextLine();
        }
        System.out.print("Of course,");
        Pause(0.5);
        System.out.println(" an awakened soul brings new life");
        Pause(1.75);
        System.out.println("And all life requires form.");
        Pause(1.75);
        System.out.println("Which form does this new life take?");
        answer="";
        String Species ="Default";
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Human");
            System.out.println("Elf");
            System.out.println("Catkin");
            System.out.println("Drakon");
            Species = system.nextLine();
            if(Species.equalsIgnoreCase("Human")){
                System.out.println("Mundane yet Abnormal. unremarkable but infinite.");
                System.out.println("A human has no advantage," +
                        "but they also have no drawback.");
            }
            else if(Species.equalsIgnoreCase("Elf")) {
                System.out.println("Magic flows through their blood. While their" +
                        " minds are honed through history.");
                System.out.println("An elf is intelligent and wise. But in turn, their" +
                        " strength suffers.");
            }
            else if(Species.equalsIgnoreCase("Catkin")) {
                System.out.println("A trickster to many is trusted by few.");
                System.out.println("The catkin are as nimble as they are healthy. But " +
                        "wisdom can be lacking when the old do not teach the new.");
            }
            else if(Species.equalsIgnoreCase("Drakon")) {
                System.out.println("Power in its most primal state is not a tool, " +
                        "but instead a force.");
                System.out.println("A Drakon has the pride and strength " +
                        "of their ancestors reflected in their majestic form.");
                System.out.println("Yet when the body is highly praised, " +
                        "the mind can often falter.");
            }
            else{
                System.out.println("This form is undefined. Select a form that is known.");
                continue;
            }
            System.out.println("");
            System.out.println("Are you sure this is their form?");
            answer = system.nextLine();
        }









    }
    static void Pause(double Sec){
        try
        {
            Thread.sleep((long)(1000*Sec));
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}