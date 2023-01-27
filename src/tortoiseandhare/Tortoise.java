
package tortoiseandhare;

import javafx.scene.control.TextArea;

public class Tortoise extends Animal {
    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    public Tortoise(String name, int moveChance, int speed, int progress, TextArea ta) {
        super(name, moveChance, speed, progress, ta);
    }

    public Tortoise() {
    }
    
}
