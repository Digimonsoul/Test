import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.*;
import java.util.Scanner;

public class Main {

    static FileInputStream fileInputStream;
    static File myFile=new File("C:\\Users\\ew7100\\Documents\\GitHub\\Test\\EveningFall(Harp).mp3");
    static BufferedInputStream bufferedInputStream;
    static Player player;
    static long totalLength;
    static Runnable runnablePlay=new Runnable() {
        @Override
        public void run() {
            try {
                //code for play button
                fileInputStream=new FileInputStream(myFile);
                bufferedInputStream=new BufferedInputStream(fileInputStream);
                player=new Player(bufferedInputStream);
                totalLength=fileInputStream.available();
                player.play();//starting music
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    };
    static Thread playThread;

    static public void start(String pathname){
        myFile=new File(pathname);
        playThread = new Thread(runnablePlay);
        playThread.start();
    }
   static public void stop(){
        player.close();
        playThread.interrupt();
    }
    public static void main(String[] args) {
        Scanner system = new Scanner(System.in);
        start("C:\\Users\\ew7100\\Documents\\GitHub\\Test\\EveningFall(Harp).mp3");

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
        String Name=null;
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("What might their name be?");
            Name = system.nextLine();
            System.out.println("Are you sure this is their name?");
            answer = system.nextLine();
        }
        if (Name.equalsIgnoreCase("Rick Astley")) {
            stop();
            start("C:\\Users\\ew7100\\Documents\\GitHub\\Test\\RickRoll.mp3");
            while(true){
                Pause(0.3);
                System.out.println("Bruh");
            }
        }
        System.out.print("Of course,");
        Pause(0.5);
        System.out.println(" an awakened soul brings new life");
        Pause(1.75);
        System.out.println("And all life requires form.");
        Pause(1.75);
        System.out.println("Which form does this new life take?");
        answer="";
        String Species=null;
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Human");
            System.out.println("Elf");
            System.out.println("Catkin");
            System.out.println("Drakon");
            Species = system.nextLine();
            if(Species.equalsIgnoreCase("Human")){
                System.out.println("Mundane yet Abnormal. Unremarkable but infinite.");
                System.out.println("A human has no advantage, " +
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
        System.out.println("All forms have traits");
        Pause(1.75);
        System.out.println("And these traits represent two halves.");
        Pause(1.75);
        answer="";
        String Gender=null;
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Which half does this form represent?");
            System.out.println("Male or Female");
            Gender = system.nextLine();
            if(Gender.equalsIgnoreCase("male")||
                    Gender.equalsIgnoreCase("female")){
                System.out.println("Are you sure they represent this half?");
                answer = system.nextLine();
            }
            else{
                System.out.println("This is not a half. Select one of the halves");
            }
        }
        System.out.println("Lastly, this world is governed by higher forces");
        Pause(1.75);
        System.out.println("They are called Authorities and they grant great power.");
        Pause(1.75);
        System.out.println("An Authority has taken interest in this awakened soul");
        Pause(1.75);
        System.out.println("What Authority gazes over this new form?");
        answer="";
        String Watcher=null;
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Yaliwen");
            System.out.println("Grottus");
            System.out.println("Zephine");
            System.out.println("Kaiser");
            System.out.println("Aster");
            Watcher = system.nextLine();
            if(Watcher.equalsIgnoreCase("Yaliwen")){
                System.out.println("She who witness evolution. Under their eyes, " +
                        "All proceeds as it should.");
            }
            else if(Watcher.equalsIgnoreCase("Grottus")){
                System.out.println("Conquerer of war, servent to peace. He who studies " +
                        "the harshness of the blade, yet embraces the kindness " +
                        "in the soul.");
            }
            else if(Watcher.equalsIgnoreCase("Zephine")){
                System.out.println("The world is meant to be explored. With her as their" +
                        " witness, the winds adventure the world unhindered.");
            }
            else if(Watcher.equalsIgnoreCase("Kaiser")){
                System.out.println("As above is below. The darkness is neither an ally" +
                        " nor an enemy, For he has no need to indulge mortal desires");
            }
            else if(Watcher.equalsIgnoreCase("Aster")){
                System.out.println("The most observant of watchers would indeed be he " +
                        "who witnesses everything. His eyes are the stars, for he who " +
                        "sees all, also knows all");
            }
            else{
                System.out.println("This Authority is unknown. Select a known authority");
                continue;
            }
            System.out.println("");
            System.out.println("Are you sure this is the authority who watches?");
            answer = system.nextLine();
        }
        Character Player = new Character(Name,Species,Gender,Watcher);
        stop();






    }
    static void Pause(double Sec){
        try
        {
            Thread.sleep((long)(1500*Sec));
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    //This is from
    //https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random
    //Select a random number between min and max
        //This includes both min and max
    static double getRandomDouble(double min, double max) {
        min = Math.ceil(min);
        max = Math.floor(max);
        return Math.floor(Math.random() * (max - min + 1) + min);
    }
}