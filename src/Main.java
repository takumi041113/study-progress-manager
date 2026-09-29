import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override 
    public void start(Stage stage) {
        
        Label label = new Label("Study Progress Manager");

        StackPane root = new StackPane(label);

        Scene scene = new Scene(root, 800, 500);

        stage.setTitle("学習進捗管理アプリ");
        stage.setScene(scene);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}