package ieslosmontecillos.di_t1a1_ej2_3_amayaalejandro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloWorld extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Crea el objeto boton
        Button bt = new Button();

        //Inserta el texto del boton
        bt.setText("Hello World");

        //Programa una accion de mostrar texto
        bt.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });

        //Crea un nodo
        StackPane root = new StackPane();
        //Añade el boton al nodo
        root.getChildren().add(bt);

        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}