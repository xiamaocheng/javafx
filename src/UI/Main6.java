package UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main6 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(20);
        Scene scene = new Scene(vbox, 400, 400);
        stage.setScene(scene);

        DatePicker checkInDatePicker = new DatePicker();

        vbox.getChildren().add(checkInDatePicker);

        stage.show();
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_datepicker.html

