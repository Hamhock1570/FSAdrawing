package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import java.io.File.*;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.io.File;
public class Main extends Application{
    private Stage primaryStage;
    private Scene mainScene;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        File fsaResourceFile = chooseFile(primaryStage); // get the file to read the FSA from

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("FSA Drawing Program");
        primaryStage.setScene(new Scene(root, 400, 320));
        primaryStage.show();
    }


    private static File chooseFile(Stage primaryStage){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        String currentDir = System.getProperty("user.dir") + File.separator;
         File file = new File(currentDir);
        fileChooser.setInitialDirectory(file);
        fileChooser.setInitialDirectory(file);
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("FSA Files", "*.fsa"),
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("All Files", "*.*")
        );
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        if (selectedFile != null){
            //
        }
        else {
            System.out.println("Error! "+ selectedFile.getName() +" is not a file. Closing program...");
            System.exit(0);
        }
        System.out.println("opening : "+ selectedFile.getAbsolutePath());
        return selectedFile;
    }

} // end of main class