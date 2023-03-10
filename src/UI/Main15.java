package UI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.stage.Stage;
/*  w  ww. j  a v  a 2  s. c om*/
public class Main15 extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 200);
        stage.setScene(scene);

        ScrollBar s1 = new ScrollBar();
        s1.setMax(500);
        s1.setMin(0);
        s1.setValue(100);
        s1.setUnitIncrement(30);
        s1.setBlockIncrement(35);

        s1.setOrientation(Orientation.VERTICAL);

        root.getChildren().add(s1);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_scrollbar.html


