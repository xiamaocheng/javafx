package xingzhuang;


/**
 * Created by Administrator on 2018/6/22 0022.
 * 下面这些javafx.*下面的API都是JDK8、JRE8中内置好的，直接调用即可
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
// from =>w  WW . y II B AI.c O  M
public class Main3 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text Fonts");

        Group g = new Group();
        Scene scene = new Scene(g, 550, 250,Color.web("0x0000FF",1.0));

        Arc arc = new Arc();
        arc.setCenterX(50.0f);
        arc.setCenterY(50.0f);
        arc.setRadiusX(25.0f);
        arc.setRadiusY(25.0f);
        arc.setStartAngle(45.0f);
        arc.setLength(270.0f);
        arc.setType(ArcType.ROUND);

        g.getChildren().add(arc);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_circle_arc.html

