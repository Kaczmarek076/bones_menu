package org.example.bones_menu;

import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane bonesMenu = new AnchorPane();
        GridPane menu = new GridPane();
        Scene scene = new Scene(bonesMenu, 500, 500);
        Label label = new Label();

        stage.setTitle("Bones!");
        stage.setScene(scene);
        stage.show();
        Label titel1 = new Label("Menu");


        // Gridpane
        menu.setHgap(7);
        menu.setVgap(15);

        bonesMenu.getChildren().addAll(menu);

    }
}
    }
            }
