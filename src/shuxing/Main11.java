package shuxing;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
// by w Ww .YI  iB A I .C  o M
public class Main11 extends Application {
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

