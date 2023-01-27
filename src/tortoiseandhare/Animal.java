
package tortoiseandhare;

import javafx.scene.control.TextArea;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Animal extends Thread {
    /*
    The run() method of the Animal class should consist of a loop that repeats until the animal has reached 1000 meters.
    Each time through the loop, the thread should decide whether it should run or rest based on a random number and the percentage passed to the constructor. 
    If this random number indicates that the animal should run, the method should add the speed value to the position value and display the new position. 
    The run() method should sleep for 100 milliseconds on each repetition of the loop. 
    When the loop ends, this method should display a message indicating that the animal has finished.
    */
    
    @Override
    public void run() {
        //CREATING A THREAD
        Thread thread = new Thread();
        
        //INITIALIZE RANDOM NUMBER
        Random rand = new Random();
        
        //INITIALIZE THE STRING BEING OUTPUTED TO THE TEXTAREA
        StringBuilder taContent = new StringBuilder(""); 
        
        while (this.progress < 1000) {
            if (rand.nextInt(100) + 1 <= this.moveChance){
                this.progress += this.speed;
                
                //APPEND THE TEXT INSIDE THE ANIMALS TEXTAREA
                taContent.append(this.name + " : " + this.progress + "\n");
            }
            
            //SET THE NEW TEXT TO THE TEXTAREA
            ta.setText(taContent.toString());
            
            //SLEEP FOR 100 MILLISECONDS
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(this.name + " is finished!");
    }

    private String name;
    private int moveChance;
    private int speed;
    private int progress;
    private TextArea ta;

    public Animal(String name, int moveChance, int speed, int progress, TextArea ta) {
        this.name = name;
        this.moveChance = moveChance;
        this.speed = speed;
        this.progress = progress;
        this.ta = ta;
    }

    public Animal() {
    }

    public String getAnimalName() {
        return name;
    }

    public void setAnimalName(String name) {
        this.name = name;
    }

    public int getMoveChance() {
        return moveChance;
    }

    public void setMoveChance(int moveChance) {
        this.moveChance = moveChance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public TextArea getTa() {
        return ta;
    }

    public void setTa(TextArea ta) {
        this.ta = ta;
    }
    
}
