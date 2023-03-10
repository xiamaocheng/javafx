package xingzhuang;




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
// @ W W w . y IIB  A I.C  o M
public class Main6 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Text");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);
        int x = 100;
        int y = 100;
        int red = 30;
        int green = 40;
        int blue = 50;

        Text text = new Text(x, y, "JavaFX 2.0");

        text.setFill(Color.rgb(red, green, blue, .99));
        text.setRotate(60);
        root.getChildren().add(text);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_text.html

