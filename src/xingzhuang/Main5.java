package xingzhuang;


/**
 * Created by Administrator on 2018/6/22 0022.
 * 下面这些javafx.*下面的API都是JDK8、JRE8中内置好的，直接调用即可
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

// @ w  w w .Y I I b A i. CO M
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Main5 extends Application {
    // create w  w  W. y II  b Ai .c  o M
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 260, 80);
        stage.setScene(scene);

        Group g = new Group();

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                0.0, 0.0,
                20.0, 10.0,
                10.0, 20.0 });

        g.getChildren().add(polygon);

        scene.setRoot(g);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_polygon_polyline.html

