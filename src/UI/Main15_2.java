package UI;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;

/*  w  ww. j  a v  a 2  s. c om*/
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;

public class Main15_2 extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 200);
        stage.setScene(scene);

        ScrollBar s1 = new ScrollBar();

        s1.valueProperty().addListener((ObservableValue<? extends Number> ov,
                                        Number old_val, Number new_val) -> {
            System.out.println(-new_val.doubleValue());
        });
        root.getChildren().add(s1);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_scrollbar.html



