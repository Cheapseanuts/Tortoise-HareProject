/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package tortoiseandhare;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 *
 * @author kerri
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextArea txtBugs, txtFranklin;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //HARE NAMES BUGS HAS A 10% CHANCE OF MOVING, MOVES 100M AT A TIME
        Thread hare = new Hare("Bugs", 10, 100, 0, txtBugs);
        //TORTOISE NAMED FRANKLIN HAS 100% CHANCE OF MOVING, MOVES 10M AT A TIME
        Thread tortoise = new Tortoise("Franklin", 100, 10, 0, txtFranklin);

        tortoise.start();
        hare.start();
        
    }    
}
