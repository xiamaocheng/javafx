package UI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

public class Main14 extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 260, 80);
        stage.setScene(scene);

        Group g = new Group();

        ProgressIndicator p1 = new ProgressIndicator();


        g.getChildren().add(p1);

        scene.setRoot(g);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_progressindicator.html

