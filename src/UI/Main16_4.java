package UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.time.LocalDate;

/*  w  ww. j  a v  a 2  s. c om*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Main16_4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(20);
        Scene scene = new Scene(vbox, 400, 400);
        stage.setScene(scene);
        final DatePicker startDatePicker = new DatePicker();
        DatePicker endDatePicker = new DatePicker();
        startDatePicker.setValue(LocalDate.now());
        final Callback<DatePicker, DateCell> dayCellFactory = new Callback<DatePicker, DateCell>() {
            @Override
            public DateCell call(final DatePicker datePicker) {
                return new DateCell() {
                    @Override
                    public void updateItem(LocalDate item, boolean empty) {
                        super.updateItem(item, empty);

                        long p = ChronoUnit.DAYS.between(startDatePicker.getValue(), item);
                        setTooltip(new Tooltip("You're about to stay for " + p + " days"));
                    }
                };
            }
        };
        endDatePicker.setDayCellFactory(dayCellFactory);
        endDatePicker.setValue(startDatePicker.getValue().plusDays(1));
        vbox.getChildren().add(new Label("Start Date:"));
        vbox.getChildren().add(startDatePicker);
        vbox.getChildren().add(new Label("End Date:"));
        vbox.getChildren().add(endDatePicker);
        stage.show();
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_datepicker.html

