import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class JavaFXTemplate extends Application {


    @Override
    public void start(Stage primaryStage) {
        Xxx root = .....;
        root.getChildren().add();
        root.getChildren().add();
        root.getChildren().addAll(...,...);

        Scene scene = new Scene(root, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello FX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}