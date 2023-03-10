package pannel;


/**
 * Created by Administrator on 2018/6/22 0022.
 * 下面这些javafx.*下面的API都是JDK8、JRE8中内置好的，直接调用即可
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// from =>w  WW . y II B AI.c O  M


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main5 extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextArea myTextArea = new TextArea();
        VBox hbox = new VBox();// from  W w W . y  i ib  Ai .c  o  M
        hbox.getChildren().add(myTextArea);
        VBox.setVgrow(myTextArea, Priority.ALWAYS);

        Scene scene = new Scene(hbox, 320, 112, Color.rgb(0, 0, 0, 0));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_vbox.html

