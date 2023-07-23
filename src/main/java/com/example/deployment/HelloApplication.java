package com.example.deployment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
//        stage.setTitle("Client");
//        stage.setScene(scene);
//        stage.show();

        // Start Server
        Server server = new Server();
        server.start(new Stage());

        // Start Client
        Client client = new Client();
        client.start(new Stage());
    }

    public static void main(String[] args) {
        launch();
    }
}