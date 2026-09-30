package com.example.studyprogress.controller;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

// ログイン画面の処理
public class LoginController {

    public void login(TextField userField,PasswordField passwordField) {

        //入力された文字を取得
        String username = userField.getText();
        String password = passwordField.getText();

        System.out.println("ユーザー名：" + username);
        System.out.println("パスワード：" + password);

    }
    
}
