package pannel;


/**
 * Created by Administrator on 2018/6/22 0022.
 * 下面这些javafx.*下面的API都是JDK8、JRE8中内置好的，直接调用即可
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// from =>w  WW . y II B AI.c O  M

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main6 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BorderPane Test");
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10, 20, 10, 20));

        Button btnTop = new Button("Top");
        bp.setTop(btnTop);

        Button btnLeft = new Button("Left");
        bp.setLeft(btnLeft);

        Button btnCenter = new Button("Center");
        bp.setCenter(btnCenter);

        Button btnRight = new Button("Right");
        bp.setRight(btnRight);

        Button btnBottom = new Button("Bottom");
        bp.setBottom(btnBottom);

        Scene scene = new Scene(bp, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_borderpane.html

