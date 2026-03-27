module org.example.bones_menu {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.bones_menu to javafx.fxml;
    exports org.example.bones_menu;
}