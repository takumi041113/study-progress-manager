// JavaFXアプリを起動
package com.example.studyprogress;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// JavaFXアプリを起動するクラス
public class Main extends Application {

    @Override 
    public void start(Stage stage) {
        
        Label userLabel = new Label("ユーザー名");
        TextField userField = new TextField();

        Label passwordLabel = new Label("パスワード");
        PasswordField passwordField = new PasswordField();

        Button loginButton = new Button("ログイン");

        VBox root = new VBox(
            10,
            userLabel,
            userField,
            passwordLabel,
            passwordField,
            loginButton
        );

        Scene scene = new Scene(root, 500, 400);

        stage.setTitle("教育進捗管理アプリ");
        stage.setScene(scene);
        stage.show();
        
    }

    // Javaプログラムの開始地点
    public static void main(String[] args) {
        launch(args);
    }
}