package xingzhuang;


/**
 * Created by Administrator on 2018/6/22 0022.
 * 下面这些javafx.*下面的API都是JDK8、JRE8中内置好的，直接调用即可
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Java作为GUI(图形化用户界面)程序
 * 1、入口必须继承Application抽象类
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

// => W w W.y I  I b Ai .c O  M
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Lines");

        Group root = new Group();
        Scene scene = new Scene(root, 300, 150, Color.GRAY);

        Line redLine = new Line(10, 10, 200, 10);

        redLine.setStroke(Color.RED);
        redLine.setStrokeWidth(10);
        redLine.setStrokeLineCap(StrokeLineCap.BUTT);

        redLine.getStrokeDashArray().addAll(15d, 5d, 15d, 15d, 20d);
        redLine.setStrokeDashOffset(10);

        root.getChildren().add(redLine);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_line.html



