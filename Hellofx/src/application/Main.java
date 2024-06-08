package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));

        // Labels
        Label buttonLabel = new Label("Button:");
        Label checkBoxLabel = new Label("CheckBox:");
        Label hyperlinkLabel = new Label("Hyperlink:");
        Label toggleButtonLabel = new Label("ToggleButton:");
        Label radioButtonLabel = new Label("RadioButton:");
        Label labelLabel = new Label("Label:");
        Label textFieldLabel = new Label("TextField:");
        Label passwordFieldLabel = new Label("PasswordField:");
        Label textAreaLabel = new Label("TextArea:");
        Label progressIndicatorLabel = new Label("ProgressIndicator:");
        Label progressBarLabel = new Label("ProgressBar:");
        Label sliderLabel = new Label("Slider:");

        // Controls
        Button button = new Button("Button");
        CheckBox checkBox = new CheckBox("CheckBox");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        RadioButton radioButton = new RadioButton("RadioButton");
        Label label = new Label("Label");
        TextField textField = new TextField();
        textField.setPromptText("some text...");
        PasswordField passwordField = new PasswordField();
        TextArea textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setText("This is very long text that will wrap to\nseveral lines.");
        ProgressBar progressBar = new ProgressBar(0.49);
        ProgressIndicator progressIndicator = new ProgressIndicator(0.49);
        Slider slider = new Slider(0, 100, 49);

        // Layout
        root.add(buttonLabel, 0, 0);
        root.add(button, 1, 0);
        root.add(checkBoxLabel, 0, 1);
        root.add(checkBox, 1, 1);
        root.add(hyperlinkLabel, 0, 2);
        root.add(hyperlink, 1, 2);
        root.add(toggleButtonLabel, 0, 3);
        root.add(toggleButton, 1, 3);
        root.add(radioButtonLabel, 0, 4);
        root.add(radioButton, 1, 4);
        root.add(labelLabel, 0, 5);
        root.add(label, 1, 5);
        root.add(textFieldLabel, 0, 6);
        root.add(textField, 1, 6);
        root.add(passwordFieldLabel, 0, 7);
        root.add(passwordField, 1, 7);
        root.add(textAreaLabel, 0, 8);
        root.add(textArea, 1, 8);
        root.add(progressIndicatorLabel, 0, 9);
        root.add(progressIndicator, 1, 9);
        root.add(progressBarLabel, 0, 10);
        root.add(progressBar, 1, 10);
        root.add(sliderLabel, 0, 11);
        HBox sliderHBox = new HBox(slider);
        sliderHBox.setAlignment(Pos.CENTER_LEFT);
        root.add(sliderHBox, 1, 11);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("All Controls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}