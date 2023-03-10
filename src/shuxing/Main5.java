package shuxing;


/**
 * Created by Administrator on 2018/6/22 0022.
 * 下面这些javafx.*下面的API都是JDK8、JRE8中内置好的，直接调用即可
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// from =>w  WW . y II B AI.c O  M

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main5 extends Application {

    @Override
    public void start(Stage stage) {
        VBox box = new VBox();
        final Scene scene = new Scene(box, 300, 250);
        scene.setFill(null);
        Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.RED) };
        LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

        Rectangle r1 = new Rectangle(0, 0, 100, 100);
        r1.setFill(lg1);

        box.getChildren().add(r1);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_gradient_color.html

