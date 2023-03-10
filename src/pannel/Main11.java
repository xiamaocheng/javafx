package pannel;


/**
 * Created by Administrator on 2018/6/22 0022.
 * 下面这些javafx.*下面的API都是JDK8、JRE8中内置好的，直接调用即可
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// from =>w  WW . y II B AI.c O  M

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

public class Main11 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group g = new Group();
        Scene scene = new Scene(g, 550, 250);

        TitledPane t1 = new TitledPane("T1", new Button("B1"));
        TitledPane t2 = new TitledPane("T2", new Button("B2"));
        TitledPane t3 = new TitledPane("T3", new Button("B3"));
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(t1, t2, t3);
// from  ww W. y  I I ba  I . c  O  M
        g.getChildren().add(accordion);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

//更多请阅读：https://www.yiibai.com/javafx/javafx_accordion.html

