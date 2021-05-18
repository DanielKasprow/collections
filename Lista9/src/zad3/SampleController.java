package zad3;

import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {

	@FXML
	private Button ButtonSortuj;

	@FXML
	private Label label1;

	@FXML
	private Label label2;
	ArrayList<Integer> ListaArray = new ArrayList<Integer>();

	Stack<Integer> ListaStack = new Stack<Integer>();

	@FXML
	void ActionSortuj(ActionEvent event) {
		Clock clock = Clock.systemDefaultZone();
		long czasstart1 = clock.millis();
		Collections.sort(ListaArray);
		long czaskoniec1 = clock.millis();
		long czasstart2 = clock.millis();
		Collections.sort(ListaStack);
		long czaskoniec2 = clock.millis();

		label1.setText(((czaskoniec1 - czasstart1) / 1000.0) + " s");
		label2.setText(((czaskoniec2 - czasstart2) / 1000.0) + " s");

	}

	@FXML
	void initialize() {
		Random generator = new Random();
		int rand = 0;
		for (int x = 0; x < 1000000; x++) {
			rand = generator.nextInt(10000);
			ListaArray.add(rand);
			ListaStack.add(rand);
		}
	}
}
