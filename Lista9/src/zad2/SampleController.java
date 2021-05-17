package zad2;

import java.util.ArrayList;
import java.util.Collections;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private TextField TextRocznik;

    @FXML
    private TextField TextNazwisko;

    @FXML
    private TextField TextSrednia;

    @FXML
    private Button ButtonDodaj;
    
    @FXML
    private Button ButtonSortuj;
    ArrayList<Student> ListaUczniow = new ArrayList<Student>();
    
    @FXML
    void ActionDodaj(ActionEvent event) {
    	ListaUczniow.add(new Student(Integer.parseInt(TextRocznik.getText()),TextNazwisko.getText(),Integer.parseInt(TextSrednia.getText())));
    }

    @FXML
    void ActionSortuj(ActionEvent event) {
    	Collections.sort(ListaUczniow);
    	
    	System.out.println(ListaUczniow);
    }

}
