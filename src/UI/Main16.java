package UI;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;

/*  w  ww. j  a v  a 2  s. c om*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main16 extends Application {
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

