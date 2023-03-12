package SceneBuilder;



import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *  demo 初阶版
 */
public class Demo23 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label usernameLabel = new Label("账号:");
        usernameLabel.setFont(new Font(14));
        TextField username = new TextField();
        username.setUserData("root");

        Label passwordLabel = new Label("密码:");
        passwordLabel.setFont(new Font(14));
        PasswordField password = new PasswordField();
        password.setUserData("root");

        Button clearButton = new Button("清除");
        Button loginButton = new Button("登录");

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: #FFF5EE");
        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(username, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(password, 1, 1);
        gridPane.add(clearButton, 0, 2);
        gridPane.add(loginButton, 1, 2);

        gridPane.setHgap(5);
        gridPane.setVgap(15);
        gridPane.setAlignment(Pos.CENTER);
        GridPane.setMargin(loginButton, new Insets(0, 0, 0, 120));


        Scene scene = new Scene(gridPane);
//        primaryStage.getIcons().add(new Image("icon/tf_logo.png"));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tools Platform");
        primaryStage.setWidth(512);
        primaryStage.setHeight(512);
        primaryStage.setResizable(false);
        primaryStage.show();

        clearButton.setOnAction(event -> {
            username.clear();
            password.clear();
        });

        loginButton.setOnAction(event -> {
            if (null != username.getText() && username.getText().equals(username.getUserData())
                    && null != password.getText() && password.getText().equals(password.getUserData())) {
                System.out.println("login success");
                primaryStage.close();
                new MainWindow(username.getText(), password.getText());
            } else {
                System.out.println("login error");

                usernameLabel.setTextFill(Color.RED);
                passwordLabel.setTextFill(Color.RED);

                primaryStage.setTitle("login error");
                // 闪烁
                FadeTransition fadeTransition = new FadeTransition();
                fadeTransition.setDuration(Duration.millis(300));
                fadeTransition.setNode(gridPane);
                fadeTransition.setFromValue(0);
                fadeTransition.setToValue(1);
                fadeTransition.play();
            }
        });
    }

}

class MainWindow {
    private final Stage stage = new Stage();

    private String username;

    private String password;

    public MainWindow(String username, String password) {
        this.username = username;
        this.password = password;

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: #FFF5EE");
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.setTitle("Tools Platform");
        stage.getIcons().add(new Image("icon/logo.png"));
        stage.setWidth(1024);
        stage.setHeight(600);
        stage.setResizable(false);
        stage.show();
    }

}