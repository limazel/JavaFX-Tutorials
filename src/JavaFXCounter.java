import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class JavaFXCounter extends Application {
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    @Override
    public void start(Stage primaryStage) {

        tfCount = new TextField("0");
        tfCount.setEditable(false);

        btnCount = new Button("Count");
        btnCount.setOnAction(event -> tfCount.setText(++count + ""));

        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(15, 12, 15, 12));
        flow.setVgap(10);
        flow.setHgap(10);
        flow.setAlignment(Pos.CENTER);
        flow.getChildren().addAll(new Label("Count:"), tfCount, btnCount);

        primaryStage.setScene(new Scene(flow, 400, 80));
        primaryStage.setTitle("JavaFX Counter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}