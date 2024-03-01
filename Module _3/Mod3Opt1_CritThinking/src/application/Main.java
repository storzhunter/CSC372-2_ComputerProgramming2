package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main extends Application {

    private TextArea textArea;

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 300);

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem printDateTimeItem = new MenuItem("Print Date/Time");
        MenuItem writeToFileItem = new MenuItem("Write to File");
        MenuItem changeBackgroundColorItem = new MenuItem("Change Background Color");
        MenuItem exitItem = new MenuItem("Exit");

        fileMenu.getItems().addAll(printDateTimeItem, writeToFileItem, changeBackgroundColorItem, new SeparatorMenuItem(), exitItem);
        menuBar.getMenus().add(fileMenu);

        printDateTimeItem.setOnAction(e -> printDateTime());
        writeToFileItem.setOnAction(e -> writeToFile());
        changeBackgroundColorItem.setOnAction(e -> changeBackgroundColor(root));
        exitItem.setOnAction(e -> primaryStage.close());

        textArea = new TextArea();
        root.setTop(menuBar);
        root.setCenter(textArea);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Menu Example");
        primaryStage.show();
    }

    private void printDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        textArea.appendText("Current Date/Time: " + formattedDateTime + "\n");
    }

    private void writeToFile() {
        String content = textArea.getText();
        try {
            FileWriter writer = new FileWriter("log.txt");
            writer.write(content);
            writer.close();
            textArea.appendText("Content written to log.txt\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void changeBackgroundColor(BorderPane root) {
    	Random rand = new Random();
        double hue = rand.nextDouble() * 120; // Generating random hue value in the green color range
        Color color = Color.hsb(hue, 1, 1);
        
        BackgroundFill backgroundFill = new BackgroundFill(color, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY);
        Background background = new Background(backgroundFill);
        root.setBackground(background);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

