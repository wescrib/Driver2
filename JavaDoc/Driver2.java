/**
*Author: William Scribner
*Purpose: to use javaFX in combination with a package.
*/

import carPackage.Automobile;

import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;

import java.util.Optional;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Dialog;

public class Driver2 extends Application {

	Stage window;
	Scene scene;
	Button button;
	ListView<String> listView;
	
	public static void main(String[] args) {
		launch(args);
		
	}
		@Override
		public void start(Stage primaryStage) throws Exception {
			
	
		Automobile myCar = new Automobile("Acura","NSX","Black", 2016,573,3.5);
		Automobile hisCar = new Automobile("Audi","R8","Silver",2016,450,3.8);
		Automobile herCar = new Automobile("Buggatti","Veron","Blue",2015,700,6.0);
		
		String title = "Build your car";
			
		Alert carsCarsCars = new Alert(AlertType.INFORMATION);
		carsCarsCars.setHeaderText("Is my car like everyone elses?");
		carsCarsCars.setTitle("Comparisons");
		carsCarsCars.setContentText("My car is the same as his car: " + myCar.equals(hisCar) + "\n"
				+ "My car is the same as her car: " + myCar.equals(herCar) + "\nCurrent Count: " + Automobile.getCount());
		carsCarsCars.showAndWait();
			
		TextInputDialog dreamMakeDialog = new TextInputDialog();
		dreamMakeDialog.setTitle(title);
		dreamMakeDialog.setHeaderText("What is your dream car?" + "\nCurrent Count: " + Automobile.getCount());
		dreamMakeDialog.setContentText("The make is: ");
		Optional<String> dreamMakeO = dreamMakeDialog.showAndWait();
		String dreamMake = dreamMakeO.get();
			
		TextInputDialog dreamModelDialog = new TextInputDialog();
		dreamModelDialog.setTitle(title);
		dreamModelDialog.setHeaderText("What is your dream car?" + "\nCurrent Count: " + Automobile.getCount());
		dreamModelDialog.setContentText("The model is: ");
		Optional<String> dreamModelO = dreamModelDialog.showAndWait();
		String dreamModel = dreamModelO.get();
			
		TextInputDialog dreamColorDialog = new TextInputDialog();
		dreamColorDialog.setTitle(title);
		dreamColorDialog.setHeaderText("What is your dream car?" + "\nCurrent Count: " + Automobile.getCount());
		dreamColorDialog.setContentText("The color is: ");
		Optional<String> dreamColorO = dreamColorDialog.showAndWait();
		String dreamColor = dreamColorO.get();
			
		TextInputDialog dreamYearDialog = new TextInputDialog();
		dreamYearDialog.setTitle(title);
		dreamYearDialog.setHeaderText("What is your dream car?" + "\nCurrent Count: " + Automobile.getCount());
		dreamYearDialog.setContentText("The year is: ");
		Optional<String> dreamYearO = dreamYearDialog.showAndWait();
		
		int dreamYear = Integer.parseInt(dreamYearO.get());
			
		TextInputDialog dreamHPDialog = new TextInputDialog();
		dreamHPDialog.setTitle(title);
		dreamHPDialog.setHeaderText("What is your dream car?" + "\nCurrent Count: " + Automobile.getCount());
		dreamHPDialog.setContentText("The horsepower is: ");
		Optional<String> dreamHPO = dreamHPDialog.showAndWait();
			
		int dreamHP = Integer.parseInt(dreamHPO.get());
			
		TextInputDialog dreamEngineDialog = new TextInputDialog();
		dreamEngineDialog.setTitle(title);
		dreamEngineDialog.setHeaderText("What is your dream car?" + "\nCurrent Count: " + Automobile.getCount());
		dreamEngineDialog.setContentText("The engine size (in liters) is: ");
		Optional<String> dreamEngineO = dreamEngineDialog.showAndWait();
			
		double dreamEngine = Double.parseDouble(dreamEngineO.get());
			
		Automobile dreamCar = new Automobile(dreamMake,dreamModel,dreamColor,dreamYear,dreamHP,dreamEngine);
			
		Alert dreamAlert = new Alert(AlertType.INFORMATION);
		dreamAlert.setTitle(title);
		dreamAlert.setHeaderText("Your dream car is:" + "\nCurrent Count: " + Automobile.getCount());
		dreamAlert.setContentText(dreamCar + "");
		dreamAlert.showAndWait();
			
		Automobile fakeCar = new Automobile(dreamMake,dreamModel,dreamColor,dreamYear,dreamHP,dreamEngine);
		
		Alert fakeAlert = new Alert(AlertType.INFORMATION);
		fakeAlert.setTitle("Another Comparison");
		fakeAlert.setHeaderText("Is your dream car the same as car X?" + "\nCurrent Count: " + Automobile.getCount());
		fakeAlert.setContentText("" + dreamCar.equals(fakeCar));
		fakeAlert.showAndWait();
			
			
			
		System.out.println(fakeCar + "\n" + fakeCar.equals(dreamCar));
		
		
		}
		
		
}
